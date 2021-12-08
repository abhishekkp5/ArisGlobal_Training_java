package com.aris.AddServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addServlet extends HttpServlet{

	public static void main(String[] args) {
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		
		
		System.out.println(num1);
		System.out.println(num2);
		
		int c = Integer.parseInt(num1)+Integer.parseInt(num2);
		PrintWriter out = resp.getWriter();
		out.println("sum is:"+c);
		//super.doPost(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num1 = req.getParameter("num1");
		String num2 = req.getParameter("num2");
		
		
		System.out.println(num1);
		System.out.println(num2);
		
		int c = Integer.parseInt(num1)+Integer.parseInt(num2);
		PrintWriter out = resp.getWriter();
		out.println("sum is:"+c);
		//super.doGet(req, resp);
	}
	

}
