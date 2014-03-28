package com.namoo.ns1.web.club;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.namoo.ns1.service.facade.ClubService;
import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.Club;
import dom.entity.Community;

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
		HttpSession session = req.getSession();
		String email = (String)session.getAttribute("loginID");
		String cmId = req.getParameter("cmId");
		
		CommunityService cmservice = NamooClubServiceFactory.getInstance().getCommunityService();
		Community community = cmservice.findCommunity(cmId);
		ClubService clservice = NamooClubServiceFactory.getInstance().getClubService();
		
		List<Club> clubs = clservice.findClubsById(cmId);
		List<Club> belongclubs = clservice.findBelongClub(cmId, email);
		List<Club> managedclubs = clservice.findManagedClub(cmId,email);
		
		for(Club club : belongclubs){
			clubs.remove(club);
		}

		for(Club club : managedclubs){
			belongclubs.remove(club);
		}
		
		String cmname = community.getName();
		
		req.setAttribute("managedclubs", managedclubs);
		req.setAttribute("clubs", clubs);
		req.setAttribute("cmName", cmname);
		req.setAttribute("cmId", cmId);		
		req.setAttribute("belongclubs", belongclubs);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/home.jsp");
		dispatcher.forward(req, resp);
	}

	
}
