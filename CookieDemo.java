
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
    
    Cookie c1 = new Cookie("unm", "admin");
    Cookie c2 = new  Cookie("ip", request.getLocalAddr());
    Cookie c3 = new Cookie("datetime", new java.util.Date().toString());
    
    c1.setMaxAge(60);
    c2.setMaxAge(60);
    c2.setMaxAge(60);
    
    response.addCookie(c3);
    response.addCookie(c2);
    response.addCookie(c1);
    
    out.println("<center><h1>welcome to my web world to see more information  <a href = 'CookieDemo?val=1'> Click Here.....</a></h1></center> " );
    
       if(request.getParameter("val").equals("1"));
       {
           Cookie c[] = request.getCookies();
           for(int i=0; i<c.length;i++)
           {
                out.println("<hr>Cookie Name is:" + c[i].getName() + "and value is : " + c[i].getValue() + "it's age is : " + c[i].getMaxAge());
           }
       }
    }
    }
