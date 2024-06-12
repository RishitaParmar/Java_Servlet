

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayData extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><head><body><center><table><tr><th>GRNO<th>Student Name<th>Mark1<th>Mark2<th>Mark3<th>Mark4</tr></table></center></body></head></html>");
        
       try
       {
            stud_connection sc = new stud_connection();
            sc.stmt = (Statement) sc.cn.createStatement();
            //sc.rs = sc.stmt.execute();
            
            
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }

    }

}
