package net.netasystems.service;

import java.sql.SQLException;
import java.util.List;

import net.netasystems.dao.CatTipoFabricaDAO;
import net.netasystems.domain.CatTipoFabrica;

/**
 * 
 * @author Neta Systems / José Alfredo Santiago
 *
 */
public class CatTipoFabricaService {
	/**
	 * 
	 */
	private CatTipoFabricaDAO dao;
	
	/**
	 * 
	 * @throws ClassNotFoundException Excepción cuando no existe la clase
	 * @throws SQLException  Excepción SQL
	 */
	public CatTipoFabricaService() throws ClassNotFoundException, SQLException {
		dao=new CatTipoFabricaDAO();
	}
	
	/**
	 * 
	 * @throws SQLException Excepción SQL
	 */
	public void close() throws SQLException {
		dao.destroy();
	}
	
	/**
	 * 
	 * @return una lista
	 * @throws SQLException excepción SQL
	 */
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		return dao.getAllRecords();
	}
	
	/**
	 * 
	 * @param record parámetro recibido
	 * @throws SQLException excepción SQL
	 */
	public void addRecord(CatTipoFabrica record) throws SQLException {
		dao.addRecord(record);
	}
	

	/**
	 * 
	 * @param record parámetro recibido
	 * @throws SQLException Excepción SQL
	 */
	public void updateRecord(CatTipoFabrica record) throws SQLException{
		dao.updateRecord(record);
	}
	
	/**
	 * 
	 * @param record parámetro recibido
	 * @throws SQLException Excepción SQL
	 */
	public void deleteRecord(CatTipoFabrica record) throws SQLException{
		dao.deleteRecord(record);
	}
}