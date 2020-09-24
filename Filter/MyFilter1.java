import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.sql.*;
public class MyFilter1 implements Filter
{ FilterConfig config;
public void init (FilterConfig config)
{ this.config=config;
}
public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException
  { res.getWriter().println("MyFilter1 via jata hua");
    res.getWriter().println("<br>");
	chain.doFilter(req,res);
	res.getWriter().println("<br>");
	res.getWriter().println("MyFilter1 ka response aata hua");
	res.getWriter().println("<br>");
	}
	public void destroy()
	{
		
	}
}