package com.advancejava.jdbc.code;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.advancejava.jdbc.code.util.DbUtil;

public class DbOperations {
	public boolean insertCategory(String type) throws SQLException {
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();
		// PreparedStatement stmt=con.prepareStatement
		String query = "INSERT INTO category (type) VALUES ('" + type + "')";
		stmt.executeUpdate(query);
		// con.commit();
		con.close();
		return true;
	}

	public ArrayList getCategoryById(int id) throws SQLException {
		// String query = "select * from category where id='"+id+"'";
		Connection con = DbUtil.getConnection();
		// Statement stmt = con.createStatement();
		PreparedStatement pstmt = con.prepareStatement("select * from category where id=?");
		pstmt.setInt(1, id);
		ResultSet record = pstmt.executeQuery();
		ArrayList as = new ArrayList();
		record.next();
		as.add(record.getInt("id"));
		as.add(record.getString("type"));
		con.close();
		return as;
	}

	public ResultSet getAllCategory() throws SQLException {
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from category");
		// con.close();
		return rs;
	}

	public boolean insertProduct(String name, float price, String type) throws SQLException {
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();
		// String searchquery = "select id from category where type='"+type+"'";
		PreparedStatement pstmt = con.prepareStatement("select id from category where type=?");
		pstmt.setString(1, type);
		ResultSet record = pstmt.executeQuery();
		record.next();
		int id = record.getInt("id");
		String query = "INSERT INTO product (name, price, category_id) VALUES ('" + name + "','" + price + "','" + id
				+ "')";
		stmt.executeUpdate(query);
		// con.commit();
		con.close();
		return true;
	}

	public ArrayList getProductById(int id) throws SQLException {
		String query = "select * from product where id='" + id + "'";
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();
		PreparedStatement pstmt = con.prepareStatement("select * from product where id=?");
		pstmt.setInt(1, id);
		ResultSet record = pstmt.executeQuery();
		ArrayList as = new ArrayList();
		record.next();
		as.add(record.getInt("id"));
		as.add(record.getString("name"));
		as.add(record.getFloat("price"));
		as.add(record.getInt("category_id"));
		con.close();
		return as;
	}

	public ResultSet getAllProduct() throws SQLException {
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from product");
		// con.close();
		return rs;
	}

	public boolean insertOrder(String product_name, Date date) throws SQLException {
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();
		String searchquery = "select id from product where name='" + product_name + "'";
		ResultSet rs = stmt.executeQuery(searchquery);
		int id = rs.getInt("id");
		String query = "INSERT INTO orders (product_id,order_date) VALUES ('" + id + "','" + date + "')";
		stmt.executeUpdate(query);
		// con.commit();
		con.close();
		return true;
	}

	public ArrayList getOrderById(int id) throws SQLException {
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();
		String query = "select * from orders where id='" + id + "'";
		PreparedStatement pstmt = con.prepareStatement("select * from orders where id=?");
		pstmt.setInt(1, id);
		ResultSet record = pstmt.executeQuery();
		ArrayList as = new ArrayList();
		record.next();
		as.add(record.getInt("id"));
		as.add(record.getInt("product_id"));
		as.add(record.getDate("order_date"));
		con.close();
		return as;
	}

	public ResultSet getAllOrder() throws SQLException {
		Connection con = DbUtil.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from orders");
		con.close();
		return rs;
	}
}
