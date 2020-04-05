package com.capgemini.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.dao.LoginDAO;
import com.capgemini.dao.LoginDAOImpl;
import com.capgemini.bean.Login;

public class LoginController extends HttpServlet {
 
	LoginDAO loginDAO = null;
	public LoginController() {
		loginDAO = new LoginDAOImpl();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		Login login = new Login();
		login.setEmail(req.getParameter("email"));
		login.setPassword( req.getParameter("password"));
		
		String status = loginDAO.authenticate(login);
		
		if(status.equals("true")) {
			session.setAttribute("email", login.getEmail());
			resp.sendRedirect("views/jspcrud.jsp");
		}
		
		if(status.equals("false")) {
			resp.sendRedirect("index.jsp?status=false");
		}
		if(status.equals("error")) {
			resp.sendRedirect("index.jsp?status=error");
		}
		
		
		
	}
}
