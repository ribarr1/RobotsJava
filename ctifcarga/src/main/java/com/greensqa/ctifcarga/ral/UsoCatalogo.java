package com.greensqa.ctifcarga.ral;

import java.util.Scanner;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;

import com.greensqa.ctifcarga.ral.dto.MAE_CONTRATO_TIPO_BIEN_LEASING;
import com.greensqa.ctifcarga.util.ConnectionBuilder;

public class UsoCatalogo {
	 public static void main(String[] parametro) throws SQLException {
		 Catalogos dato = new Catalogos();
		//System.out.println(dato.getCod_calificacion());
		// System.out.println(dato.getCod_CategoriaValorizacion());
		// System.out.println(dato.getCod_Ciiu());
		//System.out.println(dato.getCod_ClasesCarteras());
		 //System.out.println(dato.getCod_Legado("0103"));
		//System.out.println(dato.getCod_Pais());
		 //System.out.println(dato.getCod_SegmentoComercialCliente("0149"));
		 System.out.println(dato.getCod_EstadoCliente());
		

		
		         Scanner myVar = new Scanner(System.in);
		         System.out.println(myVar.nextLine());  
		         
		         int[ ] primes = {2, 3, 5, 7};

		         for (int t: primes) {
		            System.out.println(t); 
		         }
		     
	
}
}
