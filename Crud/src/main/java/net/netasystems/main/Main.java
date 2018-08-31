package net.netasystems.main;
import java.sql.SQLException;
import java.util.List;



import net.netasystems.service.CatTipoFabricaService;
import net.netasystems.domain.CatTipoFabrica;

/**
 * 
 * @author alfre
 * 
 * Clase Main que contiene el metodo main que ejecuta el código 
 *
 */
public class Main {

	public static void main(String[] args) {
		/**
		 * Imprime en consola cuando el programa se inicia
		 */
		System.out.println("Iniciando Programa");
		/**
		 * Objeto del tipo CatTipoFabrica que permite utilizar los metodos de esta clase
		 */
		CatTipoFabrica c1;
		CatTipoFabricaService service = null;
		try {
			/**
			 * Variable service que corresponde al Objeto de tipo CatTipoFabricaService
			 * El ciclo For imprime los elementos obtenidos de la variable service que utiliza el metodo getAllRecords
			 */
			service = new CatTipoFabricaService();
			List<CatTipoFabrica> lista =service.getAllRecords();
			for(CatTipoFabrica c : lista) {
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				service.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Inicio de la inserccion.....");
		
		try {
			/**
			 * Se crea un objeto de tipo CatTipoFabricaService que envia por parametros los datos para realzar la inserccion
			 */
			service = new CatTipoFabricaService();
			c1 = new CatTipoFabrica(7,"Alfredo_Prueba", '5',null, 3);
			/**
			 * Los datos de la inserccion son guardados en el objeto c1 y enviado como parametros al metodo addRecord
			 */
			service.addRecord(c1);
			/**
			 * La variable lista recupera los registros y mediante un ciclo for los imprime en consola al usuario
			 */
			List<CatTipoFabrica> lista =service.getAllRecords();
			for(CatTipoFabrica c : lista) {
				System.out.println(c);
			}
			System.out.println("/////////////////////////////////////////");
			c1.setNombre("Master");
			c1.setIdTipoFabrica(3);
			service.updateRecord(c1);
			System.out.println("Actualizando......");
			for(CatTipoFabrica c : lista) {
				System.out.println(c);
			}
			System.out.println("///////////////////////////////////////////");
			service.deleteRecord(c1);
			for(CatTipoFabrica c : lista) {
				System.out.println(c);
			}
			System.out.println("/////////////////////////////////////////////");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				service.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}