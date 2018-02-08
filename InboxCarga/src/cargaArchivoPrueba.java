import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

public class cargaArchivoPrueba {
	
	public static void main(String[] parametro) throws SQLException, IOException {
	String ruta = "C:\\Users\\CarolinaLeal\\eclipse-workspace\\InboxCarga\\archivo.txt";
	File archivo = new File(ruta);
	BufferedWriter bw;
	if(archivo.exists()) {
		System.out.println(" El archivo ya EXISTE, favor validar");
		
	} else {
		Random rnd = new Random();
		   int p_ID_TANDA = 1000 + (rnd.nextInt(9999999 + 1) - 1000);
		   int i = 1;
		   bw = new BufferedWriter(new FileWriter(archivo));
		   while (i <= 1000) {
			 System.out.println("  "+i);
			    i++; 	
				String p_USUARIO_CREACION = "ribarra";
				int p_ID_EXPORT = 1000 +(rnd.nextInt(9999999 + 1) - 1000);
				int p_COD_CLASE_CARTERA =  1 + (rnd.nextInt(9 + 1) - 1);
				String entrada[] = {"0101", "0104", "0107", "0109"};
				double x = Math.random()*(entrada.length+0);
				String p_COD_ENTIDAD = entrada[(int) x];
				String p_USUARIO_ACTUALIZACION = "ribarra";
				String p_FEC_CORTE_CONTBL =  "2018-01-16";
				int p_COD_LEGADO = 100 + (rnd.nextInt(999 + 1) - 100);
				//System.out.println("p_COD_LEGADO "+p_COD_LEGADO);
				int p_ID_FILA_ORIGEN_LEGADO = 10 + (rnd.nextInt(99 + 1) - 10);
				String p_FECHA_EXPORT = "10/01/2018}";
				int p_ID_CLIENTE = 1000 + (rnd.nextInt(9999 + 1) - 1000);
				int p_COD_CALIF_CLIENTE = 1 + (rnd.nextInt(9 + 1) - 1);
				//System.out.println(" p_COD_CALIF_CLIENTE "+p_COD_CALIF_CLIENTE);
				String entrada1[] = {"0K","ENTREGADO CORE","ENTREGADO","INACTIVO","INCONSISTENTE","NO VALIDADO"};
				x = Math.random()*(entrada1.length+0);
				String p_ESTADO_REGISTRO = entrada1[(int) x];
				String entrada2[] = {"CRM","LEGADO","SARC"};
				x = Math.random()*(entrada2.length+0);
				String p_FUENTE_INFORMACION = entrada2[(int) x];
				String p_FEC_ACTUALIZ = "10/01/2018";
				int p_COD_TIPO_IDENT = 1 + (rnd.nextInt(9 + 1) - 1);
				String p_FEC_CREACION = "10/01/2018";
						
	             bw.write(p_ID_TANDA+"||"+p_USUARIO_CREACION+"||"+p_ID_EXPORT+"||"+p_COD_CLASE_CARTERA+"||"+p_COD_ENTIDAD+"||"+p_USUARIO_ACTUALIZACION+"||"+p_FEC_CORTE_CONTBL+"||"+p_COD_LEGADO+"||"+p_ID_FILA_ORIGEN_LEGADO+"||"+p_FECHA_EXPORT+"||"+p_ID_CLIENTE+"||"+p_COD_CALIF_CLIENTE+"||"+p_ESTADO_REGISTRO+"||"+p_FUENTE_INFORMACION+"||"+p_FEC_ACTUALIZ+"||"+p_COD_TIPO_IDENT+"||"+p_FEC_CREACION);
	             bw.newLine();
		   }
	     bw.close();
	}
	
	}

}
