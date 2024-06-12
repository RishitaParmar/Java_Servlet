

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class welcomepage extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
HttpSession s = request.getSession(true);
out.print("<center><h1>Welcome user " + s.getAttribute("unm"));      
out.print("<center>You Logged in at " + s.getAttribute("datetime"));      
out.print("<center>Max Inactive time =  "+ s.getMaxInactiveInterval());      


    }

}
