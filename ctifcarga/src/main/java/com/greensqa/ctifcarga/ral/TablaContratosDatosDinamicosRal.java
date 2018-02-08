package com.greensqa.ctifcarga.ral;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.*;	
import com.greensqa.ctifcarga.util.*;	


public class TablaContratosDatosDinamicosRal {
	 public static void main(String[] parametro) throws SQLException {

		 MAE_CONTRATOS_DATOS_DINAMICOS  registro = new MAE_CONTRATOS_DATOS_DINAMICOS ();
		 
		 PreparedStatement pstmt = ConnectionBuilder.buildConnection().prepareStatement("insert into inbox.MAE_CONTRATOS_DATOS_DINAMICOS (\r\n" + 
			"COD_ENTIDAD, COD_LEGADO, ID_TANDA, FEC_CREACION, NUM_CONTRATO, TASA_CORRIENTE_EA, TASA_MORA_EA, ESTADO_CAUSACION,"
			+ " ID_FILA_ORIGEN_LEGADO, ESTADO_REGISTRO, ID_EXPORT, FECHA_EXPORT, USUARIO_CREACION, FEC_ACTUALIZ, USUARIO_ACTUALIZACION	) \r\n" + 
			"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		 
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
		    registro.setTasa_corriente_ea(1 + (rnd.nextInt(999 + 1) - 1));
		    registro.setTasa_mora_ea(1 + (rnd.nextInt(999 + 1) - 1));
		    registro.setEstado_causacion(restriccion.getEstadoCausacion());
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
		    pstmt.setInt(6, registro.getTasa_corriente_ea());
		    pstmt.setInt(7, registro.getTasa_mora_ea());
		    pstmt.setString(8, registro.getEstado_causacion());	
			pstmt.setString(9, registro.getId_fila_origen_legado());			
			pstmt.setString(10, registro.getEstado_registro());			
			pstmt.setInt(11, registro.getId_export());		
			pstmt.setDate(12, java.sql.Date.valueOf(java.time.LocalDate.now()));
			pstmt.setString(13, registro.getUsuario_creacion());			
			pstmt.setDate(14, (Date) (registro.getFec_actualiz()));			
			pstmt.setString(15, registro.getUsuario_actualizacion());		 
			
			pstmt.executeUpdate();
		
	  }
	   pstmt.close();
	

}
}

