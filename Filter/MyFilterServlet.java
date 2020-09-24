import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class MyFilterServlet extends HttpServlet
 {  public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {  res.setContentType("text/html");
       PrintWriter out=res.getWriter();
	   ServletContext ctx=getServletContext();
	   Integer count=(Integer) ctx.getAttribute("count");
	   out.println("via Servlet="+count.intValue());
	   out.println("<br>");
	   }
	   }