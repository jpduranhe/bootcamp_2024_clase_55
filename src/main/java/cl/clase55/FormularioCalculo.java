package cl.clase55;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FormularioCalculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String html ="""
				<html>
					<body>
						
						
						<form action="/clase_55/Calculator">
							<label>Numero 1</label>
							<input name="numero1" required/>
							<br/>
							<label>Numero 2</label>
							<input name="numero2" required/>
							<br/>
							<button>Calcular</button>
						</form>
					</body>
				</html>
			""";
		response.getWriter().println(html);
	}


}
