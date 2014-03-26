package com.namoo.ns1.web.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.TownerService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

@WebServlet("/regist.do")
public class RegistUserController extends HttpServlet {

	private static final long serialVersionUID = 5293638727757717469L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		TownerService townerservice = NamooClubServiceFactory.getInstance().getTownerService();
		req.setCharacterEncoding("utf-8");
		String name = req.getParameter("userName");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		System.out.println(name);
		townerservice.registTowner(name, email, password);
		
		resp.sendRedirect("main.xhtml");
		
	}

}
