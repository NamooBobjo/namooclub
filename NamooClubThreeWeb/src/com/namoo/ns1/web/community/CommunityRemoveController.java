package com.namoo.ns1.web.community;

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

@WebServlet("/cmRemove.xhtml")
public class CommunityRemoveController extends HttpServlet {

	private static final long serialVersionUID = -5204297478981537446L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		String cmId = req.getParameter("cmId");
		
		CommunityService cmservice = NamooClubServiceFactory.getInstance().getCommunityService();
		Community community = cmservice.findCommunity(cmId);
		String cmName = community.getName();
		
		req.setAttribute("cmName", cmName);
		req.setAttribute("cmId", cmId);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/community/remove.jsp");
		dispatcher.forward(req, resp);
	}

}
