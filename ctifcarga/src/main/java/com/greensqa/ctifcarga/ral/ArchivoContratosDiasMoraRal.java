package com.greensqa.ctifcarga.ral;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

import com.greensqa.ctifcarga.ral.dto.MAE_CONTRATOS_DIAS_MORA;
import com.greensqa.ctifcarga.util.SSHConnector;
import com.jcraft.jsch.JSchException;

public class ArchivoContratosDiasMoraRal {
	
	public static void main(String[] arg) throws SQLException, IOException, IllegalAccessException, JSchException {
		System.out.println("Generacion de Archivo Contratos Dias Mora");
		SSHConnector sshConnector = new SSHConnector();
        sshConnector.connect();
		
		
		String nombrearchivo = arg[1]+"11"+arg[2]+"CMD11.dat";
				
			String result;
			Random rnd = new Random();
			Catalogos dato = new Catalogos();
			MAE_CONTRATOS_DIAS_MORA  registro = new MAE_CONTRATOS_DIAS_MORA ();
			registro.setId_tanda(arg[0]);
			registro.setCod_entidad(arg[1]);
			   int i = 1;
			   result = sshConnector.executeCommand("echo \""+arg[4]+"||"+arg[0]+"||"+arg[2]+"||"+arg[3]+"||"+0+"\" >> "+arg[5]+nombrearchivo);
			   while (i <= Integer.valueOf(arg[3])) {
				    i++; 	
				   
					registro.setCod_legado(dato.getCod_Legado(registro.getCod_entidad()));
				    registro.setNum_contrato(String.valueOf(1000000 + (rnd.nextInt(9999999 + 1) - 1000000)));
				    registro.setCod_grupo_concepto(String.valueOf(1 + (rnd.nextInt(999 + 1) - 1))); //verificar
				    registro.setDias_mora(1 + (rnd.nextInt(99999 + 1) - 1));
				    registro.setNum_cuotas_vencidas(1 + (rnd.nextInt(99999 + 1) - 1));
				    registro.setId_fila_origen_legado(String.valueOf(10 + (rnd.nextInt(99 + 1) - 10)));
				    result = sshConnector.executeCommand("echo \""+registro.getCod_entidad()+"||"+registro.getCod_legado()+"||"+registro.getId_tanda()+"||"+registro.getNum_contrato()+"||"+registro.getCod_grupo_concepto()+"||"+registro.getDias_mora()+"||"+registro.getNum_cuotas_vencidas()+"||"+registro.getId_fila_origen_legado()+"||"+"\" >> "+arg[5]+nombrearchivo);
					
					
		            
		}
			   sshConnector.disconnect();
		}

}
