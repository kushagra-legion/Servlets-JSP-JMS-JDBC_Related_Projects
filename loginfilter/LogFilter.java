import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class LogFilter implements Filter
{ private FilterConfig filterconfig=null;
  public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException
  { long start=System.currentTimeMillis();
    String address=req.getRemoteAddr();
    String file=((HttpServletRequest)req).getRequestURI();
	filterconfig.getServletContext().log("user access!"+"user ip:"+address+ "resource:" +file+"Milliseconds used:"+(System.currentTimeMillis()-start)
	);
	chain.doFilter(req,res);
	PrintWriter out=res.getWriter();
	out.println("log filter");
	}
	public void destroy()
	{
	}
	public void init (FilterConfig filterconfig)
{ this.filterconfig=filterconfig;
}
}