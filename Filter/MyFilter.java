import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.sql.*;
public class MyFilter implements Filter
{ FilterConfig config;
public void init (FilterConfig config)
{ this.config=config;
}
public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException
  { PrintWriter out=res.getWriter();
    ServletContext ctx=config.getServletContext();
	Integer count=(Integer) ctx.getAttribute("count");
	if(count==null)
	{ count=new Integer(0);
	}
	count=new Integer(count.intValue()+1);
	ctx.setAttribute("count",count);
	out.println("<br>");
	out.println("myfilter jata hua");
	out.println("<br>");
	chain.doFilter(req,res);
	out.println("MyFilter response aata hua ");
	out.println("<br>");
	}
	public void destroy()
	{
		
	}
}
	