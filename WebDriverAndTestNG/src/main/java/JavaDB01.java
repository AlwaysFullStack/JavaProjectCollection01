import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaDB01 {

	public static void main(String[] args) {
		try{  
			System.out.println("Going to connect database");
			Class.forName("com.mysql.jdbc.Driver");  
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?autoReconnect=true&useSSL=false", "root", "123456");
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from country");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  

	}

}
