package controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "operar", urlPatterns = { "/operar" })
public class IndexServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

    public IndexServlet() {
        super();
    }

    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int iUno = Integer.parseInt(num1);
		int iDos = Integer.parseInt(num2);

		String buttonSuma = request.getParameter("suma");
		String buttonResta = request.getParameter("resta");
		int resultado = 0;
		
		if (buttonSuma != null)
			resultado = iUno + iDos;
		
		if (buttonResta != null)
			resultado = iUno - iDos;
		
		// Mandar datos con el request
		request.setAttribute("resultadoRequest", resultado);
		// Mandar datos con el Session
		request.getSession().setAttribute("resultadoSession", resultado);
		// Mandar datos con el contexto
		getServletContext().setAttribute("resultadoContext", resultado);

		RequestDispatcher requestDispatcher;
		
		requestDispatcher = request.getRequestDispatcher("/views/resultado.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { }

	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { }

}
