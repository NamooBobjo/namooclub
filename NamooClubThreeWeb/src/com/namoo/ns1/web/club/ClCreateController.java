package com.namoo.ns1.web.club;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.Community;

@WebServlet("/create.xhtml")
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
	CommunityService cmservice = NamooClubServiceFactory.getInstance().getCommunityService();
		
		Community community = cmservice.findCommunity(cmId);
		String[] category = community.getCategory();		
		
		req.setAttribute("category", category);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/create.jsp");
		dispatcher.forward(req, resp);
	}
	
	
}
