package conexion;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;





// No se te olvide introducir en Path el controlador JDBC de Filemaker

public class Conexion {
	

	static String bd ="prueba"; //Cambiar -prueba- por el nombre de tu base de datos
	static String url="jdbc:filemaker://192.168.1.38/"+bd+"?SocketTimeout=3000"; //Cambiar -192.168.1.38- por tu IP o dominio donde tienes alijada tu base de datos
	static String userName="prueba"; //cambia -prueba- por tu usuario de la base de datos
	static String password="prueba"; // cambia -prueba- por tu password de la base de datos
	
	
	// metodo para establecer conexion a la base de datos
	public static Connection conexionFilemaer() {
		Connection conn = null;

		try {
			// Le indicamos cual es el controlador que tiene que utilizar
			Class.forName("com.filemaker.jdbc.Driver");
			//Creamos la conexion
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("Conectado");
			//retornamos la conexion
			return conn;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
}
	

	public static <T> List<T> query(Class<T> clase,String sql) throws IllegalAccessException{
		obtenerAtributos(clase);
		sql=obtenerAtributos(clase);
		Connection cnn;
		cnn=conexionFilemaer();
		Statement st;
		ResultSet datos = null;
		try {
			st = cnn.createStatement();
			datos = st.executeQuery(sql);
			if (datos == null) {
				System.out.println("No hay resultados");
				st.close();
				
			}
			System.out.println(datos.getDouble(1));
			

		} catch (SQLException e) {
			System.out.print(e.toString());
		}
		 
		return null;
	}


    private static <T> String obtenerAtributos(Class<T> clase) throws IllegalAccessException {
    	Field[] fields = clase.getDeclaredFields();	    
    	int n=0;
    	 try {
    			for(Field field : fields) {
            	n++;}
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
    	 String atributos[];
    	 atributos = new String[n];
    	 int j=0;
    	for(Field field : fields) {
            try {
            
            	String fieldName = field.getName();
            	//System.out.println(fieldName);
            	if(fieldName != null) {
            		atributos[j]=fieldName;}
            		j++;
            
				
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
    	}
    	String consulta="Select ";
   	 
	
		
		for(Field field : fields) {
                try {
                	String fieldName = field.getName();               	
               
				//	System.out.println(fieldName + ":" + fieldValue);
					consulta = consulta + fieldName +", ";
				} catch (Exception e) {
					 System.out.print(e.toString());
				}
               
            }
		consulta =quitarUltimacoma(consulta) + " FROM " + clase.getSimpleName();
		 System.out.println(consulta);
		return consulta; 
    }
	
    private static String quitarUltimacoma(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, str.length() - 2);
    }

}
