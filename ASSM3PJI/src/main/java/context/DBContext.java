package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class DBContext {

	public DBContext() {
		// TODO Auto-generated constructor stub
	}

	public Connection getConnection() throws Exception {

		/*String url = "jdbc:sqlsever://" + severName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
		if (instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlsever://" + severName + ":" + portNumber + ";databaseName=" + dbName;
		Class.forName("com.microsoft.sqlsever.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);

	}

	private final String severName = "10.211.55.5";
	private final String dbName = "ShoppingDB";
	private final String portNumber = "1433";
	private final String instance = "";
	private final String userID = "sa";
	private final String password = "123";
*/
		String user="sa";
		String passwork="123";
		String url = "jdbc:sqlserver://localhost:1433;databaseName=ShoppingDB;integratedSecurity=true";
	
		
			
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
				System.out.println("Loi phan class");
			}
	
				try {
					return java.sql.DriverManager.getConnection(url,user,passwork);
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Loi phan Driver");
				}
			return null;


}
	}
