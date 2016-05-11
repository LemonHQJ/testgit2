package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/BServlet")
public class BServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("1111111111");
	String [] a = request.getParameterValues("vid");
	String [] b= request.getParameterValues("pid");
	String Agent = request.getHeader("User-Agent");
	System.out.println(Agent);
	for(int i=0;i<b.length;i++){
		System.out.println(b[i]);
	}
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	}

}
