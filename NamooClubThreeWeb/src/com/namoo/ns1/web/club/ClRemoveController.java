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

import dom.entity.Club;

@WebServlet("/clRemove.xhtml")
public class ClRemoveController extends HttpServlet {

	private static final long serialVersionUID = -5204297478981537446L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		String clId = req.getParameter("clId");
		String cmId = req.getParameter("cmId");

		ClubService clservice = NamooClubServiceFactory.getInstance().getClubService();
		Club club = clservice.findClub(clId);
		String clName = club.getName();
		
		req.setAttribute("clName", clName);
		req.setAttribute("clId", clId);
		req.setAttribute("cmId", cmId);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/remove.jsp");
		dispatcher.forward(req, resp);
	}
}
