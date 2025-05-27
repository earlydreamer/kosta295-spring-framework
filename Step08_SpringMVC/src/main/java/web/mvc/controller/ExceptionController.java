package web.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ExceptionController {
	/**
	 * Spring web-mvc에서 예외처리
	 * 각 컨트롤러에서 예외처리하는 @exceptionHandler
	 * global하게 전체 영역에서 발생하는 예외처리
	 * @controllerAdvice (http통신)
	 * @restControllerAdvice (XMLHttpRequest통신 = 비동기통신 = ajax처리)
	 */
	@RequestMapping("/exception.do")
	public String asdf(String no) {
		log.info("no={}",no);
		
		int convertNo = Integer.parseInt(no);
		log.info("convertNo={}",convertNo);
		
		int res = 100/convertNo;
		log.info("나눈결과={}",res);
		
		return "result";
	}
	
	/**
	 * 현재 컨트롤러에서 발생하는 예외처리
	 */
	@ExceptionHandler({NumberFormatException.class, ArithmeticException.class})
	public ModelAndView error(Exception e) {
		
		ModelAndView mv = new ModelAndView("error/error-view");
		log.error("메시지:{}",e.getMessage());
		mv.addObject("errMsg",e.getMessage());
		mv.addObject("errClass",e.getClass());
		mv.addObject("statusCode",HttpStatus.BAD_REQUEST);
		return mv;
		
	}

}
