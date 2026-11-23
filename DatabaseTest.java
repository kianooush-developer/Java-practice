import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseTest
{
	public static void main(String[] args) 
	{
		String url = "jdbc:sqlite:mydatabase.db";
		
		try 
		{
			Class.forName("org.sqlite.JDBC");
			
			Connection conn = DriverManager.getConnection(url);
			System.out.println(" Connected to database successfully !");
			String createTableSQL = "CREATE TABLE IF NOT EXISTS Users("+" id INTEGER PRIMARY KEY AUTOINCREMENT , " + " name TEXT NOT NULL , " + " age INTEGER );" ;
			Statement stmt = conn.createStatement();
			stmt.execute(createTableSQL);
			System.out.println("Table 'Users' created successfully !");
			conn.close();
		}
		catch(Exception e) 
		{
			System.out.println("Error:Could not connect to database.");
			e.printStackTrace();
		}
	}
}
