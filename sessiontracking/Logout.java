import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class Logout extends HttpServlet
 {  public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {  res.setContentType("text/html");
       PrintWriter out=res.getWriter();
	  HttpSession s=req.getSession();
	  if(s!=null)
	  { s.invalidate();
	    out.println("<html><body>");
		out.println("you loged out succesfully ");
		out.println("<br>");
		out.println("<a href='login.html'>login</a>");
		out.println("</body></html>");
	  }
	   else 
	     out.println("bavari pooch login to kar le");
	}
	}