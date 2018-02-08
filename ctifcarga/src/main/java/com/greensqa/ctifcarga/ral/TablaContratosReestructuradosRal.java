package com.greensqa.ctifcarga.ral;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.*;	
import com.greensqa.ctifcarga.util.*;	


public class TablaContratosReestructuradosRal {
	 public static void main(String[] parametro) throws SQLException {

		 MAE_CONTRATOS_REESTRUCTURADOS  registro = new MAE_CONTRATOS_REESTRUCTURADOS ();
		 
		 PreparedStatement pstmt = ConnectionBuilder.buildConnection().prepareStatement("insert into inbox.MAE_CONTRATOS_REESTRUCTURADOS (\r\n" + 
			"COD_ENTIDAD, COD_LEGADO, ID_TANDA, FEC_CREACION, NUM_CONTRATO, FACTOR_REESTRUC, MODALIDAD_REESTRUC, FEC_FORMALIZA_REESTRUC, FEC_TERMINACION_REESTRUC, "
			+ "NUM_REESTRUC, PERIODO_GRACIA_CAPITAL, PERIODO_GRACIA_INTERESES, ID_FILA_ORIGEN_LEGADO,  "
			+ "ESTADO_REGISTRO, ID_EXPORT, FECHA_EXPORT, USUARIO_CREACION, FEC_ACTUALIZ, USUARIO_ACTUALIZACION\r\n" + 
			") \r\n" + 
			"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		 
	Catalogos dato = new Catalogos();
	Random rnd = new Random();
	Restricciones restriccion = new Restricciones();
	registro.setId_tanda(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
	String entidad = dato.getCod_Entidad();
	registro.setCod_entidad(entidad);
	int i = 1;
	   while (i <= 10000) {
		 System.out.println("  "+i);
		    i++; 	
		    
			registro.setCod_legado(dato.getCod_Legado(entidad));
		    registro.setFec_creacion(Date.valueOf("2018-01-16"));
		    registro.setNum_contrato(String.valueOf(1000000 + (rnd.nextInt(9999999 + 1) - 1000000)));
		    registro.setFactor_reestruc(1 + (rnd.nextInt(99 + 1) - 1)); 
		    registro.setModalidad_reestruc(1 + (rnd.nextInt(99 + 1) - 1));
		    registro.setFec_formaliza_reestruc(Date.valueOf("2018-01-16"));
		    registro.setFec_terminacion_reestruc(Date.valueOf("2018-01-16"));; 
		    registro.setNum_reestruc(1 + (rnd.nextInt(99 + 1) - 1));
		    registro.setPeriodo_gracia_capital(1 + (rnd.nextInt(999 + 1) - 1)); 
		    registro.setPeriodo_gracia_intereses(1 + (rnd.nextInt(999 + 1) - 1));
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
		    pstmt.setInt(6, registro.getFactor_reestruc());
		    pstmt.setInt(7, registro.getModalidad_reestruc());
		    pstmt.setDate(8, (Date) registro.getFec_formaliza_reestruc());
		    pstmt.setDate(9, (Date) registro.getFec_terminacion_reestruc());
		    pstmt.setInt(10, registro.getNum_reestruc());
		    pstmt.setInt(11, registro.getPeriodo_gracia_capital());
		    pstmt.setInt(12, registro.getPeriodo_gracia_intereses());
		    pstmt.setString(13, registro.getId_fila_origen_legado());			
			pstmt.setString(14, registro.getEstado_registro());			
			pstmt.setInt(15, registro.getId_export());		
			pstmt.setDate(16, java.sql.Date.valueOf(java.time.LocalDate.now()));
			pstmt.setString(17, registro.getUsuario_creacion());			
			pstmt.setDate(18, (Date) (registro.getFec_actualiz()));			
			pstmt.setString(19, registro.getUsuario_actualizacion());		 
			
			pstmt.executeUpdate();
		
	  }
	   pstmt.close();
	

}
}

