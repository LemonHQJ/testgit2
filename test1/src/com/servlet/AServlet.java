package com.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.Product;
import com.dao.ProductDao;
import com.sun.org.apache.regexp.internal.RE;

/**
 * Servlet implementation class AServlet
 */
@WebServlet("/AServlet")
public class AServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("!!!!!!!!");
//		request.setCharacterEncoding("UTF-8");
//		ProductDao dao = new ProductDao();
//		List<Product> ps=dao.getProduct();
//		request.setAttribute("ps", ps);
//		request.getRequestDispatcher("cart.jsp").forward(request,response);
//		return;
		request.setCharacterEncoding("utf-8");
		
		String username=request.getParameter("username");
		String password = request.getParameter("password");
		String Agent = request.getHeader("User-Agent");
		System.out.println(Agent);
		if(!"cat".equals(username)){
			String msg="错误";
			request.setAttribute("msg", msg);
			RequestDispatcher re=request.getRequestDispatcher("login.jsp");
					re.forward(request, response);
		} else{
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("/test1/suss.jsp");
			
		}
		}

}
