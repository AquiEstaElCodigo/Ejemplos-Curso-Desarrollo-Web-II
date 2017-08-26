package controlador;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import operacion.Operaciones;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Controlador")
public class Controlador extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	Operaciones operacion;
	
    public Controlador() 
    {
        super();
        operacion = new Operaciones();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException { }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
	
		response.setContentType("text/html");
		PrintWriter mensajes = response.getWriter();	
		
			int a = Integer.parseInt(request.getParameter("num1"));
			int b = Integer.parseInt(request.getParameter("num2"));
			int opcion = Integer.parseInt(request.getParameter("options"));
			
			mensajes.println("<h1>Resultado: " + operacion.determinarResultado(opcion, a, b)
					+ "</h1>");
			
			mensajes.close();
		
	}

}//.
