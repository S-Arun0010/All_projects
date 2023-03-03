package allprojects;
import java.sql.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Database {
	private Database()
	{
		
	}
	
	static PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	static Connection con;
	static Statement state;
	static String pass = "S.arun2002";
	
	public static void getconnect() 
	{ 
		try
	{
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root",pass);
		print.println("Database get connected:");
	}
	catch(SQLException e)
	{
		print.println(e);
	}
		catch(Exception e)
		{
	    	print.println(e);
		}
	}
	public static void closeconnection() throws SQLException
	{   
		con.close();
		print.println("Database get closed:");
	}
	public static void database() 
	{   try
	{
		Singleton.getInstance();
		getconnect();
		state = con.createStatement();
		String sql="insert into student values(7,'arun',8.5)";
		state.executeUpdate(sql);
		sql = "Delete from student where id=7;";
		state.executeUpdate(sql);		
		closeconnection();
	}
	catch(SQLException e)
	{
		print.println(e);
	}
    catch(Exception e)
	{
    	print.println(e);
	}
	}

}
