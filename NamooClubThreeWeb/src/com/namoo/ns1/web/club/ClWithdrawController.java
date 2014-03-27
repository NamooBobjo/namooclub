package com.namoo.ns1.web.club;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.ClubService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

@WebServlet("/club/clWithdraw.xhtml")
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
	
		ClubService clservice = NamooClubServiceFactory.getInstance().getClubService();
	
		String clubId = req.getParameter("clId");
		String cmId = req.getParameter("cmId");
		String clubName=clservice.findClub(clubId).getName();
		
		req.setAttribute("clubId", clubId);
		req.setAttribute("cmId", cmId);
		req.setAttribute("clubName", clubName);
		
		
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/withdraw.jsp");
		dispatcher.forward(req, resp);
		
	}
	
	

}
