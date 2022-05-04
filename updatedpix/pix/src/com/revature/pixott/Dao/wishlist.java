package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class wishlist {
	public static void wish(int a ) {
		//String sql = "select * from watchlist";
		String sql="select movies from watchlist w join customer c on w.login_id=c.id where id=(?) ";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  stmt.setInt(1,a);
			  ResultSet rs =stmt.executeQuery();
			  while(rs.next()) {
				  System.out.println("======>"+rs.getString("movies"));
					
			  }
			 
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
	}
}
	
