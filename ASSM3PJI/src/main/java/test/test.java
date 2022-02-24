package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.OrdersDAO;
import model.Cart;
import model.Orders;

/**
 * Servlet implementation class test
 */
@WebServlet(name = "test1", urlPatterns = { "/test1" })
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		OrdersDAO dao = new OrdersDAO();
		dao.insertOrder(null, null);
	}
	public void insertOrder(Orders o, Cart c) {
		float i = 5;
		
			//Orders o1 = new Orders(1,i,4,SimpleDateFormat.parse("2/2/2000"),"nhat ban","090000001",c.getItem(),"tam@gmail.com",SimpleDateFormat.parse("2/2/2000"),"conhang");
		
		 
		Connection jdbcConnection = null;
		String query1 = "INSERT INTO test " + "VALUES (1100)";
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
				stmt.executeUpdate(query1);
			} catch (SQLException e) {
				e.printStackTrace();
				// TODO Auto-generated catch block
				System.out.println("loi phan stmt query");
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
