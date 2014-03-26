package com.namoo.ns1.web.club;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clList.xhtml")
public class ClListController extends HttpServlet{

	private static final long serialVersionUID = 3879339579100526413L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//
		String cmName = req.getParameter("cmName");
		
		req.setAttribute("cmName", cmName);
		
		
		
		RequestDispatcher dispatcher = req
				.getRequestDispatcher("/WEB-INF/views/club/home.jsp");
		dispatcher.forward(req, resp);
	}

	
}
