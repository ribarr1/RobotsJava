package com.greensqa.ctifcarga.test;
import java.io.IOException;
import java.sql.SQLException;
import java.io.FileInputStream;
import com.greensqa.ctifcarga.ral.*;
import com.jcraft.jsch.JSchException;
import java.util.Random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class App 
{
    public static void main( String[] args ) throws SQLException, IOException, IllegalAccessException, JSchException
    {
    	System.out.println("Iniciando Gneracion de Archivos de Datos Inbox");
    	System.out.println();
    	
    	Properties parametros = new Properties();
    	parametros.load(new FileInputStream(
          "C:\\Users\\CarolinaLeal\\eclipse-workspace\\ctifcarga\\src\\main\\java\\com\\greensqa\\ctifcarga\\properties\\ParametrosIniciales.properties"));
    	String cantidadregistros = parametros.getProperty("cantidadregistros");
    	String entidad = parametros.getProperty("entidad");
    	String rutalinux = parametros.getProperty("rutalinux");
    	String clientesEntidades = parametros.getProperty("clientesEntidades");
    	String clientesCalificaciones = parametros.getProperty("clientesCalificaciones");
    	String clientesSituaciones = parametros.getProperty("clientesSituaciones");
    	String contratosCalificaciones = parametros.getProperty("contratosCalificaciones");
    	String contratosDatosDinamicos = parametros.getProperty("contratosDatosDinamicos");
    	String contratosDiasMora = parametros.getProperty("contratosDiasMora");
    	String contratos = parametros.getProperty("contratos");
    	String contratosReestructurados = parametros.getProperty("contratosReestructurados");
    	String contratoTipoBienLeasing = parametros.getProperty("contratoTipoBienLeasing");
    	String movCierreContable = parametros.getProperty("movCierreContable");
    	String movTransaccionesInternas = parametros.getProperty("movTransaccionesInternas");
    	String control = parametros.getProperty("control");
    	
    	
    	Random rnd = new Random();
    	Catalogos dato = new Catalogos();
    	DateFormat hourdateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    	DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
    	Date date = new Date();
    	   	
    	
    	TablaClientesEntidadesRal EjecutarClientesEntidadesRal = new TablaClientesEntidadesRal();
    	TablaClientesCalificacionesRal EjecutarClientesCalificacionesRal = new TablaClientesCalificacionesRal();
    	TablaClientesStuacionesRal EjecutarClientesStuacionesRal = new TablaClientesStuacionesRal();
    	ArchivoClientesEntidadesRal GenerarArchivoClientesEntidades = new ArchivoClientesEntidadesRal();
    	ArchivoControlRal GenerarArchivoControl = new ArchivoControlRal();
    	ArchivoClientesCalificacionesRal GenerarArchivoClientesCalificaciones = new ArchivoClientesCalificacionesRal();
    	ArchivoClientesSituacionesRal GenerarArchivoClientesSituaciones = new ArchivoClientesSituacionesRal();
    	ArchivoContratosCalificacionesRal GenerarArchivoContratosCalificaciones = new ArchivoContratosCalificacionesRal();
    	ArchivoContratosDatosDinamicosRal GenerarArchivoContratosDatosDinamicos = new ArchivoContratosDatosDinamicosRal();
    	ArchivoContratosDiasMoraRal GenerarArchivoContratosDiasMora = new ArchivoContratosDiasMoraRal();
    	ArchivoContratosRal GenerarArchivoContratos = new ArchivoContratosRal();
    	ArchivoContratosReestructuradosRal GenerarArchivoContratosReestructurados = new ArchivoContratosReestructuradosRal();
    	ArchivoContratoTipoBienLeasingRal GenerarArchivoContratoTipoBienLeasing = new ArchivoContratoTipoBienLeasingRal();
    	ArchivoMovCierreContableRal GenerarArchivoMovCierreContable = new ArchivoMovCierreContableRal();
    	ArchivoMovTransaccionesInternasRal GenerarArchivoMovTransaccionesInternas = new ArchivoMovTransaccionesInternasRal();
    	
    	
    	String [] arreglo = new String[7];
    	arreglo[0] = String.valueOf(1000 + (rnd.nextInt(9999 + 1) - 1000));  //tanda
    	arreglo[1] = entidad;
    	arreglo[2] = hourdateFormat.format(date);  //fechahora
    	arreglo[3] = cantidadregistros;   // Cantidad de registros a insertar en las tablas
    	arreglo[4] = dato.getCod_Legado(arreglo[1]);
    	arreglo[5] = rutalinux;  //Ruta donde se dejan los archivos
    	arreglo[6] = dateFormat.format(date);  //fecha actual en formato yyyMMdd
       	
    	//EjecutarClientesEntidadesRal.main(arreglo);
    	//EjecutarClientesCalificacionesRal.main(null);
    	//EjecutarClientesStuacionesRal.main(null);
    	if (clientesEntidades.equals("s"))
    		GenerarArchivoClientesEntidades.main(arreglo);
    	if (clientesCalificaciones.equals("s"))
    		GenerarArchivoClientesCalificaciones.main(arreglo);
    	if (clientesSituaciones.equals("s"))
    		GenerarArchivoClientesSituaciones.main(arreglo);
    	if (contratosCalificaciones.equals("s"))
    		GenerarArchivoContratosCalificaciones.main(arreglo);
    	if (contratosDatosDinamicos.equals("s"))
    		GenerarArchivoContratosDatosDinamicos.main(arreglo);
    	if (contratosDiasMora.equals("s"))
    		GenerarArchivoContratosDiasMora.main(arreglo);
    	if (contratos.equals("s"))
    		GenerarArchivoContratos.main(arreglo);
    	if (contratosReestructurados.equals("s"))
    		GenerarArchivoContratosReestructurados.main(arreglo);
    	if (contratoTipoBienLeasing.equals("s"))
    		GenerarArchivoContratoTipoBienLeasing.main(arreglo);
    	if (movCierreContable.equals("s"))
    		GenerarArchivoMovCierreContable.main(arreglo);
    	if (movTransaccionesInternas.equals("s"))
    		GenerarArchivoMovTransaccionesInternas.main(arreglo);
    	if (control.equals("s"))  	
    		ArchivoControlRal.main(arreglo);
    	
    	
    	/*
        TablaContratoTipoBienLeasingRal EjecutarContratoTipoBienLeasingRal = new TablaContratoTipoBienLeasingRal();
        EjecutarContratoTipoBienLeasingRal.main(null);*/
        
        //FabricaPojos estructura = new FabricaPojos();
        //estructura.createPOJOS();
    	
    	System.out.println();
    	System.out.println("Finalizando Generacion de Archivos de Datos Inbox");
        
    }
}
