package com.greensqa.ctifcarga.ral;

import java.io.IOException;
import java.sql.SQLException;
import com.greensqa.ctifcarga.util.*;
import com.jcraft.jsch.JSchException;

public class ArchivoControlRal {
	public static void main(String[] arg ) throws SQLException, IOException, IllegalAccessException, JSchException {
		System.out.println("Generacion de Archivo de Control");

					String ext, ent;
					SSHConnector sshConnector = new SSHConnector();
					sshConnector.connect();
					String nombrearchivo = arg[1]+arg[2]+"Control.ctr";
					String result = sshConnector.executeCommand("ls "+arg[5]);
		            String arr[] = result.split("\n");
		            for (int i=0; i < arr.length;i++) {
											
						ext = arr[i].substring(arr[i].length() -3, arr[i].length());
						ent = arr[i].substring(0,4);
					
						if(ext.equals("dat") && ent.equals(arg[1])) {  
							
							result = sshConnector.executeCommand("echo "+arr[i]+" >> "+arg[5]+nombrearchivo);
							
						}	
				}
		            sshConnector.disconnect();
			   
	
}
}
