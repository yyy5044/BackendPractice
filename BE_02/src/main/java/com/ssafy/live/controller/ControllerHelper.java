package com.ssafy.live.controller;

import java.io.IOException;
import java.util.Arrays;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface ControllerHelper {
	default String preProcessing(HttpServletRequest request, HttpServletResponse response) {
		// action null 처리
		String action = request.getParameter("action");
		if (action==null || action.isBlank()) {
			action = "index";
		}
		return action;
	}
	
	default void responseHtml(String title, String content, HttpServletResponse response) throws IOException {
		String html = "<html><body> <h1>%s</h1><div>%s</div></body></html>".formatted(title, content);
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().append(html);
		
	}
}
