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
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

@WebServlet("/.xhtml")
public class CommunityJoinController extends HttpServlet{

	private static final long serialVersionUID = 6830767991447143387L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		HttpSession session = req.getSession();
		String cmName = req.getParameter("cmName");
		String email = (String)session.getAttribute("loginID");
		CommunityService cmservice = NamooClubServiceFactory.getInstance().getCommunityService();
		
		cmservice.joinAsMember(cmName, email);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/community/join.jsp");
		dispatcher.forward(req, resp);
}

}
