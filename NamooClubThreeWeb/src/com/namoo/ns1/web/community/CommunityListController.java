package com.namoo.ns1.web.community;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.Community;

@WebServlet("/cmList.xhtml")
public class CommunityListController extends HttpServlet{

	private static final long serialVersionUID = -4847940940258971662L;

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
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/community/home.jsp");
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();

		List<Community>communities =service.findAllCommunities();
		req.setAttribute("communities", communities);
		dispatcher.forward(req, resp);
		return;
	}
}
