package com.kwon.bnsaabfp.sns;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kwon.bnsaabfp.member.MemberDAO;

import kiung.kwon.token.generator.KwonTokenGenerator;

@WebServlet("/SNSReplyWriteController")
public class SNSReplyWriteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (MemberDAO.getMdao().isLogined(request)) {
			SNSDAO.getSdao().writeReply(request);
			int p = Integer.parseInt(request.getParameter("p"));
			SNSDAO.getSdao().getMsg(p, request);
			request.setAttribute("subMenuPage", "sns/snsMenu.jsp");
		} else {
			SNSDAO.getSdao().clearSearchMsg(request);
			SNSDAO.getSdao().getMsg(1, request);
			request.setAttribute("subMenuPage", "blankMenu.jsp");
		}
		KwonTokenGenerator.generate(request);
		request.setAttribute("contentPage", "home.jsp");
		request.getRequestDispatcher("jsp/index.jsp").forward(request, response);
	}

}
