import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class DemoServlet1 extends HttpServlet
 {  public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {  res.setContentType("text/html");
       PrintWriter out=res.getWriter();
	  HttpSession s=req.getSession();
	  String s1=(String) s.getAttribute("name");
	  String s2=(String) s.getAttribute("id");
	  out.println("<html><body>");
	  out.println(s1+"="+s2+""+s.isNew());
	  out.println("<br>");
	  out.println("<a href='log'>demo</a>");
	  out.println("</body></html>");
	}
}
	  
	  