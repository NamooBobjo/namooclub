package com.namoo.ns1.web.club;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.facade.TownerService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.Community;

@WebServlet("/clCreate.do")
public class ClubCreateController extends HttpServlet{

	private static final long serialVersionUID = -1246207217819762829L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		TownerService twservice = NamooClubServiceFactory.getInstance().getTownerService();
		CommunityService cmservice = NamooClubServiceFactory.getInstance().getCommunityService();
		
		resp.sendRedirect("clList.xhtml");
	}

	
}
