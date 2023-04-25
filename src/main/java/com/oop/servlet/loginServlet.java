package com.oop.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.oop.util.DBConnection;

/**
 * Servlet implementation class loginServlet
 */
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public int validate(String mail, String pwd, String type) throws SQLException, ClassNotFoundException {
		
		Connection conn = DBConnection.getDBConnection();
		PreparedStatement stmt = null;
		ResultSet rslt = null;
		
		int customrtype = 0;
		
		stmt = conn.prepareStatement("select * from registration where email = ? and Password= ? and Usertype = ?");
		stmt.setString(1,mail);
		stmt.setString(2,pwd);
		stmt.setString(3,type);
		rslt = stmt.executeQuery();
		if(rslt.next()) {
			customrtype = 1;
		}
		System.out.println(rslt.next());
		
		return customrtype;
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int result1=0,result2=0;
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String EMAIL = request.getParameter("Lemail");
		String PWD = request.getParameter("Lpwd");
		try {
			result1 = validate(EMAIL, PWD, "Cus");
			result2 = validate(EMAIL, PWD, "Adm");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result1 == 1) {
			RequestDispatcher dis = request.getRequestDispatcher("Cmain.jsp");
			dis.forward(request, response);
		}else if(result2 == 1) {
			RequestDispatcher dis = request.getRequestDispatcher("Amain.jsp");
			dis.forward(request, response);
		}else {
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Login Details Are Incorrect')");
			out.println("location='Login.jsp'");
			out.println("</Script>");
		}
	}
}
