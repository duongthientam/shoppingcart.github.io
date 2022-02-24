package controllerlogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import controllerlogin.Account;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		try {
			request.getSession(true).invalidate();
			//kiem tra mail
			String regexMail = "^[A-Z0-9_a-z]+@[A-Z0-9\\.a-z]+\\.[A-Za-z]{2,6}$";
			String regex = "[a-zA-Z0-9_!@#$%^&*]+";
			//lay du lieu tu login form
			String user = request.getParameter("username");
			String password = request.getParameter("password");
			Account acc = new Account();
			acc.setName(user); acc.setPwd(password);
			HttpSession session = request.getSession(true);
			if(!password.matches(regex) || !user.matches(regexMail)) {
				session.setAttribute("error","invalid syntax");
				response.sendRedirect("login.jsp");
			}
			//Doc du lieu tu web.xml
			String uid = getServletContext().getInitParameter("username");
			String pwd = getServletContext().getInitParameter("password");
			//check user da lam o ASSM1 gio chuyen qua trang member
			if (user != null && acc.getPwd().equals(pwd) && acc.getName().equalsIgnoreCase(uid)) {
				//set session
				session.setAttribute("user", user);
				//dang nhap thanh cong thi chuyen qua trang member
				response.sendRedirect("member\\blank.html");
			}
			else {
				session.setAttribute("error","wrong username or password");
				response.sendRedirect("member\\error.html");
			}
		} catch (NullPointerException e) {
		 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		 rd.forward(request, response);
		 
		} catch (Exception ex) {
			response.getWriter().println(ex);
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
