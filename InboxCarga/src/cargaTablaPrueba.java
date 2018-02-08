
//carga tabla MAE_CLIENTES_CALIFICACIONES
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import connection.ConnectionBuilder;	
public class cargaTablaPrueba {
	 public static void main(String[] parametro) throws SQLException {

	
	Random rnd = new Random();
	PreparedStatement pstmt = ConnectionBuilder.buildConnection().prepareStatement("insert into inbox.MAE_CLIENTES_CALIFICACIONES(\r\n" + 
			"ID_TANDA,USUARIO_CREACION,ID_EXPORT,COD_CLASE_CARTERA,COD_ENTIDAD,USUARIO_ACTUALIZACION,FEC_CORTE_CONTBL,COD_LEGADO,ID_FILA_ORIGEN_LEGADO,FECHA_EXPORT\r\n" + 
			",ID_CLIENTE,COD_CALIF_CLIENTE,ESTADO_REGISTRO,FUENTE_INFORMACION,FEC_ACTUALIZ,COD_TIPO_IDENT,FEC_CREACION) \r\n" + 
			"values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
	
	int p_ID_TANDA = 1000 + (rnd.nextInt(9999999 + 1) - 1000);
	
   int i = 1;
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
	
	
		
		
		
	 pstmt.setInt(1, p_ID_TANDA);
	 pstmt.setString(2, p_USUARIO_CREACION);	
	 pstmt.setInt(3, p_ID_EXPORT);	
	 pstmt.setInt(4, p_COD_CLASE_CARTERA);
	 pstmt.setString(5, p_COD_ENTIDAD);	
	 pstmt.setString(6, p_USUARIO_ACTUALIZACION);	
	 //pstmt.setDate(7, java.sql.Date.valueOf(java.time.LocalDate.now()));
	 pstmt.setDate(7, java.sql.Date.valueOf(p_FEC_CORTE_CONTBL));
	 //pstmt.setString(7, p_FEC_CORTE_CONTBL);	
	 pstmt.setInt(8, p_COD_LEGADO);	
	 pstmt.setInt(9, p_ID_FILA_ORIGEN_LEGADO);	
	 pstmt.setDate(10, java.sql.Date.valueOf(java.time.LocalDate.now()));
	 //pstmt.setString(10, p_FECHA_EXPORT);	
	 pstmt.setInt(11, p_ID_CLIENTE);	
	 pstmt.setInt(12, p_COD_CALIF_CLIENTE);	
	 pstmt.setString(13, p_ESTADO_REGISTRO);	
	 pstmt.setString(14, p_FUENTE_INFORMACION);	
	 pstmt.setDate(15, java.sql.Date.valueOf(java.time.LocalDate.now()));
	 pstmt.setString(15, p_FEC_ACTUALIZ);	
	 pstmt.setInt(16, p_COD_TIPO_IDENT);
	 pstmt.setDate(17, java.sql.Date.valueOf(java.time.LocalDate.now()));
	// pstmt.setString(17, p_FEC_CREACION);
	 pstmt.executeUpdate();
	
  }
   pstmt.close();
}
}
