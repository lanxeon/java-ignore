import java.sql.*;

public class q1b {
	public static void main(String args[])
	{
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
		Statement stmt= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs= null;
		stmt.execute("CREATE TABLE IF NOT EXISTS DEPARTMENT(dept_id int not null, name varchar(20), year_established int, head_name varchar(20),"
				+ "no_of_employees int, PRIMARY KEY(dept_id))");
		
		// INSERTING VALUES
		stmt.execute("INSERT INTO DEPARTMENT VALUES(1,'CSE',2005,'manjunath',20)");
		stmt.execute("INSERT INTO DEPARTMENT VALUES(2,'MECH',2002,'somedude',24)");
		stmt.execute("INSERT INTO DEPARTMENT VALUES(3,'CIVIL',2003,'GayNigga',19)");
		stmt.execute("INSERT INTO DEPARTMENT VALUES(4,'BT',2010,'AlsoGayNigga',12)");
		stmt.execute("INSERT INTO DEPARTMENT VALUES(5,'MEE',2010,'Suman',16)");
		
		
		// part (i)
		rs = stmt.executeQuery("select no_of_employees from department where name='CSE'");
		rs.next();
		System.out.println("The number of employees in the cse department is "+rs.getInt(1));
		
		
		//part (ii)
		rs=stmt.executeQuery("select name,dept_id from department where year_established =2010");
		System.out.println("The departments in 2010 are \nname-dept_id");
		while(rs.next())
			System.out.println(rs.getString(1)+"-"+rs.getString(2));
		
		//close connections
		rs.close();
		stmt.close();
		con.close();
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
