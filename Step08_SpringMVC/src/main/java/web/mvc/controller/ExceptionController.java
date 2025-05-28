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

	//autowired ��� final �����ϰ� requiredArgsConstructor ���
	private final UserService userService;
	
	/**
	 * Spring web-mvc���� ����ó��
	 * �� ��Ʈ�ѷ����� ����ó���ϴ� @exceptionHandler
	 * global�ϰ� ��ü �������� �߻��ϴ� ����ó��
	 * @controllerAdvice (http���)
	 * @restControllerAdvice (XMLHttpRequest��� = �񵿱���� = ajaxó��)
	 */
	@RequestMapping("/exception.do")
	public String asdf(String no) {
		log.info("no={}",no);
		
		int convertNo = Integer.parseInt(no);
		log.info("convertNo={}",convertNo);
		
		int res = 100/convertNo;
		log.info("�������={}",res);
		
		return "result";
	}
	
	/**
	 * ���� ��Ʈ�ѷ����� �߻��ϴ� ����ó��
	 */
	@ExceptionHandler({NumberFormatException.class, ArithmeticException.class})
	public ModelAndView error(Exception e) {
		
		ModelAndView mv = new ModelAndView("error/error-view");
		log.error("�޽���:{}",e.getMessage());
		mv.addObject("errMsg",e.getMessage());
		mv.addObject("errClass",e.getClass());
		mv.addObject("statusCode",HttpStatus.BAD_REQUEST);
		return mv;
		
	}
	
	@RequestMapping("/ageCheck.do")
	public String ageCheck(@RequestParam(defaultValue="0") int age) {
		//���� ȣ��
		userService.ageCheck(age);
		log.info("age={}",age);
		return "result";		
	}

	@RequestMapping("/idCheck.do")
	public String idCheck( String id) {
		//���� ȣ��
		userService.idCheck(id);
		log.info("id={}",id);
		return "result";		
	}	
}
