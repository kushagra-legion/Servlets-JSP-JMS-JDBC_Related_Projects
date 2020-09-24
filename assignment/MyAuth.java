import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
class MyAuth extends javax.mail.Authenticator
{ protected PasswordAuthentication getPasswordAuthentication()
{ return new PasswordAuthentication("kushgupta66@gmail.com","manish15@");
}
}
