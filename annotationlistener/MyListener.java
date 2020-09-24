import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;
import java.sql.*;
@WebListener
public class MyListener implements ServletContextListener
{ public void contextInitialized(ServletContextEvent e)
  { try
    { ServletContext ctx=e.getServletContext();
	  ctx.setAttribute("name","ducat");
	  System.out.println("context created ");
	}
	catch(Exception e1){}
	}
	public void contextDestroyed(ServletContextEvent e)
	{ 
	}
}
