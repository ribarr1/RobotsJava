package com.greensqa.ctifcarga.ral;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.MAE_CONTRATOS;
import com.greensqa.ctifcarga.util.SSHConnector;
import com.jcraft.jsch.JSchException;

public class ArchivoContratosRal {
	
	public static void main(String[] arg) throws SQLException, IOException, IllegalAccessException, JSchException {
		System.out.println("Generacion de Archivo Contratos");
		SSHConnector sshConnector = new SSHConnector();
        sshConnector.connect();
		
		
		String nombrearchivo = arg[1]+"11"+arg[2]+"CON11.dat";
		
			String result;
			Random rnd = new Random();
			Catalogos dato = new Catalogos();
			Restricciones restriccion = new Restricciones();
			MAE_CONTRATOS registro = new MAE_CONTRATOS();
			registro.setId_tanda(arg[0]);
			registro.setCod_entidad(arg[1]);
			   int i = 1;
			   result = sshConnector.executeCommand("echo \""+arg[4]+"||"+arg[0]+"||"+arg[2]+"||"+arg[3]+"||"+0+"\" >> "+arg[5]+nombrearchivo);
			   while (i <= Integer.valueOf(arg[3])) {
				    i++; 	
				    registro.setCod_legado(dato.getCod_Legado(registro.getCod_entidad()));
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
					result = sshConnector.executeCommand("echo \""+registro.getCod_entidad()+"||"+registro.getCod_legado()+"||"+registro.getId_tanda()+"||"+registro.getNum_contrato()+"||"+registro.getOperacion_relacionada()+"||"+registro.getCod_clase_cartera()+"||"+registro.getCod_fuente_recurso()+"||"+registro.getCod_linea_entidad()+"||"+registro.getCartera_empleado()+"||"+registro.getCod_ctro_contbl()+"||"+registro.getCod_oficina()+"||"+registro.getCod_moneda_origen()+"||"+registro.getCod_destino_economico()+"||"+registro.getCod_producto_legado()+"||"+registro.getCod_estado_contrato()+"||"+registro.getFec_ini_contrato()+"||"+registro.getFec_fin_contrato()+"||"+registro.getFec_creacion_legado()+"||"+registro.getCod_tipo_ident()+"||"+registro.getId_cliente()+"||"+registro.getMonto_contrato_mo()+"||"+registro.getMonto_ini_cop()+"||"+registro.getMonto_ini_usd()+"||"+registro.getMonto_cupo_cop()+"||"+registro.getMonto_extracupo()+"||"+registro.getContabiliza_cupo()+"||"+registro.getCod_categ_valoracion()+"||"+registro.getCod_domicilio_fiscal()+"||"+registro.getVendedor()+"||"+registro.getComprada()+"||"+registro.getGarantia_nacion()+"||"+registro.getModalidad_interes()+"||"+registro.getFactor_calculo_periodo()+"||"+registro.getFactor_calculo_tasa()+"||"+registro.getInd_contrato_reestruc()+"||"+registro.getCod_situacion_contrato()+"||"+registro.getNum_tarjeta()+"||"+registro.getCod_tipo_vivienda_hipotec()+"||"+registro.getCalidad_inmueble_hipotec()+"||"+registro.getCod_tipo_tasa()			+"||"+registro.getPuntos()			+"||"+registro.getCod_tipo_puntos()+"||"+registro.getCod_tipo_cartera()+"||"+registro.getId_fila_origen_legado()+"||"+"\" >> " +arg[5]+nombrearchivo);
					
		             
					
		}
			   sshConnector.disconnect();
		}

}
