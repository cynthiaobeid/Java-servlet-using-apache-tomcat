import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class TestServlet extends HttpServlet {
 public void service( HttpServletRequest request, 
HttpServletResponse response ) 
 throws ServletException, IOException { 
response.setContentType( "text/html" ); 
PrintWriter out = response.getWriter();
String s1=request.getParameter("tf1"); 
out.println( "<html><body>" ); 
out.println( "<h1>Bonjour "+s1+"</h1>" ); 
out.println( "</body></html>" ); 
 } 
}