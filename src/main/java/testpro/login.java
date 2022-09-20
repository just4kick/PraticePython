package testpro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet ("/login")
public class login extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException
		      {
		
		HttpSession session = request.getSession(false);
		String key=request.getParameter("key");
		PrintWriter out=response.getWriter();
		//out.print("wellcome");
		if(session.getAttribute(key)==null)
		{
			out.print("need to register");
		}
		else
		{
			out.print(session.getAttribute(key));
		}
		
		
		
		
		      }

}
