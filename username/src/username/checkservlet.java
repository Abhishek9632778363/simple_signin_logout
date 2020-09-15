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
 * Servlet implementation class checkservlet
 */
//@SuppressWarnings("serial")
@WebServlet("/checkservlets")
public class checkservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname2=request.getParameter("uname");
		String pass2=request.getParameter("pass");
		String nam1=request.getParameter("pass1");
		
		
		
		if(pass2.equals(nam1)  )
		{
			System.out.print(uname2);
			System.out.print(pass2);
			System.out.print(nam1);
			
		
			
			loginDao dao = new loginDao();
			
			
			if(dao.insert(uname2, pass2))
			{
				
			System.out.print("helooo3");
				HttpSession session= request.getSession();
				session.setAttribute("username",uname2);
				response.sendRedirect("savedata.jsp");
				//response.sendRedirect("welcome.jsp");
			}
			else
			{
				//response.sendRedirect("loginex.jsp");
				response.sendRedirect("signup.jsp");
				
			   
			}
			
			
		}
		else 
		{
		response.sendRedirect("logee.jsp");
		//response.sendRedirect("signup.jsp");
			//System.out.print("helooo3");}
	
	}}}