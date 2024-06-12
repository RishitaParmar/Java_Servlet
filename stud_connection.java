

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class stud_connection
{
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    public stud_connection()
    {
            try
            {
                    Class.forName("com.mysql.jdbc.Driver");
                    cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studmgt?zeroDateTimeBehavior=convertToNull","root","");
            }
            catch(Exception e)
            {
                    e.printStackTrace();
            }
    }
}


