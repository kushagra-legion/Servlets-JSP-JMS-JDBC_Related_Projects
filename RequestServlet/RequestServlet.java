import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
class RequestServlet extends HttpServlet
 {  public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {  res.setContentType("text/html");
       PrintWriter out=res.getWriter();
	  out.println("<html><body>");
	  String s=req.getMethod();
	  out.println(s);
	  if (s.equals("POST"));
	     doPost(req,res);
	  if (s.equals("GET"));
	     doGet(req,res);
	}
	
	 public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {
      res.setContentType("text/html");
	  PrintWriter out=res.getWriter();
	  out.println("<html><body>");
	  String name=req.getParameter("name");
	  String pass=req.getParameter("pass");
	  try 
	  { Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","mca6");
		Statement s=c.createStatement();
		int x =s.executeUpdate("insert into emp1011 values('''+pass+''','''+name+''')");
		ResultSet rs=s.executeQuery("select * from emp1011");
		ResultSetMetaData rsmd=rs.getMetaData();
		out.println("<table bgcolor='yellow' border=1 width=200>");
		out.println("<tr>");
		for(int i=1;i<=rsmd.getColumnCount();i++)
		{ out.println("<th>"+rsmd.getColumnName(i)+"</th>"); 
		}
		while(rs.next())
		{ out.println("<tr>");
		   out.println("<td>"+rs.getString(1)+"</td>");
		   out.println("<td>"+rs.getString(2)+"</td>");
		   out.println("</tr>");
		}
	 }
	catch(Exception e)
	{ }
	out.println("</table>");
	if(name.equals("101")&&pass.equals("lalu"))
	   out.println("User is post valid ");
	else 
	{ out.println("user is post invalid");
	}
	  out.println("</body></html>");
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
   {  res.setContentType("text/html");
      PrintWriter out=res.getWriter();
	  out.println("<html><body>");
	  String name=req.getParameter("name");
	  String pass=req.getParameter("pass");
      if(name.equals("101")&&pass.equals("lalu"))
	   out.println("User is get valid ");
	else 
	{ out.println("user is get invalid");
	}
	  out.println("</body></html>");
	}
	
}