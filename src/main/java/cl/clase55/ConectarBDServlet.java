package cl.clase55;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ConectarBDServlet
 */
public class ConectarBDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConeccionBaseDatos coneccionBaseDatos=new ConeccionBaseDatos();
		boolean resultado=coneccionBaseDatos.initConeccion();
		String resultadoConn = (resultado) ? "Conectado":"No Conectado";
		String html ="""
				<html>
					<body>
						<h1>Estado de la coneccion a la bd: __resultado__</h1>
					</body>
				</html>
			""".replace("__resultado__",resultadoConn );
		response.getWriter().println(html);
	}

}
