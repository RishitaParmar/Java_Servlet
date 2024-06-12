

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Session extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String unm = request.getParameter("txtunm");
        String psw = request.getParameter("txtpsw");
    
    if(unm.equalsIgnoreCase("BCA") && psw.equalsIgnoreCase("Morning"))
    {
            HttpSession s1 = request.getSession();
            s1.setAttribute("unm", unm);
            s1.setAttribute("datetime", new java.util.Date().toString());
            s1.setMaxInactiveInterval(1000*60);
            response.sendRedirect("./welcomepage");
            
    }
    else
    {
            response.sendRedirect("./errorpage");
    }
    }

}
