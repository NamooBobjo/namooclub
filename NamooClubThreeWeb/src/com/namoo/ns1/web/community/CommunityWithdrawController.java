package com.namoo.ns1.web.community;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.facade.TownerService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.Community;

@WebServlet("/withdraw.xhtml")
public class CommunityWithdrawController extends HttpServlet{

	private static final long serialVersionUID = -7241663190142992002L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		CommunityService cmservice = NamooClubServiceFactory.getInstance().getCommunityService();
		String cmId = req.getParameter("cmId");
		Community community = cmservice.findCommunity(cmId);
		
		String cmName = community.getName();
		
		req.setAttribute("cmName", cmName);
		req.setAttribute("cmId", cmId);
		
		HttpSession session = req.getSession();
		String loginID = (String) session.getAttribute("loginID");
		TownerService townerService=NamooClubServiceFactory.getInstance().getTownerService();
		String loginUser= townerService.findTowner(loginID).getName();
		req.setAttribute("loginUser", loginUser);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/community/withdraw.jsp");
		dispatcher.forward(req, resp);
	}

	
}
