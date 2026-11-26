import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUser 
{
	public static void main(String[] args)
	{
		String url = "jdbc:sqlite:mydatabase.db" ;
		String sql = "INSERT INTO Users(name,age) VALUES(?,?)" ;
		try 
		{
			
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Connected to database.");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "kia");
			pstmt.setInt(2,35);
			
			pstmt.executeUpdate();
			System.out.println("User inserted successfully ..!");
			
			pstmt.close();
			conn.close();
			
			
		}
		catch(SQLException e) 
		{
			System.out.println("Error:"+ e.getMessage());
			e.printStackTrace();
		}
	}
}
