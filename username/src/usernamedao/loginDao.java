package usernamedao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class loginDao {
	String sql ="select * from abhi.login where uname = ? and pass = ?";
	String sql1="insert into abhi.login (uname , pass) values (?,?)";
	String url ="jdbc:mysql://localhost:3306/abhi";
	String username = "root";
	String password = "abhiabartha";

	   static ResultSet rs = null;  
	   static Connection conn = null;
	   Statement stmt = null;
	   static PreparedStatement statement = null;
	  //static String sql1;
	
	
	public boolean check(String uname , String pass) {
		/* try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection conn = DriverManager.getConnection(url,username,password);
	    	 statement = conn.prepareStatement(sql1);
	    	  
	    	  statement.setString(1, uname);
	    	  statement.setString(2, pass);
	    	 // statement.setString(3, email);
	    	 // statement.setInt(4, mobile);
	    	  //statement.setString(5, city);
	    	  //statement.setString(6, user_status);
		      int rowsUpdated = statement.executeUpdate();
		      if (rowsUpdated > 0) {
		          System.out.println("An existing user was inserted successfully!");
		          return true;
		      }
	      }catch(SQLException | ClassNotFoundException se) {
	    	  System.out.println("Failed to insert Data!");
	    	  se.printStackTrace();
	      }
		return false;
	}*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			PreparedStatement st =con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2,pass);
			ResultSet rs = st.executeQuery();
			System.out.println("hell0");
			
		if(rs.next()) 
		{
		System.out.println("hell0");
		return true ;}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	
	}
	public boolean insert(String uname2 , String pass2){ 
 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection conn = DriverManager.getConnection(url,username,password);
	    	 statement = conn.prepareStatement(sql1);
	    	  
	    	  statement.setString(1, uname2);
	    	  statement.setString(2, pass2);
	    	 // statement.setString(3, email);
	    	 // statement.setInt(4, mobile);
	    	  //statement.setString(5, city);
	    	  //statement.setString(6, user_status);
		      int rowsUpdated = statement.executeUpdate();
		      if (rowsUpdated > 0) {
		          System.out.println("An existing user was inserted successfully!");
		         
		          return true;
		      }
	      }catch(SQLException | ClassNotFoundException se) {
	    	  System.out.println("Failed to insert Data!");
	    	  se.printStackTrace();
	      }
		return false;
	}
}
