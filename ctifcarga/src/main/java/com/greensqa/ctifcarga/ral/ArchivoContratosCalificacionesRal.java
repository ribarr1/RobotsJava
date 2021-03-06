package com.greensqa.ctifcarga.ral;


import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.MAE_CONTRATOS_CALIFICACIONES;
import com.greensqa.ctifcarga.util.SSHConnector;
import com.jcraft.jsch.JSchException;

public class ArchivoContratosCalificacionesRal {
	
	public static void main(String[] arg) throws SQLException, IOException, IllegalAccessException, JSchException {
		System.out.println("Generacion de Archivo Contratos Calificaciones");
		SSHConnector sshConnector = new SSHConnector();
        sshConnector.connect();
		
		
		String nombrearchivo = arg[1]+"11"+arg[2]+"COC11.dat";
			String result;
			Random rnd = new Random();
			Catalogos dato = new Catalogos();
			Restricciones restriccion = new Restricciones();
			 MAE_CONTRATOS_CALIFICACIONES  registro = new MAE_CONTRATOS_CALIFICACIONES ();
			 registro.setId_tanda(arg[0]);
			registro.setCod_entidad(arg[1]);
			registro.setId_tanda(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
			   int i = 1;
			result = sshConnector.executeCommand("echo \""+arg[4]+"||"+arg[0]+"||"+arg[2]+"||"+arg[3]+"||"+0+"\" >> "+arg[5]+nombrearchivo);
			while (i <= Integer.valueOf(arg[3])) {
				 
				    i++; 	
				    String entidad = dato.getCod_Entidad();
					
					registro.setCod_legado(dato.getCod_Legado(entidad));
				    registro.setCod_legado_fuente(dato.getCod_Legado(entidad));
				    registro.setNum_contrato(String.valueOf(1000000 + (rnd.nextInt(9999999 + 1) - 1000000)));
				    registro.setCod_calif_excepcional(dato.getCod_calificacion());
				    registro.setFuente_informacion(restriccion.getFuenteInformacion());
				    registro.setFec_corte_contbl(Date.valueOf("2018-01-16"));
				    registro.setId_fila_origen_legado(String.valueOf(10 + (rnd.nextInt(99 + 1) - 10)));
				    result = sshConnector.executeCommand("echo \""+registro.getCod_entidad()+"||"+registro.getCod_legado()+"||"+registro.getId_tanda()+"||"+registro.getCod_legado_fuente()+"||"+registro.getNum_contrato()+"||"+registro.getCod_calif_excepcional()+"||"+registro.getFuente_informacion()+"||"+registro.getFec_corte_contbl()+"||"+registro.getId_fila_origen_legado()+"||"+"\" >> "+arg[5]+nombrearchivo);
										
		          
		}
			sshConnector.disconnect();
		}

}
