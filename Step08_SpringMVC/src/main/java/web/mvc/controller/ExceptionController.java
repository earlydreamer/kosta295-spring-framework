package web.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import web.mvc.service.UserService;

@Controller
@Slf4j
@RequiredArgsConstructor 
public class ExceptionController {

	//autowired 대신 final 선언하고 requiredArgsConstructor 사용
	private final UserService userService;
	
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
	
	@RequestMapping("/ageCheck.do")
	public String ageCheck(@RequestParam(defaultValue="0") int age) {
		//서비스 호출
		userService.ageCheck(age);
		log.info("age={}",age);
		return "result";		
	}

	@RequestMapping("/idCheck.do")
	public String idCheck( String id) {
		//서비스 호출
		userService.idCheck(id);
		log.info("id={}",id);
		return "result";		
	}	
}
