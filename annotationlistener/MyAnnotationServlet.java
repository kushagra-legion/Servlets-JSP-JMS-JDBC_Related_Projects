import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.sql.*;
@WebServlet(name="MyAnnotationServlet",urlPatterns=
   {"/listener"})
   public class MyAnnotationServlet extends HttpServlet
   { public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
   { res.setContentType("text/html");
     PrintWriter out=res.getWriter();
	 ServletContext ctx=getServletContext();
	 String s=(String) ctx.getAttribute("name");
	 out.println("<h2>Hello world servlet Annotation</h2>"+s);
	 out.close();
	 }
	 }
	 