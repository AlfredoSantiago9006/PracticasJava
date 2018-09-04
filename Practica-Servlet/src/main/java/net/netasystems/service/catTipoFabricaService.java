package net.netasystems.service;

import java.sql.SQLException;
import java.util.List;

import net.netasystems.dao.catTipoFabricaDAO;
import net.netasystems.domain.catTipoFabrica;

public class catTipoFabricaService {

private catTipoFabricaDAO dao;
	
	
	public catTipoFabricaService() throws ClassNotFoundException, SQLException {
		dao=new catTipoFabricaDAO();
	}
	
	
	public void close() throws SQLException {
		dao.destroy();
	}
	
	
	public List<catTipoFabrica> getAllRecords() throws SQLException{
		return dao.getAllRecords();
	}
	
	
	public void addRecord(catTipoFabrica record) throws SQLException {
		dao.addRecord(record);
	}
	

	public void updateRecord(catTipoFabrica record) throws SQLException{
		dao.updateRecord(record);
	}
	
	
	public void deleteRecord(catTipoFabrica record) throws SQLException{
		dao.deleteRecord(record);
	}
}
