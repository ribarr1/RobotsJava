package com.greensqa.ctifcarga.ral;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.*;	
import com.greensqa.ctifcarga.util.*;	


public class TablaContratosRal {
	 public static void main(String[] parametro) throws SQLException {

		 MAE_CONTRATOS registro = new MAE_CONTRATOS();
		 
		 PreparedStatement pstmt = ConnectionBuilder.buildConnection().prepareStatement("insert into inbox.MAE_CONTRATOS(COD_ENTIDAD, COD_LEGADO, ID_TANDA, "
		 		+ "FEC_CREACION, NUM_CONTRATO, OPERACION_RELACIONADA, COD_CLASE_CARTERA, COD_FUENTE_RECURSO, COD_LINEA_ENTIDAD, CARTERA_EMPLEADO, COD_CTRO_CONTBL, "
		 		+ "COD_OFICINA, COD_MONEDA_ORIGEN, COD_DESTINO_ECONOMICO, COD_PRODUCTO_LEGADO, COD_ESTADO_CONTRATO, FEC_INI_CONTRATO, FEC_FIN_CONTRATO, FEC_CREACION_LEGADO, "
		 		+ "COD_TIPO_IDENT, ID_CLIENTE, MONTO_CONTRATO_MO, MONTO_INI_COP, MONTO_INI_USD, MONTO_CUPO_COP, MONTO_EXTRACUPO, CONTABILIZA_CUPO, COD_CATEG_VALORACION, COD_DOMICILIO_FISCAL, "
		 		+ "VENDEDOR, COMPRADA, GARANTIA_NACION, MODALIDAD_INTERES, FACTOR_CALCULO_PERIODO, FACTOR_CALCULO_TASA, IND_CONTRATO_REESTRUC, COD_SITUACION_CONTRATO, NUM_TARJETA, "
		 		+ "COD_TIPO_VIVIENDA_HIPOTEC, CALIDAD_INMUEBLE_HIPOTEC, COD_TIPO_TASA, PUNTOS, COD_TIPO_PUNTOS, COD_TIPO_CARTERA, ID_FILA_ORIGEN_LEGADO,  ESTADO_REGISTRO, "
		 		+ "ID_EXPORT, FECHA_EXPORT, USUARIO_CREACION, FEC_ACTUALIZ, USUARIO_ACTUALIZACION)\r\n" + 
		 		"values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
		 
	
	Random rnd = new Random();
	Catalogos dato = new Catalogos();
	Restricciones restriccion = new Restricciones();
	registro.setId_tanda(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
	
	int i = 1;
	   while (i <= 1000) {
		 System.out.println("  "+i);
		    i++; 	
		    String entidad = dato.getCod_Entidad();
		   	registro.setCod_entidad(entidad);
			registro.setCod_legado(dato.getCod_Legado(entidad));
			registro.setFec_creacion(Date.valueOf("2018-01-16"));	
			registro.setNum_contrato(String.valueOf(1000000 + (rnd.nextInt(9999999 + 1) - 1000000)));
			registro.setOperacion_relacionada(String.valueOf(1000000 + (rnd.nextInt(9999999 + 1) - 1000000)));
			registro.setCod_clase_cartera(dato.getCod_ClasesCarteras());
			registro.setCod_fuente_recurso(Integer.valueOf(dato.getCod_FuenteRecurso()));
			registro.setCod_linea_entidad(String.valueOf(1000 + (rnd.nextInt(9999 + 1) - 1000)));
			registro.setCartera_empleado(restriccion.getCarteraEmpleado());
			registro.setCod_ctro_contbl(1000000 + (rnd.nextInt(9999999 + 1) - 1000000));
			registro.setCod_oficina(String.valueOf(1000 + (rnd.nextInt(9999 + 1) - 1000)));
			registro.setCod_moneda_origen(dato.getCod_Moneda());
			registro.setCod_destino_economico(Integer.valueOf(dato.getCod_Ciiu()));
			registro.setCod_producto_legado(String.valueOf(1000000 + (rnd.nextInt(9999999 + 1) - 1000000)));
			registro.setCod_estado_contrato(dato.getCod_EstadoContrato());
			registro.setFec_ini_contrato(Date.valueOf("2018-01-01"));
			registro.setFec_fin_contrato(Date.valueOf("2018-01-20"));
			registro.setFec_creacion_legado(Date.valueOf("2017-01-20"));
			registro.setCod_tipo_ident(Integer.valueOf(dato.getCod_TipoIdentificacion()));
			registro.setId_cliente(String.valueOf(1000 + (rnd.nextInt(9999 + 1) - 1000)));
			registro.setMonto_contrato_mo(1000 + (rnd.nextInt(999999 + 1) - 1000));
			registro.setMonto_ini_cop(registro.getMonto_contrato_mo());
			registro.setMonto_ini_usd(registro.getMonto_contrato_mo()/3000);
			registro.setMonto_cupo_cop(1000000 + (rnd.nextInt(9999999 + 1) - 1000000));
			registro.setMonto_extracupo(100000 + (rnd.nextInt(999999 + 1) - 100000));
			registro.setContabiliza_cupo(restriccion.getContabilizaCupo());
			registro.setCod_categ_valoracion(dato.getCod_CategoriaValorizacion());
			registro.setCod_domicilio_fiscal(dato.getCod_Ciiu());
			registro.setVendedor(String.valueOf(100000 + (rnd.nextInt(999999 + 1) - 100000)));
			registro.setComprada(restriccion.getComprada());
			registro.setGarantia_nacion(restriccion.getGarantiaNacion());
			registro.setModalidad_interes(restriccion.getModalidadInteres());
			registro.setFactor_calculo_periodo(1 + (rnd.nextInt(365 + 1) - 1));
			registro.setFactor_calculo_tasa(1 + (rnd.nextInt(365 + 1) - 1));
			registro.setInd_contrato_reestruc(restriccion.getIndContratoRestruc());
			registro.setCod_situacion_contrato(Integer.valueOf(dato.getCod_SituacionContrato()));
			registro.setNum_tarjeta(String.valueOf(10000000 + (rnd.nextInt(99999999 + 1) - 10000000)));
			registro.setCod_tipo_vivienda_hipotec(Integer.valueOf(dato.getCod_TipoViviendaHipotecario()));
			registro.setCalidad_inmueble_hipotec(restriccion.getCalidadInmuebleHipotec());
			registro.setCod_tipo_tasa(dato.getCod_Tipotasa());
			registro.setPuntos(100 + (rnd.nextInt(999 + 1) - 100));
			registro.setCod_tipo_puntos(dato.getCod_TipoPunto());
			registro.setCod_tipo_cartera(dato.getCod_TipoCartera());
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
			pstmt.setString(5,registro.getNum_contrato());
			pstmt.setString(6,registro.getOperacion_relacionada());
			pstmt.setString(7,registro.getCod_clase_cartera());
			pstmt.setInt(8,registro.getCod_fuente_recurso());
			pstmt.setString(9,registro.getCod_linea_entidad());
			pstmt.setString(10,registro.getCartera_empleado());
			pstmt.setInt(11,registro.getCod_ctro_contbl());
			pstmt.setString(12,registro.getCod_oficina());
			pstmt.setString(13,registro.getCod_moneda_origen());
			pstmt.setInt(14,registro.getCod_destino_economico());
			pstmt.setString(15,registro.getCod_producto_legado());
			pstmt.setString(16,registro.getCod_estado_contrato());
			pstmt.setDate(17,(Date)registro.getFec_ini_contrato());
			pstmt.setDate(18,(Date)registro.getFec_fin_contrato());
			pstmt.setDate(19,(Date)registro.getFec_creacion_legado());
			pstmt.setInt(20,registro.getCod_tipo_ident());
			pstmt.setString(21,registro.getId_cliente());
			pstmt.setInt(22,registro.getMonto_contrato_mo());
			pstmt.setInt(23,registro.getMonto_ini_cop());
			pstmt.setInt(24,registro.getMonto_ini_usd());
			pstmt.setInt(25,registro.getMonto_cupo_cop());
			pstmt.setInt(26,registro.getMonto_extracupo());
			pstmt.setString(27,registro.getContabiliza_cupo());
			pstmt.setString(28,registro.getCod_categ_valoracion());
			pstmt.setString(29,registro.getCod_domicilio_fiscal());
			pstmt.setString(30,registro.getVendedor());
			pstmt.setString(31,registro.getComprada());
			pstmt.setString(32,registro.getGarantia_nacion());
			pstmt.setString(33,registro.getModalidad_interes());
			pstmt.setInt(34,registro.getFactor_calculo_periodo());
			pstmt.setInt(35,registro.getFactor_calculo_tasa());
			pstmt.setString(36,registro.getInd_contrato_reestruc());
			pstmt.setInt(37,registro.getCod_situacion_contrato());
			pstmt.setString(38,registro.getNum_tarjeta());
			pstmt.setInt(39,registro.getCod_tipo_vivienda_hipotec());
			pstmt.setString(40,registro.getCalidad_inmueble_hipotec());
			pstmt.setString(41,registro.getCod_tipo_tasa());			
			pstmt.setInt(42,registro.getPuntos());			
			pstmt.setString(43,registro.getCod_tipo_puntos());
			pstmt.setString(44,registro.getCod_tipo_cartera());
			pstmt.setString(45,registro.getId_fila_origen_legado());
			pstmt.setString(46,registro.getEstado_registro());
			pstmt.setInt(47,registro.getId_export());
			pstmt.setDate(48,(Date) registro.getFecha_export());
			pstmt.setString(49,registro.getUsuario_creacion());
			pstmt.setDate(50,(Date) registro.getFec_actualiz());
			pstmt.setString(51,registro.getUsuario_actualizacion());
		
				 
		 pstmt.executeUpdate();
		
	  }
	   pstmt.close();
	

}
}
