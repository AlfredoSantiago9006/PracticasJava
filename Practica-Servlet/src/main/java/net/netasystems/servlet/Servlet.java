package net.netasystems.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.netasystems.domain.catTipoFabrica;
import net.netasystems.service.catTipoFabricaService;

/**
 * Clase Servlet extiende de HttpServlet
 * @author Neta Systems / Jose Alfredo 
 * 
 */
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<table border = \"1\" width = \"600\">");
		response.getWriter().append("<tr bgcolor = \"blue\">");
		response.getWriter().append("<th>IdTipoFabrica</th>");
		response.getWriter().append("<th>Nombre</th>");
		response.getWriter().append("<th>Fecha Modificacion</th>");
		response.getWriter().append("<th>Id Usuario</th>");
		response.getWriter().append("</tr>");
		
		
		catTipoFabrica c1;
		catTipoFabricaService service = null;
		try {
			/**
			 * Variable service que corresponde al Objeto de tipo CatTipoFabricaService
			 * El ciclo For imprime los elementos obtenidos de la variable service que utiliza el metodo getAllRecords
			 */
			service = new catTipoFabricaService();
			List<catTipoFabrica> lista =service.getAllRecords();
			response.getWriter().append("<style type='text/css'>\r\n" + 
					"tr:nth-child(odd) {\r\n" + 
					"background-color:#F06150;\r\n" + 
					"}\r\n" + 
					"tr:nth-child(even) {\r\n" + 
					"background-color:#F38C58;\r\n" + 
					"}\r\n" + 
					"</style>");
			for(catTipoFabrica c : lista) {
				
				response.getWriter().append("<tr>");
				response.getWriter().append("<td>"+ c.getIdTipoFabrica()+ "</td>");
				response.getWriter().append("<td>"+ c.getNombre()+ "</td>");
				response.getWriter().append("<td>"+ c.getFechaDeModificacion() + "</td>");
				response.getWriter().append("<td>" + c.getIdUsuario() + "</td>");
				response.getWriter().append("</tr>");
				
			}
			response.getWriter().append("</table>");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				service.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
