package com.greensqa.ctifcarga.ral;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Random;

import com.greensqa.ctifcarga.ral.dto.MAE_CLIENTES_CALIFICACIONES;
import com.greensqa.ctifcarga.util.SSHConnector;
import com.jcraft.jsch.JSchException;

public class ArchivoClientesCalificacionesRal {
	
	public static void main(String[] arg) throws SQLException, IOException, IllegalAccessException, JSchException {
		System.out.println("Generacion de Archivo Clientes Calificaciones");
		SSHConnector sshConnector = new SSHConnector();
        sshConnector.connect();
		
		
		String nombrearchivo = arg[1]+"11"+arg[2]+"CLC11.dat";
				
			String result;
			Random rnd = new Random();
			Catalogos dato = new Catalogos();
			Restricciones restriccion = new Restricciones();
			MAE_CLIENTES_CALIFICACIONES registro = new MAE_CLIENTES_CALIFICACIONES();
			registro.setId_tanda(arg[0]);
			registro.setCod_entidad(arg[1]);
			   int i = 1;
			   result = sshConnector.executeCommand("echo \""+arg[4]+"||"+arg[0]+"||"+arg[2]+"||"+arg[3]+"||"+0+"\" >> "+arg[5]+nombrearchivo);
			   while (i <= Integer.valueOf(arg[3])) {
				 
				    i++; 	
				    
					
					registro.setCod_clase_cartera(dato.getCod_ClasesCarteras());
					registro.setCod_legado(dato.getCod_Legado(registro.getCod_entidad()));
					registro.setFec_corte_contbl(Date.valueOf("2018-01-16"));
					registro.setId_cliente(String.valueOf(1000 + (rnd.nextInt(9999 + 1) - 1000)));  //tablaClientes
					registro.setCod_calif_cliente(dato.getCod_calificacion());
					registro.setFuente_informacion(restriccion.getFuenteInformacion());
					registro.setCod_tipo_ident(Integer.valueOf(dato.getCod_TipoIdentificacion()));
					registro.setId_fila_origen_legado(String.valueOf(10 + (rnd.nextInt(99 + 1) - 10)));
					result = sshConnector.executeCommand("echo \""+registro.getCod_entidad()+"||"+registro.getCod_legado()+"||"+registro.getId_tanda()+"||"+registro.getCod_tipo_ident()+"||"+registro.getId_cliente()+"||"+registro.getCod_clase_cartera()+"||"+registro.getCod_calif_cliente()+"||"+registro.getFuente_informacion()+"||"+arg[6]+"||"+registro.getFec_corte_contbl()+"||"+registro.getId_fila_origen_legado()+"||"+"\" >> "+arg[5]+nombrearchivo);
					
					
			   }
			   sshConnector.disconnect();
		}
}


