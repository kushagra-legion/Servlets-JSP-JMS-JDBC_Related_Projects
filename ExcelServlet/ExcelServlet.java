import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
//import java.util.*;
public class ExcelServlet extends HttpServlet
{ //static int count=0;
  PrintWriter out;
  public void service (HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
  { res.setContentType("text/html");
    out=res.getWriter();
	out.println("names\thindi\teng\tmaths\ttotal");
	out.println("lalu\t35\t25\t60\tsum(b2:d2)");
	}
}