package com.greensqa.ctifcarga.ral;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Random;
import com.greensqa.ctifcarga.ral.dto.*;
import com.greensqa.ctifcarga.util.SSHConnector;
import com.jcraft.jsch.JSchException;

public class ArchivoMovTransaccionesInternasRal {
	
	public static void main(String[] arg) throws SQLException, IOException, IllegalAccessException, JSchException {
		System.out.println("Generacion de Archivo Mov Transacciones Internas");
		SSHConnector sshConnector = new SSHConnector();
        sshConnector.connect();
		String nombrearchivo = arg[1]+"11"+arg[2]+"TRI11.dat";
				
			String result;
			Random rnd = new Random();
			Catalogos dato = new Catalogos();
			MOV_TRANSACCIONES_INTERNAS  registro = new MOV_TRANSACCIONES_INTERNAS();
			Restricciones restriccion = new Restricciones();
			registro.setId_tanda(arg[0]);
			registro.setCod_entidad(arg[1]);
			   int i = 1;
			   result = sshConnector.executeCommand("echo \""+arg[4]+"||"+arg[0]+"||"+arg[2]+"||"+arg[3]+"||"+0+"\" >> "+arg[5]+nombrearchivo);
			   while (i <= Integer.valueOf(arg[3])) {
				    i++; 	
				    registro.setCod_legado(dato.getCod_Legado(registro.getCod_entidad()));
				    registro.setId_tanda(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
				    registro.setId_transac_origen(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
				    registro.setCod_transac_origen(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));
				    registro.setCod_legado_fuente(registro.getCod_legado());//verificar si es el mismo 
				    registro.setConcepto_legado(String.valueOf(1000 + (rnd.nextInt(9999999 + 1) - 1000)));  //verificar
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
				    result = sshConnector.executeCommand("echo \""+registro.getCod_entidad()+"||"+registro.getCod_legado()+"||"+registro.getId_tanda()+"||"+registro.getId_transac_origen()+"||"+registro.getCod_transac_origen()+"||"+registro.getCod_legado_fuente()+"||"+registro.getConcepto_legado()+"||"+registro.getCod_transac()+"||"+registro.getFec_corte_contbl()+"||"+registro.getCod_concepto()+"||"+registro.getConcepto_alterno()+"||"+registro.getNum_contrato()+"||"+registro.getCod_ctro_contbl_1()+"||"+registro.getCod_ctro_contbl_2()+"||"+registro.getTasa_cmf()+"||"+registro.getTasa_cml()+"||"+registro.getValor()+"||"+registro.getCod_moneda()+"||"+registro.getValor_cop()+"||"+registro.getValor_usd()+"||"+registro.getModelo_contrapartida()+"||"+registro.getCod_tipo_dinamica()+"||"+registro.getCod_estado_transaccion()+"||"+registro.getAfecta_cupo()+"||"+registro.getCod_balance()+"||"+registro.getArchivo()+"||"+registro.getNumero_producto_relacionado()+"||"+registro.getReferencia_tercero()+"||"+registro.getCod_conciliacion()+"||"+registro.getSub_auxiliar_1()+"||"+registro.getSub_auxiliar_2()+"||"+registro.getId_fila_origen_legado()+"||"+"\" >> "+arg[5]+nombrearchivo);
					
		}			   
			   sshConnector.disconnect();
		}

}
