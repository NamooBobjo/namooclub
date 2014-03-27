package com.namoo.ns1.web.club;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/club/create.xhtml")
public class ClCreateController extends HttpServlet{

	private static final long serialVersionUID = 4461129352411687538L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		String cmId = req.getParameter("cmId");
		
		req.setAttribute("cmId", cmId);
		System.out.println();
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/create.jsp");
		dispatcher.forward(req, resp);
	}
	
	
}
