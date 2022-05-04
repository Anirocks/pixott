package com.revature.pixott.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.revature.pixott.Model.customer;
public class CustomerDao {
	public void signup (customer customer) {
	String Sql= "insert into customer (name, mobile, password) values (?,?,?)";
try (
	Connection conn=Util.getConnection();
	PreparedStatement stmt=conn.prepareStatement(Sql);
	) {
	System.out.println("Connectd Successfully");
	stmt.setString(1, customer.getName());
	stmt.setString(2, customer.getMobilenumber());
	stmt.setString(3, customer.getPassword());
	stmt.execute();
System.out.println("Customer added successfully");
}
	catch (SQLException e) { 
		System.out.println(e.getMessage());
	}
}
}