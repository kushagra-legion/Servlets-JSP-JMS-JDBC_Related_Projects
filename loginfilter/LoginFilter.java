import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.sql.*;
public class LoginFilter implements Filter
{ FilterConfig config;
public void init (FilterConfig config)
{ this.config=config;
}
public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws ServletException,IOException
  { PrintWriter out=res.getWriter();
    String name=req.getParameter("name");
	  String pass=req.getParameter("pass");
	  try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		Statement s=c.createStatement();
		String s1="select * from emp102 where NAME='''+name+'''and PASS ='''+pass+'''";
		ResultSet rs=s.executeQuery(s1);
		if(rs.next())
		{ chain.doFilter(req,res);
		}
		else { out.println("user invalid ");
		}
		}catch(Exception e){out.println(e);}
		out.println("loginfilter");
		}
		public void destroy()
		{}
		}
		