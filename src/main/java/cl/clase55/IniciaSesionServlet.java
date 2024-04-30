package cl.clase55;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/inicia-sesion")
public class IniciaSesionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession(true);
		
		session.setAttribute("usuario", "Pepito");
		session.setAttribute("rol", "administrador");
		
		
		String html ="""
				<html>
					<body>
						<h1> Variables de sesion creadas</h1>
						
					</body>
				</html>
			""";
		resp.getWriter().println(html);
	}

	
}
