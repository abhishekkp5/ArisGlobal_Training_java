package com.aris.AddServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServelt extends HttpServlet {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String  userName= req.getParameter("num1");
		String password = req.getParameter("num2");
		
		
		String uname = "root";
		String pass = "root";
		
		PrintWriter out = resp.getWriter();
//		if(userName.equals(uname) && password.equals(pass)) {
//			RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
//			rd.forward(req, resp);	
//			
//		}
//		else {
//		    
//			out.println("<script type=\"text/javascript\">");
//		       out.println("alert('User or password incorrect');");
//		       out.println("location='Login.jsp';");
//		       out.println("</script>");
//		       
//			}		
		//super.doPost(req, resp);
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String connectionString="jdbc:mysql://localhost:3306/webapp";
			String DBuserName="root";
			String DBpassword="password";
			//System.out.println(password);
			con=DriverManager.getConnection(connectionString,DBuserName,DBpassword);
		if(con!=null) {
			System.out.println("connected");
			String query = "select * from login where username ='"+userName+"'and password ='"+password+"';";
			Statement st;
			st = con.createStatement();
			ResultSet res = st.executeQuery(query);
			if(res.next()) {
				RequestDispatcher rd = req.getRequestDispatcher("Welcome.jsp");
				rd.forward(req, resp);
			}
			else {
				out.println("<script type=\"text/javascript\">");
			       out.println("alert('UserName or password incorrect');");
			       out.println("location='Login.jsp';");
			       out.println("</script>");
		}
		}
		else {
			System.out.println("connection Failed.....");
		}
		
		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}		

	}

}