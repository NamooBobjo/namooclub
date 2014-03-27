package com.namoo.ns1.web.club;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.namoo.ns1.service.facade.ClubService;
import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.facade.TownerService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.Club;
import dom.entity.Community;

@WebServlet("/clCreate.do")
public class DoClCreateController extends HttpServlet{

	private static final long serialVersionUID = -1246207217819762829L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		ClubService clservice = NamooClubServiceFactory.getInstance().getClubService();
		HttpSession session = req.getSession();
		
		String clubName = req.getParameter("clName");
		String description = req.getParameter("content");
		String email = (String)session.getAttribute("loginID");
		String cmId = req.getParameter("cmId");
		
		clservice.registClub(cmId, clubName, description, email);
		
		System.out.println(clservice.findClubsById(cmId));
		
		resp.sendRedirect("clList.xhtml?cmId="+cmId);
	}

	
}
