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

}
