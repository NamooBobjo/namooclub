package com.namoo.ns1.web.community;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.facade.TownerService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

@WebServlet("/cmcreate.do")
public class DoCommunityCreateController extends HttpServlet{

	private static final long serialVersionUID = -8421419443329457788L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//
		HttpSession session = req.getSession();
		TownerService twservice = NamooClubServiceFactory.getInstance().getTownerService(); 		
		CommunityService cmservice = NamooClubServiceFactory.getInstance().getCommunityService();	
		
		String loginID = (String)session.getAttribute("loginID");
		String email = twservice.findTowner(loginID).getEmail();
	
		
		String cmName = req.getParameter("cmName");
		String description = req.getParameter("description");
		
		cmservice.registCommunity(cmName, description, email);
		
		resp.sendRedirect("cmList.xhtml");
	}

}
