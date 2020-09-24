import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
/*@WebServlet
( name="MyAnnotationServlet", urlpatterns={"/hello"})*/
@WebServlet(name="MyAnnotationServlet",urlPatterns=
   {"/hello"})
public class MyAnnotationServlet extends HttpServlet
{public void service(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
{ res.setContentType("text/html");
PrintWriter out =res.getWriter();
out.println("<h2>Hello world servlet annotation </h2>");
out.println(Thread.currentThread().getName());
try{
Thread.sleep(3000);
}
catch(Exception e){}
out.close();
}
}