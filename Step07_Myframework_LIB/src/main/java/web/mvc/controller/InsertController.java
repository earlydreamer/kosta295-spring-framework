package web.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class InsertController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//등록하기
		System.out.println("InsertController 입니다. ");

		return new ModelAndView("index");
//		return new ModelAndView("redirect:index"); //Spring에서는 redirect 지정시 prefix 사용	
//		return new ModelAndView("index.jsp", true);//rediect방식으로 이동해라.
	}

}
