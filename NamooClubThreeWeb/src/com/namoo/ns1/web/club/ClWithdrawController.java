package com.namoo.ns1.web.club;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clWithdraw.xhtml")
public class ClWithdrawController extends HttpServlet{

	private static final long serialVersionUID = -2090652797436121470L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		RequestDispatcher dispatcher = req
				.getRequestDispatcher("/WEB-INF/views/club/withdraw.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	

}
