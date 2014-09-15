package nein;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class helloNein extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		try
		{	
			RequestDispatcher view = request.getRequestDispatcher("neinHome.html");
			view.forward(request, response);
		}
		finally
		{
			out.close();
		}
	}

}
