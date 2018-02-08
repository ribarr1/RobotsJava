package com.greensqa.ctifcarga.ral;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.MAE_CLIENTES_ENTIDADES;
import com.greensqa.ctifcarga.util.SSHConnector;
import com.jcraft.jsch.JSchException;

public class ArchivoClientesEntidadesRal {
	
	public static void main(String[] arg) throws SQLException, IOException, IllegalAccessException, JSchException {
		System.out.println("Generacion de Archivo Clientes Entidades");
		
		SSHConnector sshConnector = new SSHConnector();
        sshConnector.connect();
        

		String nombrearchivo = arg[1]+"11"+arg[2]+"CLE11.dat";
		
			
		    String result;
			Random rnd = new Random();
			Catalogos dato = new Catalogos();
			Restricciones restriccion = new Restricciones();
			MAE_CLIENTES_ENTIDADES registro = new MAE_CLIENTES_ENTIDADES();
			//registro.setId_tanda(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
			registro.setId_tanda(arg[0]);
			registro.setCod_entidad(arg[1]);
			
			   int i = 1;
			   result = sshConnector.executeCommand("echo \""+arg[4]+"||"+arg[0]+"||"+arg[2]+"||"+arg[3]+"||"+0+"\" >> "+arg[5]+nombrearchivo);
				          
			   while (i <= Integer.valueOf(arg[3])) {
				 
				    i++; 	
				    registro.setCod_tipo_ident(Integer.valueOf(dato.getCod_TipoIdentificacion()));
					registro.setId_cliente(String.valueOf(1000 + (rnd.nextInt(9999 + 1) - 1000)));
					registro.setDv_ident_cliente(1 + (rnd.nextInt(9 + 1) - 1));
					registro.setPrimer_nombre_razon_social("Marcela");
					registro.setSegundo_nombre("Carolina");
					registro.setPrimer_apellido("Lopez");
					registro.setSegundo_apellido("Perez");
					registro.setCod_tipo_id_fideicomitente(1 + (rnd.nextInt(9 + 1) - 1));
					registro.setId_fideicomitente(10000000 + (rnd.nextInt(999999999 + 1) - 100000000));
					registro.setDv_id_fideicomitente(1 + (rnd.nextInt(9 + 1) - 1));
					registro.setCod_pais_nacionalidad(dato.getCod_Pais());
					registro.setCod_ciiu(Integer.valueOf(dato.getCod_Ciiu()));
					registro.setCod_naturaleza_juridica(Integer.valueOf(dato.getCod_NaturalezaJuridicaCliente()));
					registro.setCod_seg_comercial(dato.getCod_SegmentoComercialCliente(registro.getCod_entidad()));
					registro.setCod_grupo_sector_economico(Integer.valueOf(dato.getCod_GrupoSectorEconomico()));
					registro.setCod_tipo_empleado(Integer.valueOf(dato.getCod_TipoEmpleado()));
					registro.setCod_estado_cliente(Integer.valueOf(dato.getCod_EstadoCliente()));
					registro.setCod_dane(dato.getCod_Dane());
					registro.setCod_tipo_id_rep_legal(10 + (rnd.nextInt(99 + 1) - 10));
					registro.setDv_id_rep_legal(10000000 + (rnd.nextInt(999999999 + 1) - 100000000));
					registro.setDv_id_rep_legal(1 + (rnd.nextInt(9 + 1) - 1));
					registro.setFuente_informacion(restriccion.getFuenteInformacion());
					registro.setId_fila_origen_legado(String.valueOf(10 + (rnd.nextInt(99 + 1) - 10)));
					result = sshConnector.executeCommand("echo \""+registro.getCod_entidad()+"||"+registro.getCod_legado()+"||"+registro.getId_tanda()+"||"+registro.getCod_tipo_ident()+"||"+registro.getId_cliente()+"||"+registro.getDv_ident_cliente()+"||"+registro.getPrimer_nombre_razon_social()+"||"+registro.getSegundo_nombre()+"||"+registro.getPrimer_apellido()+"||"+registro.getSegundo_apellido()+"||"+registro.getCod_tipo_id_fideicomitente()+"||"+registro.getId_fideicomitente()+"||"+registro.getDv_id_fideicomitente()+"||"+registro.getCod_pais_nacionalidad()+"||"+registro.getCod_ciiu()+"||"+registro.getCod_naturaleza_juridica()+"||"+registro.getCod_seg_comercial()+"||"+registro.getCod_grupo_sector_economico()+registro.getCod_tipo_empleado()+"||"+registro.getCod_estado_cliente()+"||"+registro.getCod_dane()+"||"+registro.getCod_tipo_id_rep_legal()+"||"+registro.getId_rep_legal()+"||"+registro.getDv_id_rep_legal()+"||"+registro.getFuente_informacion()+"||"+arg[6]+"||"+registro.getId_fila_origen_legado()+"||"+"\" >> "+arg[5]+nombrearchivo);
					
			   }
			   
			   sshConnector.disconnect();
		}
		}


