import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// TODO: Auto-generated Javadoc
/**
 * @author alfre
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
	 */
	public static void main(String[] args) throws Exception{
		System.out.println("Inicio del Programa");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// Conecta a la base de datos mandando como parametros la direccion ip, numero de puerto, nombre, usuario y contraseña
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@198.23.75.98:1521:neta", "EGLOBAL", "egl0b4l");
		//Checkpoint que nos permite ver si la conexión fue exitosa
		System.out.println("Conexion realizada");
		Statement stmt = con.createStatement();
		// Query que realiza una select a todos los datos de la tabla cat_tipo_fabrica
		ResultSet rs = stmt.executeQuery("select * from cat_tipo_fabrica");
		System.out.println("Query realizado");
		while(rs.next()) {
			
			String miNombreLocal = rs.getString("NOMBRE");
			System.out.println("El nombre es: "+ miNombreLocal);
		}
		rs.close();
		stmt.close();
		con.close();

	}

}
