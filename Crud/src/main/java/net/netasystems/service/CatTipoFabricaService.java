package net.netasystems.service;

import java.sql.SQLException;
import java.util.List;

import net.netasystems.dao.CatTipoFabricaDAO;
import net.netasystems.domain.CatTipoFabrica;

/**
 * 
 * @author Neta Systems / Jos� Alfredo Santiago
 *
 */
public class CatTipoFabricaService {
	/**
	 * 
	 */
	private CatTipoFabricaDAO dao;
	
	/**
	 * 
	 * @throws ClassNotFoundException Excepci�n cuando no existe la clase
	 * @throws SQLException  Excepci�n SQL
	 */
	public CatTipoFabricaService() throws ClassNotFoundException, SQLException {
		dao=new CatTipoFabricaDAO();
	}
	
	/**
	 * 
	 * @throws SQLException Excepci�n SQL
	 */
	public void close() throws SQLException {
		dao.destroy();
	}
	
	/**
	 * 
	 * @return una lista
	 * @throws SQLException excepci�n SQL
	 */
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		return dao.getAllRecords();
	}
	
	/**
	 * 
	 * @param record par�metro recibido
	 * @throws SQLException excepci�n SQL
	 */
	public void addRecord(CatTipoFabrica record) throws SQLException {
		dao.addRecord(record);
	}
	

	/**
	 * 
	 * @param record par�metro recibido
	 * @throws SQLException Excepci�n SQL
	 */
	public void updateRecord(CatTipoFabrica record) throws SQLException{
		dao.updateRecord(record);
	}
	
	/**
	 * 
	 * @param record par�metro recibido
	 * @throws SQLException Excepci�n SQL
	 */
	public void deleteRecord(CatTipoFabrica record) throws SQLException{
		dao.deleteRecord(record);
	}
}