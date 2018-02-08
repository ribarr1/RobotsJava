package com.greensqa.ctifcarga.ral;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.*;	
import com.greensqa.ctifcarga.util.*;	


public class TablaMovTransaccionesInternasRal {
	 public static void main(String[] parametro) throws SQLException {

		 MOV_TRANSACCIONES_INTERNAS  registro = new MOV_TRANSACCIONES_INTERNAS ();
		 
		 PreparedStatement pstmt = ConnectionBuilder.buildConnection().prepareStatement("insert into inbox.MOV_TRANSACCIONES_INTERNAS (\r\n" + 
			"COD_ENTIDAD, COD_LEGADO, ID_TANDA, FEC_CREACION, ID_TRANSAC_ORIGEN, COD_TRANSAC_ORIGEN, COD_LEGADO_FUENTE, CONCEPTO_LEGADO, COD_TRANSAC,"
			+ " FEC_CORTE_CONTBL, COD_CONCEPTO, CONCEPTO_ALTERNO, NUM_CONTRATO, COD_CTRO_CONTBL_1, COD_CTRO_CONTBL_2, TASA_CMF, TASA_CML,"
			+ " VALOR, COD_MONEDA, VALOR_COP, VALOR_USD, MODELO_CONTRAPARTIDA, COD_TIPO_DINAMICA, COD_ESTADO_TRANSACCION, AFECTA_CUPO, "
			+ "COD_BALANCE, ARCHIVO, NUMERO_PRODUCTO_RELACIONADO, REFERENCIA_TERCERO, COD_CONCILIACION, SUB_AUXILIAR_1, SUB_AUXILIAR_2, "
			+ "ID_FILA_ORIGEN_LEGADO,  ESTADO_REGISTRO, ID_EXPORT, FECHA_EXPORT, USUARIO_CREACION, FEC_ACTUALIZ, USUARIO_ACTUALIZACION\r\n" + 
			") \r\n" + 
			"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		 
	Catalogos dato = new Catalogos();
	Random rnd = new Random();
	Restricciones restriccion = new Restricciones();
	
	
	int i = 1;
	   while (i <= 100) {
		 System.out.println("  "+i);
		    i++; 	
		    String entidad = dato.getCod_Entidad();
		    registro.setCod_entidad(entidad);
		    registro.setCod_legado(dato.getCod_Legado(entidad));
		    registro.setId_tanda(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
		    registro.setFec_creacion(Date.valueOf("2018-01-16"));
		    registro.setId_transac_origen(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
		    registro.setCod_transac_origen(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
		    registro.setCod_legado_fuente(registro.getCod_legado());//verificar si es el mismo 
		    registro.setConcepto_legado(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));  //verificar
		    //System.out.println(registro.getConcepto_legado());
		    registro.setCod_transac(1 + (rnd.nextInt(999 + 1) - 1));
		    registro.setFec_corte_contbl(Date.valueOf("2018-01-16"));
		    registro.setCod_concepto(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
		    registro.setConcepto_alterno(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
		    registro.setNum_contrato(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
		    registro.setCod_ctro_contbl_1(1000 + (rnd.nextInt(9999999 + 1) - 1000));
		    registro.setCod_ctro_contbl_2(1000 + (rnd.nextInt(9999999 + 1) - 1000));
		    registro.setTasa_cmf(1000 + (rnd.nextInt(9999999 + 1) - 1000));
		    registro.setTasa_cml(1000 + (rnd.nextInt(9999999 + 1) - 1000));
		    registro.setValor(1000 + (rnd.nextInt(9999999 + 1) - 1000));
		    registro.setCod_moneda(String.valueOf(dato.getCod_Moneda()));
		   // System.out.println(dato.getCod_EstadoCliente());
		    registro.setValor_cop(1000 + (rnd.nextInt(9999999 + 1) - 1000));
		    registro.setValor_usd(registro.getValor_cop()/3000);
		    registro.setModelo_contrapartida(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
		    registro.setCod_tipo_dinamica(String.valueOf(1000 + (rnd.nextInt(99999 + 1) - 1000)));
		    registro.setCod_estado_transaccion(restriccion.getEstadoTransaccion());
		    registro.setAfecta_cupo(restriccion.getAfectaCupo());
		    registro.setCod_balance(1 + (rnd.nextInt(999 + 1) - 1));
		    registro.setArchivo(String.valueOf(1000 + (rnd.nextInt(99999 + 1) - 1000)));
		    registro.setNumero_producto_relacionado(String.valueOf(1000000 + (rnd.nextInt(99999999 + 1) - 1000000)));
		    registro.setReferencia_tercero(1000000 + (rnd.nextInt(99999999 + 1) - 1000000));
		    registro.setCod_conciliacion(dato.getCod_TipoConcepto()); //validar
		    registro.setSub_auxiliar_1(String.valueOf(1000000 + (rnd.nextInt(99999999 + 1) - 1000000)));
		    registro.setSub_auxiliar_2(String.valueOf(1000000 + (rnd.nextInt(99999999 + 1) - 1000000)));
		    registro.setId_fila_origen_legado(String.valueOf(10 + (rnd.nextInt(99 + 1) - 10)));
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
			pstmt.setString(5,registro.getId_transac_origen());
			pstmt.setString(6,registro.getCod_transac_origen());
			pstmt.setString(7,registro.getCod_legado_fuente());
			pstmt.setString(8,registro.getConcepto_legado());
			pstmt.setInt(9,registro.getCod_transac());
			pstmt.setDate(10,(Date) registro.getFec_corte_contbl());
			pstmt.setString(11,registro.getCod_concepto());
			pstmt.setString(12,registro.getConcepto_alterno());
			pstmt.setString(13,registro.getNum_contrato());
			pstmt.setInt(14,registro.getCod_ctro_contbl_1());
			pstmt.setInt(15,registro.getCod_ctro_contbl_2());
			pstmt.setInt(16,registro.getTasa_cmf());
			pstmt.setInt(17,registro.getTasa_cml());
			pstmt.setInt(18,registro.getValor());
			pstmt.setString(19,registro.getCod_moneda());
			pstmt.setInt(20,registro.getValor_cop());
			pstmt.setInt(21,registro.getValor_usd());
			pstmt.setString(22,registro.getModelo_contrapartida());
			pstmt.setString(23,registro.getCod_tipo_dinamica());
			pstmt.setString(24,registro.getCod_estado_transaccion());
			pstmt.setString(25,registro.getAfecta_cupo());
			pstmt.setInt(26,registro.getCod_balance());
			pstmt.setString(27,registro.getArchivo());
			pstmt.setString(28,registro.getNumero_producto_relacionado());
			pstmt.setInt(29,registro.getReferencia_tercero());
			pstmt.setString(30,registro.getCod_conciliacion());
			pstmt.setString(31,registro.getSub_auxiliar_1());
			pstmt.setString(32,registro.getSub_auxiliar_2());
			pstmt.setString(33,registro.getId_fila_origen_legado());
			pstmt.setString(34,registro.getEstado_registro());
			pstmt.setInt(35,registro.getId_export());
			pstmt.setDate(36,(Date) registro.getFecha_export());
			pstmt.setString(37,registro.getUsuario_creacion());
			pstmt.setDate(38,(Date) registro.getFec_actualiz());
			pstmt.setString(39,registro.getUsuario_actualizacion());
			
			pstmt.executeUpdate();
	  }
	   pstmt.close();
	

}
}

