import com.jcraft.jsch.JSchException;

import java.io.BufferedInputStream;
import java.io.IOException;

import org.omg.CORBA.portable.InputStream;
public class SSHConnection {
	private static final String USERNAME = "ctif_integracion";
    private static final String HOST = "10.130.9.56";
    private static final int PORT = 22;
    private static final String PASSWORD = "1nt3gr4c10n";
    
  //private static final String USERNAME = "ribarra";
    //private static final String HOST = "10.32.14.198";
  //private static final String PASSWORD = "pericos2";
    public static void main(String[] args) {
 
        try {
        	
     	
            SSHConnector sshConnector = new SSHConnector();
             
             
            sshConnector.connect(USERNAME, PASSWORD, HOST, PORT);
            
            //String[] command = {"sh","-c","bzip2 -dc *.tar.bz2 | tar -x"};

            //Runtime.getRuntime().exec ("bzip2 -dc *.tar.bz2 | tar -x")
          //  String command = "sh -c sh /ctiftecnico/ctif_integracion/inbox_planos/xProcesar/ValidaCarga2.sh";
           String result = sshConnector.executeCommand("cd /ctiftecnico/ctif_integracion/inbox_planos/xProcesar && whoami && pwd && ls -ltr Valida* && source ~/.profile && sh ValidaCarga.sh");
            //String result = sshConnector.executeCommand("cd /ctiftecnico/ctif_integracion/inbox_planos/xProcesar; sh ValidaCarga2.sh; ls -ltr");
            //String result = sshConnector.executeCommand("ls /home/ribarra");
            System.out.println(result);
            //result = sshConnector.executeCommand("cd /ctiftecnico/ctif_integracion/inbox_planos/xProcesar && ls");        
           //System.out.println(result);
            
            sshConnector.disconnect();
             
            //System.out.println(result);
        } catch (JSchException ex) {
            ex.printStackTrace();
             
            System.out.println(ex.getMessage());
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
             
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
             
            System.out.println(ex.getMessage());
        }
    }
}
