package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import context.DBContext;
import model.Cart;
import model.Orders;
import model.Product;
import model.ProductOrders;

public class OrdersDAO extends DBContext {

	//insert information of order to data source, that including list of
	//product in cart (c) and information of  buyer in orders o
public void insertOrder(Orders o, Cart c) {
	//Orders o1 = new Orders(1,i,4,SimpleDateFormat.parse("2/2/2000"),"nhat ban","090000001",c.getItem(),"tam@gmail.com",SimpleDateFormat.parse("2/2/2000"),"conhang");
	long millis=System.currentTimeMillis();  
	java.sql.Date date=new java.sql.Date(millis);  
	System.out.println(date);  
	Connection jdbcConnection = null;
	//O
	String oname = o.getUserMail();
	int oid = o.getOrderId();
	int ostatus = o.getStatus();
	String odiscount = o.getDiscount();
	String ophongeNumber = o.getPhoneNumber();
	Date oreceivedDate = o.getOrderDate();
	String oaddress = o.getAddress();
	//C
	//orderid cua Oders = orderid cua ProductOrders 	
	/*for (Product x : c.items) {
		ProductOrders p = new ProductOrders(o.getOrderId(),x.getId(),(int) x.getPrice()*x.getNumber(), (int) x.getPrice());
		}*/
	//dinh dang date
	
	
	//		
	String queryo1 = "SET IDENTITY_INSERT orders ON;  "+
	"INSERT INTO orders(user_mail,order_id,order_status,order_date,order_discount_code,order_address) " + "VALUES "
			+ "('"+oname+"',"+oid+","+ostatus+",'"+date+"','"+odiscount+"','"+oaddress+"');  "
	+"SET IDENTITY_INSERT orders OFF;";
	
	String queryo = "INSERT INTO orders " + "VALUES "
	+ "('"+oname+"',"+oid+","+ostatus+",'"+oreceivedDate+"','"+odiscount+"','"+oaddress+"')";
	try {
		jdbcConnection = getConnection();
	} catch (Exception e) {	
		// TODO Auto-generated catch block
		System.out.println("loi phan connect");
	}
	Statement stmt = null;
	try {
		stmt = jdbcConnection.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("Loi phan stmt=");
	}
		try {
			stmt.executeUpdate(queryo1);
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			System.out.println("loi phan stmt query1");
			
		}
	
			for (Product x : c.items) {
				String queryc = "INSERT INTO orders_detail " + "VALUES "
				+ "("+o.getOrderId()+","+x.getId()+","+(int) x.getPrice()*x.getNumber()+","+(int) x.getPrice()+")";
				try {
					stmt.executeUpdate(queryc);
				} catch (SQLException e) {
					e.printStackTrace();
					// TODO Auto-generated catch block
					System.out.println("loi phan stmt query2");
				}
				}
		
		System.out.println("Record is inserted in the table successfully..................");
  try {
	stmt.close();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	}
	try {
		jdbcConnection.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("loi close 1");

	}
	

}

}
