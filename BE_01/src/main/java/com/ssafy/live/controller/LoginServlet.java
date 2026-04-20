package com.ssafy.live.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		String validId = "abc";
		String validPass = "123";
		
		System.out.println("ID: "+id + ", PASS:" + pass);
		
		response.setContentType("text/html;charact=utf-8");
		
		if (id.equals(validId) && pass.equals(validPass)) {
			response.getWriter().append("<html><body><h1>"+id+"님 로그인 되셨습니다."+"</h1></body></html>");
		} else {
			response.getWriter().append("<html><body><h1>"+"id 또는 비밀번호가 잘못되었습니다."+"</h1></body></html>");
		}
		
	}

}
