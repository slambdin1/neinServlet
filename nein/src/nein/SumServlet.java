package nein;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;

public class SumServlet extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException 
	{
		int firstNum = Integer.parseInt(request.getParameter("firstNum"));
		int secondNum = Integer.parseInt(request.getParameter("secondNum"));
		response.getWriter().write(firstNum + secondNum);
	}
}
