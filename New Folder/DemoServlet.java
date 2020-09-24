import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
public class DemoServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String a=req.getParameter("sub");
		out.println(a);
		
		String to=req.getParameter("to");
				out.println(to);
		String bodyme=req.getParameter("reciver");
				out.println(bodyme);
		//String to="arti.kumari239@gmail.com";
		Properties prop=new Properties();
		prop.put("mail.smtp.host", "smtp.gmail.com");
			prop.put("mail.smtp.port","465");
			prop.put("mail.smtp.auth","true");
		prop.put("mail.smtp.socketFactory.port","465");
		prop.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
		
		
	
		try{
			
			Session session=Session.getInstance(prop,new MyAuth());
			MimeMessage message=new MimeMessage(session);
			message.setFrom(new InternetAddress(to));
			message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
			message.setSubject(a);
			Multipart body=new MimeMultipart();
			MimeBodyPart part1=new MimeBodyPart();
			part1.setText(bodyme);
			body.addBodyPart(part1);
			MimeBodyPart part2=new MimeBodyPart();
			FileDataSource fds=new FileDataSource("E:\\Assignment\\J2EE\\MailServer\\files\\pic_bulbon.gif");
			part2.setDataHandler(new DataHandler(fds));
			part2.setFileName(fds.getName());
			body.addBodyPart(part2);
			message.setContent(body);
			Transport.send(message);
			System.out.println("Message sent sucssesful");
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("<html><body>");
		out.println("<br>");
		out.println("mail Sent");
		out.println("<br>");
		out.println("</body></html>");
	}
	
}