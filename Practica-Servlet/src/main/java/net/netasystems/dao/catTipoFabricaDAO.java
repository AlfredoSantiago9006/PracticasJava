package net.netasystems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.netasystems.domain.catTipoFabrica;

public class catTipoFabricaDAO {
private Connection con;
	

	/**
	 * Metodo publico catTipoFabricaDAO. que realiza la conexion a la base de datos
	 *
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 */
	public catTipoFabricaDAO() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(  
				"jdbc:oracle:thin:@198.23.75.98:1521:neta","EGLOBAL","egl0b4l");  
	}

	/**
	 * Metodo vacio destroy que cierra la base de datos 
	 *
	 * @throws SQLException Excepcion de SQL que permite ejecutarse aunque haya errores
	 */
	public void destroy() throws SQLException {
		con.close();
	}
	

	/**
	 * Metodo getAllRecords recupera los registros dentro de la tabla que se va a consultar a traves de una consulta que es mandada
	 * en forma de cadena de texto
	 *
	 * @return the all records
	 * @throws SQLException the SQL exception
	 */
	public List<catTipoFabrica> getAllRecords() throws SQLException{
		List<catTipoFabrica> lista = new ArrayList<catTipoFabrica>();
		String sql = "select IDCATTIPOFABRICA, NOMBRE, ESTATUS, FECHAMODIFICACION, IDUSUARIO from CAT_TIPO_FABRICA";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) { // while rs have a result add to list lista 
			long idCatTipoFabrica = rs.getLong("IDCATTIPOFABRICA");
			String nombre = rs.getString("NOMBRE");
			String estatusString = rs.getString("ESTATUS");
			Date fechaModificacion = rs.getDate("FECHAMODIFICACION");
			Long idUsuario = rs.getLong("IDUSUARIO");
			//little fix for casting String at char
			Character status = null;
			if(estatusString != null && !estatusString.isEmpty()) { // if statusString isn´t empty or null cast a Charater else do nothing 
				char est = estatusString.charAt(0);
				status = est;
			}
			catTipoFabrica registro = new catTipoFabrica(idCatTipoFabrica, nombre, status, fechaModificacion, idUsuario);
			lista.add(registro);
		}
		rs.close();
		stmt.close();
		return lista;
	}
	
	
	/**
	 * Metodo UpdateRecord realiza una actualizacion dentro de una tabla especifica recibiendo como parametros los campos a actualizarse
	 * y mandandolos a traves de una consulta sql a la base de datos en forma de una cadena de texto
	 *
	 * @param record the record
	 * @return the int
	 * @throws SQLException the SQL exception
	 */
	public int updateRecord(catTipoFabrica record) throws SQLException {
		String sql = "UPDATE CAT_TIPO_FABRICA SET NOMBRE = ?,ESTATUS= ?, FECHAMODIFICACION = ?, IDUSUARIO = ? WHERE IDCATTIPOFABRICA=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, record.getNombre());
		pstmt.setString(2, record.getStatus()+"");
		pstmt.setDate(3, (java.sql.Date) record.getFechaDeModificacion()); 
		pstmt.setLong(4,record.getIdUsuario());
		pstmt.setLong(5, record.getIdTipoFabrica());
		int x =pstmt.executeUpdate();
		pstmt.close();
		return x;	
	}
	
	/**
	 * Clase addRecord realiza una inserccion en la base de datos
	 *
	 * @param record 
	 * @return 
	 * @throws SQLException excepcion sql
	 */
	public int addRecord(catTipoFabrica record) throws SQLException {
		String sql = "INSERT INTO cat_tipo_fabrica VALUES (?,?,?,?,?)"; //Consulta sql que inserta los parametros recibidos
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setLong(1, record.getIdTipoFabrica());
		pstmt.setString(2, record.getNombre());
		pstmt.setString(3, record.getIdTipoFabrica()+"");
		pstmt.setDate(4, (java.sql.Date) record.getFechaDeModificacion());
		pstmt.setLong(5, record.getIdUsuario());
		int x = pstmt.executeUpdate();
		pstmt.close();
		return x;
	}
	
	
	/**
	 * Clase deleteRecord
	 *
	 * @param record registro
	 * @return regresa un entero
	 * @throws SQLException excepcion sql
	 */
	public int deleteRecord(catTipoFabrica record) throws SQLException {
		String sql ="DELETE FROM CAT_TIPO_FABRICA WHERE IDCATTIPOFABRICA = ?";//Borra el registro por IDCATTIPOFABRICA
		int x =0;
		if(!checkIdUse(record.getIdTipoFabrica())) {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, record.getIdTipoFabrica());
			x = pstmt.executeUpdate();
			pstmt.close();
		}
		return x;
	}
	
	
	/**
	 * clase checkIdUse revisa si el IDCATTIPOFARICA no este siendo usado por otro registro
	 *
	 * @param id id de parametro
	 * @return true si esta disponible
	 * @throws SQLException the SQL exception
	 */
	public boolean checkIdUse (Long id) throws SQLException {
		String sql = "Select 1 from CAT_TIPO_FABRICA WHERE IDCATTIPOFABRICA = ?";
		PreparedStatement ps = con.prepareStatement(sql);
	    ps.setLong(1, id);
	    ResultSet rs = ps.executeQuery();
		return rs.next();
	}

}
