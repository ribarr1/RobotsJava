package com.greensqa.ctifcarga.ral;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import oracle.net.aso.t;


public class Restricciones {
	 Random rnd = new Random();
	 List<String> CarteraEmpleado = new ArrayList<String>(Arrays.asList("N","S"));
	 List<String> ContabilizaCupo = new ArrayList<String>(Arrays.asList("N","S"));
	 List<String> Comprada = new ArrayList<String>(Arrays.asList("N","S"));
	 List<String> GarantiaNacion = new ArrayList<String>(Arrays.asList("N","S"));
	 List<String> ModalidadInteres = new ArrayList<String>(Arrays.asList("A","V"));
	 List<String> IndContratoRestruc = new ArrayList<String>(Arrays.asList("N","S"));
	 List<String> CalidadInmuebleHipotec = new ArrayList<String>(Arrays.asList("N","U"));
	 List<String> EstadoRegistro = new ArrayList<String>(Arrays.asList("0K","ENTREGADO CORE","ENTREGADO","INACTIVO","INCONSISTENTE","NO VALIDADO"));
	 List<String> FuenteInformacion = new ArrayList<String>(Arrays.asList("CRM","LEGADO","SARC"));
	 List<String> EstadoCausacion = new ArrayList<String>(Arrays.asList("N","S"));
	 List<String> EstadoTransaccion = new ArrayList<String>(Arrays.asList("1","0"));
	 List<String> AfectaCupo = new ArrayList<String>(Arrays.asList("A","D"));
	
	 public String getAfectaCupo() {
		 return AfectaCupo.get(0 + (rnd.nextInt(AfectaCupo.size())));		 
	} 
	 public String getEstadoTransaccion() {
		 return EstadoTransaccion.get(0 + (rnd.nextInt(EstadoTransaccion.size())));		 
	} 
	 public String getEstadoCausacion() {
		 return EstadoCausacion.get(0 + (rnd.nextInt(EstadoCausacion.size())));		 
	} 
	 public String getFuenteInformacion() {
		 return FuenteInformacion.get(0 + (rnd.nextInt(FuenteInformacion.size())));		 
	} 
	 public String getEstadoRegistro() {
		 return EstadoRegistro.get(0 + (rnd.nextInt(EstadoRegistro.size())));		 
	} 
	 public String getCalidadInmuebleHipotec() {
		 return CalidadInmuebleHipotec.get(0 + (rnd.nextInt(CalidadInmuebleHipotec.size())));		 
	} 
	 public String getIndContratoRestruc() {
		 return IndContratoRestruc.get(0 + (rnd.nextInt(IndContratoRestruc.size())));		 
	} 
	 public String getModalidadInteres() {
		 return ModalidadInteres.get(0 + (rnd.nextInt(ModalidadInteres.size())));		 
	} 
	 public String getGarantiaNacion() {
		 return GarantiaNacion.get(0 + (rnd.nextInt(GarantiaNacion.size())));		 
	} 
	 public String getComprada() {
		 return Comprada.get(0 + (rnd.nextInt(Comprada.size())));		 
	} 
	 public String getContabilizaCupo() {
		 return ContabilizaCupo.get(0 + (rnd.nextInt(ContabilizaCupo.size())));		 
	} 
	 
	 public String getCarteraEmpleado() {
		 return CarteraEmpleado.get(0 + (rnd.nextInt(CarteraEmpleado.size())));		 
	} 
}
