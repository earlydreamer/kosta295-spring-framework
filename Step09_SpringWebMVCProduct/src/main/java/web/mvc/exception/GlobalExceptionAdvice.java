package web.mvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice //Controller에서 발생하는 예외를 공통(Advice)으로 처리하는 클래스 
@Slf4j
public class GlobalExceptionAdvice {
	
	@ExceptionHandler(MyErrorException.class)
	public ModelAndView error(MyErrorException e) {
		
		log.error("Error Message error {} " , e.getErrorCode().getMsg() );
		
		//예외가 발생했을때 해야할 일작성
		ModelAndView mv = new ModelAndView("error");//WEB-INF/views/error.jsp이동
		
		mv.addObject("errMessage", e.getErrorCode().getMsg());//뷰에서 ${errMessage}
		mv.addObject("errStatus", e.getErrorCode().getStatus());//${errStatus}
		
		return mv;
	}
	
	

}
