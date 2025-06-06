package web.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SelectController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("SelectController 실행 입니다.....");
		
		request.setAttribute("message", "select의 결과 입니다.");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("selectResult"); // spring에서는 확장자를 쓰지 않는다
//		mv.setViewName("selectResult.jsp");
		
		return mv;
	}

}
