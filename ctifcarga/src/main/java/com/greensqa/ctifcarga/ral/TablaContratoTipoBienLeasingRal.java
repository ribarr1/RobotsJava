package com.greensqa.ctifcarga.ral;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.*;	
import com.greensqa.ctifcarga.util.*;	


public class TablaContratoTipoBienLeasingRal {
	 public static void main(String[] parametro) throws SQLException {

		 MAE_CONTRATO_TIPO_BIEN_LEASING registro = new MAE_CONTRATO_TIPO_BIEN_LEASING();
		 
		 PreparedStatement pstmt = ConnectionBuilder.buildConnection().prepareStatement("insert into inbox.MAE_CONTRATO_TIPO_BIEN_LEASING(\r\n" + 
			"COD_ENTIDAD, COD_LEGADO, ID_TANDA, FEC_CREACION, NUM_CONTRATO, COD_TIPO_BIEN, PORCENTAJE, ID_FILA_ORIGEN_LEGADO, "
			+ "ESTADO_REGISTRO, ID_EXPORT, FECHA_EXPORT, USUARIO_CREACION, FEC_ACTUALIZ, USUARIO_ACTUALIZACION) \r\n" + 
			"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		 
	Catalogos dato = new Catalogos();
	Random rnd = new Random();
	Restricciones restriccion = new Restricciones();
	registro.setId_tanda(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
	String entidad = dato.getCod_Entidad();
	registro.setCod_entidad(entidad);
	int i = 1;
	   while (i <= 100) {
		 System.out.println("  "+i);
		    i++; 	
		    
			registro.setCod_legado(dato.getCod_Legado(entidad));
		    registro.setFec_creacion(Date.valueOf("2018-01-16"));
		    registro.setNum_contrato(String.valueOf(1000000 + (rnd.nextInt(9999999 + 1) - 1000000)));
		    registro.setCod_tipo_bien(Integer.valueOf(dato.getCod_TipoBien()));
		    registro.setPorcentaje(1 + (rnd.nextInt(100 + 1) - 1));
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
			pstmt.setString(5, registro.getNum_contrato());			
			pstmt.setInt(6, registro.getCod_tipo_bien());				
			pstmt.setInt(7, registro.getPorcentaje());			
			pstmt.setString(8, registro.getId_fila_origen_legado());			
			pstmt.setString(9, registro.getEstado_registro());			
			pstmt.setInt(10, registro.getId_export());		
			pstmt.setDate(11, java.sql.Date.valueOf(java.time.LocalDate.now()));
			pstmt.setString(12, registro.getUsuario_creacion());			
			pstmt.setDate(13, (Date) (registro.getFec_actualiz()));			
			pstmt.setString(14, registro.getUsuario_actualizacion());		 
			
			pstmt.executeUpdate();
		
	  }
	   pstmt.close();
	

}
}

