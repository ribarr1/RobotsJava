package com.greensqa.ctifcarga.ral;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.*;
import com.greensqa.ctifcarga.util.SSHConnector;
import com.jcraft.jsch.JSchException;

public class ArchivoMovCierreContableRal {
	
	public static void main(String[] arg) throws SQLException, IOException, IllegalAccessException, JSchException {
		System.out.println("Generacion de Archivo Mov Cierre Contable");
		SSHConnector sshConnector = new SSHConnector();
        sshConnector.connect();
		
		
		String nombrearchivo = arg[1]+"11"+arg[2]+"CIC11.dat";
				
			String result;
			Random rnd = new Random();
			Catalogos dato = new Catalogos();
			MOV_CIERRE_CONTABLE  registro = new MOV_CIERRE_CONTABLE ();
			registro.setId_tanda(arg[0]);
			registro.setCod_entidad(arg[1]);
			   int i = 1;
			   result = sshConnector.executeCommand("echo \""+arg[4]+"||"+arg[0]+"||"+arg[2]+"||"+arg[3]+"||"+0+"\" >> "+arg[5]+nombrearchivo);
			   while (i <= Integer.valueOf(arg[3])) {
				    i++; 	
				  	registro.setCod_legado(dato.getCod_Legado(registro.getCod_entidad()));
				    registro.setFec_creacion(Date.valueOf("2018-01-16"));
				    registro.setFecha_cierre_contable(Date.valueOf("2018-01-16"));
				    registro.setId_fila_origen_legado(String.valueOf(10 + (rnd.nextInt(99 + 1) - 10)));
				    result = sshConnector.executeCommand("echo \""+registro.getCod_entidad()+"||"+registro.getCod_legado()+"||"+registro.getId_tanda()+"||"+registro.getFecha_cierre_contable()+"||"+registro.getId_fila_origen_legado()+"||"+"\" >> "+arg[5]+nombrearchivo);
					
		}
			   
			   sshConnector.disconnect();
		}

}
