package web.mvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

/**
 * ������Ʈ ��ü���� �߻��ϴ� ���ܸ� ��Ƽ� ó��
 *
 */
@ControllerAdvice 
@Slf4j
public class GlobalExceptionAdvice {
	
	public GlobalExceptionAdvice() { 
		log.info("������");
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public ModelAndView error(NumberFormatException e) {
		log.error("e={}",e);
		return new ModelAndView("error/number","errMsg",e.getMessage());
		
	}
	

}
