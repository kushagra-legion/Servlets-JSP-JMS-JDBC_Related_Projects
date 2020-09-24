import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;
@WebServlet
( asyncSupported=true,value="/ace",loadOnStartup=1)

public class AsyncContextExample extends HttpServlet
{public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
{ doGet(req,res);}
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException
{ res.setContentType("text/html");
PrintWriter out =res.getWriter();
AsyncContext asyncContext=req.startAsync();
asyncContext.setTimeout(0);
ServletRequest servReq= asyncContext.getRequest();
boolean b=servReq.isAsyncStarted();
out.println("isAsyncStarted:"+b);
asyncContext.dispatch("hello");
out.println(Thread.currentThread().getName());
out.println("<br/>asynchronous task finished");
}
}