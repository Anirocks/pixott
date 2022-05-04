package com.revature.pixott.Customeraccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.Dao.Util;
import com.revature.pixott.Model.Top5;
import com.revature.pixott.Model.Top5Movies;

public class ViewTop5 {
	public static  List<Top5> Top() {
		String sql = "select * from top5 ;";
		List<Top5> res = new ArrayList();
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString("name")+ " ");
					
				}
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return res;
			
		
		
	}

}
