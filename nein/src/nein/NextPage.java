package nein;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;



public class NextPage extends HttpServlet
{
	@Override
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	               throws IOException, ServletException {
	      // Set the response message's MIME type
	      response.setContentType("text/html; charset=UTF-8");
	      // Allocate a output writer to write the response message into the network socket
	      PrintWriter out = response.getWriter();
	 
	      // Write the response message, in an HTML page
	      try {
	         out.println("<!DOCTYPE html>");
	         out.println("<html><head>");
	         out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
	         out.println("<title>Echo Servlet</title></head>");
	         out.println("<body><h2>Arigato" + request.getParameter("username") +". You've created an account.</h2>");
	         
	         Cookie usernameCookie = new Cookie("username", request.getParameter("username"));
	         usernameCookie.setMaxAge(60*60*24);
	         response.addCookie(usernameCookie);
	         
	         Cookie passwordCookie = new Cookie("password", request.getParameter("password"));
	         passwordCookie.setMaxAge(60*15);
	         response.addCookie(passwordCookie);
	         
	         Cookie genderCookie = new Cookie("gender", request.getParameter("gender"));
	         genderCookie.setMaxAge(60*60*24);
	         response.addCookie(genderCookie);
	         
	         Cookie ageCookie = new Cookie("age", request.getParameter("age"));
	         ageCookie.setMaxAge(60*60*24);
	         response.addCookie(ageCookie);
	         
	         Cookie languageCookie = new Cookie("languages", request.getParameter("language"));
	         languageCookie.setMaxAge(60*60*24);
	         response.addCookie(languageCookie);
	 
	         // Hyperlink "BACK" to input page
	         out.println("<a href='nein'>BACK</a>");
	         out.println("<a href='account'>Continue To Account</a>");
	 
	         out.println("</body></html>");
	      } finally {
	         out.close();  // Always close the output writer
	      }
	   }

}
