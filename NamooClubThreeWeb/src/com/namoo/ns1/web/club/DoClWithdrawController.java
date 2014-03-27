package com.namoo.ns1.web.club;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.namoo.ns1.service.facade.ClubService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

public class DoClWithdrawController extends HttpServlet {

	private static final long serialVersionUID = 2511040536502316369L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String email = (String)session.getAttribute("loginID");
		ClubService clservice = NamooClubServiceFactory.getInstance().getClubService();
		String clubId = req.getParameter("clubId");
		
		clservice.withdrawalClub(clubId, email);
		resp.sendRedirect("clList.xhtml");
	}

	
}