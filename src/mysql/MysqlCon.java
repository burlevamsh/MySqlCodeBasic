package mysql;

import java.sql.*;

class MysqlCon {
	/*
	 * 1.import packages---> java.sql.*
	 * 2.load and register the driver.--->com.mysql.jdbc.driver
	 * 3.create connection --->connection coon
	 * 4.create a statement ---->Statement 
	 * 5.execute query
	 * 6.process the result
	 * 7.close
	 */
	public static void main(String args[]) {
		try {
			/*Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
//here sonoo is database name, root is username and password  
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from tblogin");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2));
			con.close();*/
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (Exception e) {
			System.out.println(e);
		}
			
			
	}
}
