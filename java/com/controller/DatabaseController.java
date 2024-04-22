package com.controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;
import com.model.User;

import com.util.StringUtil;

public class DatabaseController {
	
	
	
//--------------------------------------------------------------------------------------------------------------	
//	this method returns connection of the database
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3308/gadgetgeek";
		String user = "root";
		String pass = "";
		
		return DriverManager.getConnection(url,user, pass);
		
		
	}
	

//---------------------------------------------------------------------------------------------------------	
	
	
	
//------------------------------------------------------------------------------------------------------------	
//	this method adds user to the database
	
	public int addUser(User user) {
		
		try (Connection conn = getConnection()){
			PreparedStatement st = conn.prepareStatement(StringUtil.INSERT_USER);
			st.setString(1,user.getUsername() );
			st.setString(2,user.getFirstName());
			st.setString(3,user.getLastName());
			st.setDate(4,Date.valueOf(user.getDob()));
			st.setString(5,user.getGender());
			st.setString(6,user.getEmail());
			st.setString(7,user.getPhoneNumber());
			st.setString(8,user.getPassword());
			st.setString(9,user.getAddress());
			
			int result = st.executeUpdate();
			return  result > 0 ? 1: 0;
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		} 
		return -1;
	}
	
	
//----------------------------------------------------------------------------------------------------------	

	
//----------------------------------------------------------------------------------------------------------	
//	this method return result if the user name and password matched
	
	public int getUserLoginInfo(String userName, String password) {
		
		try (Connection conn = getConnection()){
			PreparedStatement st = conn.prepareStatement(StringUtil.GET_LOGIN_INFO);
			st.setString(1, userName);
			st.setString(2, password);
			
			
			System.out.println(userName);
			System.out.println(password);
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				
				
				
				System.out.println(rs.getString("user_name"));
				return 1;
			}
			else {
				return 0;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return -1;
		}
		
		
	}

//	--------------------------------------------------------------------------------------------------------
	
	
	
	
// 	---------------------------------------------------------------------------------------------------------	
//	this method returns list of product that the user search
	
	public ArrayList<Product> getProduct(String search){
		
		Product product = null;
		ArrayList<Product> products = new ArrayList<Product>();
		try (Connection conn = getConnection()) {
			
			PreparedStatement st = conn.prepareStatement(StringUtil.PRODUCT_SEARCH);
			st.setString(1, search );
			 ResultSet rs =  st.executeQuery();
			 
			 
			 while(rs.next()) {
				 product = new Product();
				 product.setProductID(rs.getInt("product_id"));
				 product.setProductName(rs.getString("name"));
				 product.setProductDesc(rs.getString("product_desc"));
				 product.setCategory_id(rs.getInt(rs.getInt("category_id")));
				 product.setUnitPrice(rs.getInt("unit_price"));
				 
				 products.add(product);
				 
				 System.out.println(" product aayo");
				 
				 return products;
			 }
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			
		}
		
		
		return products;
	}
//	----------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
//	last done work is search work complete but need to ask query question 
}
