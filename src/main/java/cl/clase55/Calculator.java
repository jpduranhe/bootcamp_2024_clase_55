package cl.clase55;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		
		if(session.getAttribute("usuario")==null) {
			
			String html ="""
					<html>
						<body>
							<h1> Usted no esta autenticado</h1>
							
						</body>
					</html>
				""";
			response.getWriter().println(html);
			
		}else {
			String numero1,numero2;
			
			numero1=request.getParameter("numero1");
			numero2=request.getParameter("numero2");
			
			if((numero1== null || numero1.trim().isBlank()) || (numero2== null || numero2.trim().isBlank()) ) {
				response.sendRedirect("error_formulariojsp.jsp");
			}else {
				
				int num1= Integer.parseInt(numero1);
				int num2= Integer.parseInt(numero2);
				int resultadoCalculo=num1+num2;	
				
				request.setAttribute("resultadoCalculo", resultadoCalculo);
				
				request.getRequestDispatcher("resultado_calculator.jsp").forward(request, response);
			}
			
		}
		
		
	}
}
