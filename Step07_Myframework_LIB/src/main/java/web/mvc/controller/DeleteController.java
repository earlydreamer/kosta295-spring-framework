package web.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Spring 프레임워크 import

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class DeleteController implements Controller {
//Spring에서 제공하는 Controller로 교체	
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DeleteController 입니다....");
		return new ModelAndView("index");//기본값이 forward 방식이다. spring에서는 확장자를 쓰지 않는다.
		//ViewResolver를 통해 prefix와 suffix가 자동으로 붙기 때문
//		return new ModelAndView("index.jsp", true);
	}

}
