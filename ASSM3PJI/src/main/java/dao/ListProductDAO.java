package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import context.DBContext;
import model.Product;

public class ListProductDAO extends DBContext {

	// in ra san pham
	public Product getProduct(String characters) throws Exception {
		Product product = null;
		String sql = "SELECT * FROM Products WHERE product_id ='"+characters+"'";
		Connection jdbcConnection = getConnection();
		PreparedStatement stmt = jdbcConnection.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		if (rs.next()) {
			int id = rs.getInt("product_id");
			String name = rs.getString("product_name");
			String description = rs.getString("product_des");
			float price = rs.getFloat("product_price");
			String src = rs.getString("product_img_source");
			String type = rs.getString("product_type");
			String brand = rs.getString("product_brand");

			product = new Product(id, name, description, price, src, type, brand);
		}

		rs.close();
		stmt.close();
		jdbcConnection.close();
		return product;
	}

	// return the list of product by prodct name
	// ham tim kiem
	public List<Product> search(String characters) throws Exception {
		List<Product> products = new ArrayList<Product>();
	//	String sql = "SELECT * FROM Products where product_name='"+characters+"'";
		String sql = "SELECT * FROM Products where product_name like '%"+characters+"%'";

		Connection jdbcConnection = getConnection();
		PreparedStatement stmt = jdbcConnection.prepareStatement(sql);//cho phep truyen param vao sql
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("product_id");
			String name = rs.getString("product_name");
			String description = rs.getString("product_des");
			float price = rs.getFloat("product_price");
			String src = rs.getString("product_img_source");
			String type = rs.getString("product_type");
			String brand = rs.getString("product_brand");

			Product product = new Product(id, name, description, price, src, type, brand);
			products.add(product);

		}
		
		rs.close();
		stmt.close();
		jdbcConnection.close();
		return products;
		
	}
	public List<Product> ListAll() throws Exception {
		List<Product> products = new ArrayList<Product>();
		String sql = "SELECT * FROM Products ORDER BY product_id ASC";

		Connection jdbcConnection = getConnection();
		PreparedStatement stmt = jdbcConnection.prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("product_id");
			String name = rs.getString("product_name");
			String description = rs.getString("product_des");
			float price = rs.getFloat("product_price");
			String src = rs.getString("product_img_source");
			String type = rs.getString("product_type");
			String brand = rs.getString("product_brand");

			Product product = new Product(id, name, description, price, src, type, brand);
			products.add(product);

		}
		rs.close();
		stmt.close();
		jdbcConnection.close();
		return products;
	}

}
