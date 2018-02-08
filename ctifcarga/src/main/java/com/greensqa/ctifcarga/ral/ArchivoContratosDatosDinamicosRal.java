package com.greensqa.ctifcarga.ral;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Random;

import com.greensqa.ctifcarga.ral.dto.MAE_CONTRATOS_DATOS_DINAMICOS;
import com.greensqa.ctifcarga.util.SSHConnector;
import com.jcraft.jsch.JSchException;

public class ArchivoContratosDatosDinamicosRal {
	
	public static void main(String[] arg) throws SQLException, IOException, IllegalAccessException, JSchException {
		System.out.println("Generacion de Archivo Contratos Datos Dinamicos");
		SSHConnector sshConnector = new SSHConnector();
        sshConnector.connect();
		
		
		String nombrearchivo = arg[1]+"11"+arg[2]+"CDD11.dat";

			String result;
			Random rnd = new Random();
			Catalogos dato = new Catalogos();
			Restricciones restriccion = new Restricciones();
			MAE_CONTRATOS_DATOS_DINAMICOS  registro = new MAE_CONTRATOS_DATOS_DINAMICOS ();
			registro.setId_tanda(arg[0]);
			registro.setCod_entidad(arg[1]);
			   int i = 1;
			   result = sshConnector.executeCommand("echo \""+arg[4]+"||"+arg[0]+"||"+arg[2]+"||"+arg[3]+"||"+0+"\" >> "+arg[5]+nombrearchivo);
			   while (i <= Integer.valueOf(arg[3])) {
				    i++; 	
				    
					registro.setCod_legado(dato.getCod_Legado(registro.getCod_entidad()));
				    registro.setNum_contrato(String.valueOf(1000000 + (rnd.nextInt(9999999 + 1) - 1000000)));
				    registro.setTasa_corriente_ea(1 + (rnd.nextInt(999 + 1) - 1));
				    registro.setTasa_mora_ea(1 + (rnd.nextInt(999 + 1) - 1));
				    registro.setEstado_causacion(restriccion.getEstadoCausacion());
				    registro.setId_fila_origen_legado(String.valueOf(10 + (rnd.nextInt(99 + 1) - 10)));
				   	result = sshConnector.executeCommand("echo \""+registro.getCod_entidad()+"||"+registro.getCod_legado()+"||"+registro.getId_tanda()+"||"+registro.getNum_contrato()+"||"+registro.getTasa_corriente_ea()+"||"+registro.getTasa_mora_ea()+"||"+registro.getEstado_causacion()+"||"+registro.getId_fila_origen_legado()+"||"+"\" >> "+arg[5]+nombrearchivo);
							             
		}
			   sshConnector.disconnect();
		}

}