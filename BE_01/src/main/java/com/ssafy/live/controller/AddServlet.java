package com.ssafy.live.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. 파라미터 검증
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		
		// 2. 비즈니스 로직 처리
		int result = num1 + num2;
		
		// 3. 응답 준비
		response.setContentType("text/html;charset=utf-8");
		// 4. Presentation Logic
		response.getWriter().append("<html><body><h1>"+ num1 + " + " + num2 + " = " + result+"</h1></body></html>");
		
		
	}

}
