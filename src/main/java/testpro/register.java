package testpro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet ("/register")
public class register extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException
		      {
		 HttpSession session = request.getSession();
		 String key=request.getParameter("key");
		String value= request.getParameter("value");
		session.setAttribute(key, value);
		
		
		PrintWriter out=response.getWriter();
		out.print("wellcome <br><br>");
		out.print(session.getAttribute(key));
		response.sendRedirect("home.jsp");
		
		
		      }

}
