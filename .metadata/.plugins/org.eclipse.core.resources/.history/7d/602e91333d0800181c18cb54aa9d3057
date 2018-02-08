package com.greensqa.ctifcarga.ral;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.*;	
import com.greensqa.ctifcarga.util.*;	


public class TablaClientesEntidadesRal {
	 public static void main(String[] arg ) throws SQLException {

		 MAE_CLIENTES_ENTIDADES registro = new MAE_CLIENTES_ENTIDADES();
		 
		 PreparedStatement pstmt = ConnectionBuilder.buildConnection().prepareStatement("insert into inbox.MAE_CLIENTES_ENTIDADES(COD_ENTIDAD, COD_LEGADO, ID_TANDA, FEC_CREACION, COD_TIPO_IDENT, ID_CLIENTE, DV_IDENT_CLIENTE, PRIMER_NOMBRE_RAZON_SOCIAL, SEGUNDO_NOMBRE, PRIMER_APELLIDO, \r\n" + 
		 		"SEGUNDO_APELLIDO, COD_TIPO_ID_FIDEICOMITENTE, ID_FIDEICOMITENTE, DV_ID_FIDEICOMITENTE, COD_PAIS_NACIONALIDAD, COD_CIIU, COD_NATURALEZA_JURIDICA, \r\n" + 
		 		"COD_SEG_COMERCIAL, COD_GRUPO_SECTOR_ECONOMICO, COD_TIPO_EMPLEADO, COD_ESTADO_CLIENTE, COD_DANE, COD_TIPO_ID_REP_LEGAL, ID_REP_LEGAL, DV_ID_REP_LEGAL, \r\n" + 
		 		"FUENTE_INFORMACION, FEC_INI, ID_FILA_ORIGEN_LEGADO, ESTADO_REGISTRO, ID_EXPORT, FECHA_EXPORT, USUARIO_CREACION, FEC_ACTUALIZ, \r\n" + 
		 		"USUARIO_ACTUALIZACION)\r\n" + 
		 		"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
		 
	
	Random rnd = new Random();
	Catalogos dato = new Catalogos();
	Restricciones restriccion = new Restricciones();
	//registro.setId_tanda(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
	registro.setId_tanda(arg[0]);
	//String entidad = dato.getCod_Entidad();
   	registro.setCod_entidad(arg[1]);
	
	int i = 1;
	   while (i <= Integer.valueOf(arg[3])) {
		 System.out.println("  "+i);
		    i++; 	
		    
		  
			registro.setCod_legado(dato.getCod_Legado(registro.getCod_entidad()));
			//System.out.println(registro.getCod_legado());
			registro.setFec_creacion(Date.valueOf("2018-01-16"));	
			registro.setCod_tipo_ident(Integer.valueOf(dato.getCod_TipoIdentificacion()));
			//System.out.println(registro.getCod_tipo_ident());
			registro.setId_cliente(String.valueOf(1000 + (rnd.nextInt(9999 + 1) - 1000)));
		//	System.out.println(registro.getId_cliente());
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
			registro.setFec_ini(Date.valueOf("2018-01-16"));
			registro.setId_fila_origen_legado("AAAAAAAAAAAAAAAAAAAAAAAAAA");
			registro.setEstado_registro(restriccion.getEstadoRegistro());
			registro.setId_export(1000 + (rnd.nextInt(9999999 + 1) - 1000));
			registro.setFecha_export(Date.valueOf("2018-01-16"));
			registro.setUsuario_creacion("ribarra");
			registro.setFec_actualiz(Date.valueOf("2018-01-16"));
			registro.setUsuario_actualizacion("ribarra");
			
			 
			pstmt.setString(1,registro.getCod_entidad());
			pstmt.setString(2,registro.getCod_legado());
			pstmt.setString(3,registro.getId_tanda());
			pstmt.setDate(4,(Date) registro.getFec_creacion());
			pstmt.setInt(5,registro.getCod_tipo_ident());
			pstmt.setString(6,registro.getId_cliente());
			pstmt.setInt(7,registro.getDv_ident_cliente());
			pstmt.setString(8,registro.getPrimer_nombre_razon_social());
			pstmt.setString(9,registro.getSegundo_nombre());
			pstmt.setString(10,registro.getPrimer_apellido());
			pstmt.setString(11,registro.getSegundo_apellido());
			pstmt.setInt(12,registro.getCod_tipo_id_fideicomitente());
			pstmt.setInt(13,registro.getId_fideicomitente());
			pstmt.setInt(14,registro.getDv_id_fideicomitente());
			pstmt.setString(15,registro.getCod_pais_nacionalidad());
			pstmt.setInt(16,registro.getCod_ciiu());
			pstmt.setInt(17,registro.getCod_naturaleza_juridica());
			pstmt.setString(18,registro.getCod_seg_comercial());
			pstmt.setInt(19,registro.getCod_grupo_sector_economico());
			pstmt.setInt(20,registro.getCod_tipo_empleado());
			pstmt.setInt(21,registro.getCod_estado_cliente());
			pstmt.setString(22,registro.getCod_dane());
			pstmt.setInt(23,registro.getCod_tipo_id_rep_legal());
			pstmt.setString(24,registro.getId_rep_legal());
			pstmt.setInt(25,registro.getDv_id_rep_legal());
			pstmt.setString(26,registro.getFuente_informacion());
			pstmt.setDate(27,(Date) registro.getFec_ini());
			pstmt.setString(28,registro.getId_fila_origen_legado());
			pstmt.setString(29,registro.getEstado_registro());
			pstmt.setInt(30,registro.getId_export());
			pstmt.setDate(31,(Date) registro.getFecha_export());
			pstmt.setString(32,registro.getUsuario_creacion());
			pstmt.setDate(33,(Date) registro.getFec_actualiz());
			pstmt.setString(34,registro.getUsuario_actualizacion());
			
	
		 
		 pstmt.executeUpdate();
		
	  }
	   pstmt.close();
	

}
}

