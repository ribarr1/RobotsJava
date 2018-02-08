package com.greensqa.ctifcarga.ral;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.*;	
import com.greensqa.ctifcarga.util.*;	


public class TablaMovCierreContableRal {
	 public static void main(String[] parametro) throws SQLException {

		 MOV_CIERRE_CONTABLE  registro = new MOV_CIERRE_CONTABLE ();
		 
		 PreparedStatement pstmt = ConnectionBuilder.buildConnection().prepareStatement("insert into inbox.MOV_CIERRE_CONTABLE (\r\n" + 
			"COD_ENTIDAD, COD_LEGADO, ID_TANDA, FEC_CREACION, FECHA_CIERRE_CONTABLE, ID_FILA_ORIGEN_LEGADO,  ESTADO_REGISTRO, "
			+ "ID_EXPORT, FECHA_EXPORT, USUARIO_CREACION, FEC_ACTUALIZ, USUARIO_ACTUALIZACION\r\n" + 
			") \r\n" + 
			"values (?,?,?,?,?,?,?,?,?,?,?,?)");
		 
	Catalogos dato = new Catalogos();
	Random rnd = new Random();
	Restricciones restriccion = new Restricciones();
	
	
	int i = 1;
	   while (i <= 10000) {
		 System.out.println("  "+i);
		    i++; 	
		    registro.setId_tanda(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
		    String entidad = dato.getCod_Entidad();
			registro.setCod_entidad(entidad);
			registro.setCod_legado(dato.getCod_Legado(entidad));
		    registro.setFec_creacion(Date.valueOf("2018-01-16"));
		    registro.setFecha_cierre_contable(Date.valueOf("2018-01-16"));
		    registro.setId_fila_origen_legado(String.valueOf(10 + (rnd.nextInt(99 + 1) - 10)));
		    registro.setEstado_registro(restriccion.getEstadoRegistro());
		    registro.setId_export(1000 + (rnd.nextInt(9999999 + 1) - 1000));
			registro.setFecha_export(Date.valueOf("2018-01-16"));
			registro.setUsuario_creacion("ribarra");
			registro.setFec_actualiz(Date.valueOf("2018-01-16"));
			registro.setUsuario_actualizacion("ribarra");
			
			pstmt.setString(1, registro.getCod_entidad());	
			pstmt.setString(2, registro.getCod_legado());			
			pstmt.setString(3, registro.getId_tanda());		
			pstmt.setDate(4, java.sql.Date.valueOf(java.time.LocalDate.now()));	
		    pstmt.setDate(5, (Date) registro.getFecha_cierre_contable());
		    pstmt.setString(6, registro.getId_fila_origen_legado());			
			pstmt.setString(7, registro.getEstado_registro());			
			pstmt.setInt(8, registro.getId_export());		
			pstmt.setDate(9, java.sql.Date.valueOf(java.time.LocalDate.now()));
			pstmt.setString(10, registro.getUsuario_creacion());			
			pstmt.setDate(11, (Date) (registro.getFec_actualiz()));			
			pstmt.setString(12, registro.getUsuario_actualizacion());		 
			
			pstmt.executeUpdate();
		
	  }
	   pstmt.close();
	

}
}

