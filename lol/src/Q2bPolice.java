import java.sql.*;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/getpolice")
public class Q2bPolice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Q2bPolice() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=null;
		ResultSet rs=null;
		Statement stmt=null;
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String field=request.getParameter("field");
		String value=request.getParameter("value");
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			rs=stmt.executeQuery("select * from police where "+field+"='"+value+"'");
			if(rs.next())
			{
				pw.println("<h1>The Police station with "+field+" of "+value+" is:</h1><br>"
						+ "Area:"+rs.getString(1)+" Phone Number:"+rs.getString(2));
			}
			else
				pw.println("<h3>Cannot find such police station</h3>");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
