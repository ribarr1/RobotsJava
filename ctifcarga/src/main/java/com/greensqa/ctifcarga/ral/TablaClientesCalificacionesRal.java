package com.greensqa.ctifcarga.ral;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.*;	
import com.greensqa.ctifcarga.util.*;	


public class TablaClientesCalificacionesRal {
	 public static void main(String[] parametro) throws SQLException {

		 MAE_CLIENTES_CALIFICACIONES registro = new MAE_CLIENTES_CALIFICACIONES();
		 
		 PreparedStatement pstmt = ConnectionBuilder.buildConnection().prepareStatement("insert into inbox.MAE_CLIENTES_CALIFICACIONES(\r\n" + 
			"ID_TANDA,USUARIO_CREACION,ID_EXPORT,COD_CLASE_CARTERA,COD_ENTIDAD,USUARIO_ACTUALIZACION,FEC_CORTE_CONTBL,COD_LEGADO,ID_FILA_ORIGEN_LEGADO,FECHA_EXPORT\r\n" + 
			",ID_CLIENTE,COD_CALIF_CLIENTE,ESTADO_REGISTRO,FUENTE_INFORMACION,FEC_ACTUALIZ,COD_TIPO_IDENT,FEC_CREACION) \r\n" + 
			"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		 
	
	Random rnd = new Random();
	Catalogos dato = new Catalogos();
	Restricciones restriccion = new Restricciones();
	registro.setId_tanda(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
	String entidad = dato.getCod_Entidad();
	registro.setCod_entidad(entidad);
	int i = 1;
	   while (i <= 5) {
		 System.out.println("  "+i);
		    i++; 	
		    registro.setUsuario_creacion("ribarra");
			registro.setId_export(1000 + (rnd.nextInt(9999999 + 1) - 1000));
			registro.setCod_clase_cartera(dato.getCod_ClasesCarteras());
			registro.setUsuario_actualizacion("ribarra");
			registro.setFec_corte_contbl(Date.valueOf("2018-01-16"));
			registro.setCod_legado(dato.getCod_Legado(entidad));
			registro.setId_fila_origen_legado(String.valueOf(10 + (rnd.nextInt(99 + 1) - 10)));
			registro.setFecha_export(Date.valueOf("2018-01-16"));
			registro.setId_cliente(String.valueOf(1000 + (rnd.nextInt(9999 + 1) - 1000)));
			registro.setCod_calif_cliente(dato.getCod_calificacion());
			registro.setEstado_registro(restriccion.getEstadoRegistro());
			registro.setFuente_informacion(restriccion.getFuenteInformacion());
			registro.setFec_actualiz(Date.valueOf("2018-01-16"));
			registro.setCod_tipo_ident(Integer.valueOf(dato.getCod_TipoIdentificacion()));
			registro.setFec_creacion(Date.valueOf("2018-01-16"));			
			
				
		 pstmt.setString(1, registro.getId_tanda());
		 pstmt.setString(2, registro.getUsuario_creacion());	
		 pstmt.setInt(3, registro.getId_export());	
		 pstmt.setString(4, registro.getCod_clase_cartera());
		 pstmt.setString(5, registro.getCod_entidad());	
		 pstmt.setString(6, registro.getUsuario_actualizacion());	
		 //pstmt.setDate(7, java.sql.Date.valueOf(java.time.LocalDate.now()));
		 pstmt.setDate(7, (Date) (registro.getFec_corte_contbl()));
		 pstmt.setString(8, registro.getCod_legado());	
		 pstmt.setString(9, registro.getId_fila_origen_legado());	
		 pstmt.setDate(10, java.sql.Date.valueOf(java.time.LocalDate.now()));
		 //pstmt.setString(10, p_FECHA_EXPORT);	
		 pstmt.setString(11, registro.getId_cliente());	
		 pstmt.setString(12, registro.getCod_calif_cliente());	
		 pstmt.setString(13, registro.getEstado_registro());	
		 pstmt.setString(14, registro.getFuente_informacion());	
		 pstmt.setDate(15, java.sql.Date.valueOf(java.time.LocalDate.now()));
		 pstmt.setDate(15, (Date) (registro.getFec_actualiz()));	
		 pstmt.setInt(16, registro.getCod_tipo_ident());
		 pstmt.setDate(17, java.sql.Date.valueOf(java.time.LocalDate.now()));
		// pstmt.setString(17, p_FEC_CREACION);
		 pstmt.executeUpdate();
		
	  }
	   pstmt.close();
	

}
}

