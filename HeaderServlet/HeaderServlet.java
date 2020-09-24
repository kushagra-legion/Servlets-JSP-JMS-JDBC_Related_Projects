import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;
public class HeaderServlet extends HttpServlet
{ 
  public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
  { PrintWriter out=res.getWriter();
    res.setContentType("text/html");
    Enumeration e= req.getHeaderNames();
	while(e.hasMoreElements())
	{ String name=(String) e.nextElement();
	  String value=req.getHeader(name);
	  out.println(name+":"+value);
	  out.println("<br>");
	}
	out.println("protocol:"+req.getProtocol());
	out.println("<br>");
	out.println("method "+req.getMethod());
	out.println("<br>");
	out.println("URI: "+req.getRequestURI());
	out.println("<br>");
	out.println("Content type:"+req.getContentType());
	out.println("<br>");
	}
}
	
	