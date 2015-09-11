package cn.itcast.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userID = request.getParameter("userID");		
		String userPwd = request.getParameter("userPwd");
		String cookie = request.getParameter("cookie");
		String checkCode = request.getParameter("checkCode");
		System.out.println("userID��"+ userID);
		System.out.println("userPwd��"+ userPwd);
		System.out.println("cookie��"+ cookie);
		System.out.println("checkCode��"+ checkCode);
		PrintWriter out = response.getWriter();
		out.println("userID="+ userID);
		out.println("userPwd��"+ userPwd);
		out.println("cookie��"+ cookie);
		out.println("checkCode��"+ checkCode);
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userID = request.getParameter("userID");		
		String userPwd = request.getParameter("userPwd");
		String cookie = request.getParameter("cookie");
		String checkCode = request.getParameter("checkCode");
		System.out.println("userID��"+ userID);
		System.out.println("userPwd��"+ userPwd);
		System.out.println("cookie��"+ cookie);
		System.out.println("checkCode��"+ checkCode);
	}

}
