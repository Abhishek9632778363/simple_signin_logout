package username;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import usernamedao.loginDao;

/**
 * Servlet implementation class login
 */
//@SuppressWarnings("serial")
@WebServlet("/login")
public class login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		loginDao dao = new loginDao();
		
		if(dao.check(uname, pass))
		{
			HttpSession session= request.getSession();
			session.setAttribute("username",uname);
			response.sendRedirect("welcome.jsp");
		}
		else
		{
			response.sendRedirect("login1.jsp");
		   
		}
		
		
	}

	
}
