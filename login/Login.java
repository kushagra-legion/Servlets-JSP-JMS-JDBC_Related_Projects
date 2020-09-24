import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.sql.*;
public class Login extends HttpServlet
{ 
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
  { res.setContentType("text/html");
    PrintWriter out=res.getWriter();
    String name=req.getParameter("name");
	  String pass=req.getParameter("pass");
	  out.println("<html><body>");
		out.println("name is: "+name);
		 out.println("</html></body>");
	 
	  try{
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		/* PreparedStatement ps = c.prepareStatement("select * from emp102 where NAME=? and PASS=?");
            ps.setString(1, name);
            ps.setString(2, pass);
            ResultSet rs =ps.executeQuery();*/
            //st = rs.next();

		Statement s=c.createStatement();
		String s1="select * from emp102 where name='''+name+'''and pass ='''+pass+'''";
		ResultSet rs=s.executeQuery(s1);
		if(rs.next())
		{ out.println("<html><body>");
		out.println("user valid ");
		 out.println("</html></body>");
	       res.sendRedirect("https://localhost:7001/m1/wel");
		}
		else { 
		 out.println("<html><body>");
		out.println("user invalid ");
		 out.println("</html></body>");
		}
		}catch(Exception e){out.println(e);}
		
		}
		public void destroy()
		{}
		}
		