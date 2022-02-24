package context;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		DBContext u = new DBContext();
		Connection connection = null;
		try {
			connection = u.getConnection();
		} catch (Exception e1) {
			System.out.println("Loi phan uget");
		}
		 try {
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM Account";
			ResultSet resultset = statement.executeQuery(sql);
			while (resultset.next()) {
			out.println(resultset.getInt("password"));	
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	//	Connection connection = DatasourceDemo.Connect.getJDBCConnection();
		if(connection != null) {
			System.out.println("Thanh cong");
		}else {
			System.out.println("khong thanh cong");
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
