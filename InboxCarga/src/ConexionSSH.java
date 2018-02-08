import java.util.Properties;
	 
	import com.jcraft.jsch.ChannelExec;
	import com.jcraft.jsch.JSch;
	import com.jcraft.jsch.Session;
	
public class ConexionSSH {

	 
		public static void main(String pUser, String pPass, String pHost,
				int pPort, String pComando) throws Exception {
			JSch ssh = new JSch();
			// Instancio el objeto session para la transferencia
			Session session = null;
			// instancio el canal sftp
			ChannelExec channelssh = null;
			try {
				// Inciciamos el JSch con el usuario, host y puerto
				session = ssh.getSession(pUser, pHost, pPort);
				// Seteamos el password
				session.setPassword(pPass);
				// El SFTP requiere un intercambio de claves
				// con esta propiedad le decimos que acepte la clave
				// sin pedir confirmación
				Properties prop = new Properties();
				prop.put("StrictHostKeyChecking", "no");
				session.setConfig(prop);
				session.connect();
	 
				// Abrimos el canal de sftp y conectamos
				channelssh = (ChannelExec) session.openChannel("exec");
				// seteamos el comando a ejecutar
				channelssh.setCommand(pComando);
				// conectar y ejecutar
				channelssh.connect();
			} catch (Exception e) {
				throw new Exception(e);
			} finally {
				// Cerramos el canal y session
				if (channelssh.isConnected())
					channelssh.disconnect();
				if (session.isConnected())
					session.disconnect();
			}// end try
		}// EjecutarSSH
}
