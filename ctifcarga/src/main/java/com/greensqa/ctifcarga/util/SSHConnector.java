package com.greensqa.ctifcarga.util;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
public class SSHConnector {
	
	/**
     * Constante que representa un enter.
     */
    private static final String ENTER_KEY = "\n";
    /**
     * Sesi�n SSH establecida.
     */
    private Session session;
 
    
    public void connect()
        throws JSchException, IllegalAccessException, FileNotFoundException, IOException {
    	Properties parametros = new Properties();
    	parametros.load(new FileInputStream(
          "C:\\Users\\CarolinaLeal\\eclipse-workspace\\ctifcarga\\src\\main\\java\\com\\greensqa\\ctifcarga\\properties\\ParametrosIniciales.properties"));
    	String username = parametros.getProperty("username");
    	String password = parametros.getProperty("password");
    	String host = parametros.getProperty("host");
   
    	//String username = "ribarra", password = "pericos2" , host="10.32.14.198"; 
    	//String username = "ctif_integracion", password = "1nt3gr4c10n" , host="10.130.9.56";
    	int port=22;
        if (this.session == null || !this.session.isConnected()) {
            JSch jsch = new JSch();
 
            this.session = jsch.getSession(username, host, port);
            this.session.setPassword(password);
 
            // Parametro para no validar key de conexion.
            this.session.setConfig("StrictHostKeyChecking", "no");
 
            this.session.connect();
        } else {
            throw new IllegalAccessException("Sesion SSH ya iniciada.");
        }
    }
 
    /**
     * Ejecuta un comando SSH.
     *
     * @param command Comando SSH a ejecutar.
     *
     * @return
     *
     * @throws IllegalAccessException Excepci�n lanzada cuando no hay
     *                                conexi�n establecida.
     * @throws JSchException          Excepci�n lanzada por alg�n
     *                                error en la ejecuci�n del comando
     *                                SSH.
     * @throws IOException            Excepci�n al leer el texto arrojado
     *                                luego de la ejecuci�n del comando
     *                                SSH.
     */
    public final String executeCommand(String command)
        throws IllegalAccessException, JSchException, IOException {
        if (this.session != null && this.session.isConnected()) {
 
            // Abrimos un canal SSH. Es como abrir una consola.
            ChannelExec channelExec = (ChannelExec) this.session.
                openChannel("exec");
 
            InputStream in = channelExec.getInputStream();
 
            // Ejecutamos el comando.
            //System.out.println("ejecutando "+command);
            channelExec.setCommand(command);
            channelExec.connect();
 
            // Obtenemos el texto impreso en la consola.
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder builder = new StringBuilder();
            String linea;
 
            while ((linea = reader.readLine()) != null) {
                builder.append(linea);
                builder.append(ENTER_KEY);
            }
 
            // Cerramos el canal SSH.
            channelExec.disconnect();
 
            // Retornamos el texto impreso en la consola.
            return builder.toString();
        } else {
            throw new IllegalAccessException("No existe sesion SSH iniciada.");
        }
    }
 
    /**
     * Cierra la sesi�n SSH.
     */
    public final void disconnect() {
        this.session.disconnect();
    }

}
