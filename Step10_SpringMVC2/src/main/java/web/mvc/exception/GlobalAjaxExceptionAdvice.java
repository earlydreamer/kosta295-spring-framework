package web.mvc.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;
import web.mvc.response.ResponseError;

@RestControllerAdvice
@Slf4j
public class GlobalAjaxExceptionAdvice {
	@ExceptionHandler(AjaxException.class)
	public ResponseEntity<?> error(AjaxException e) {
		log.info("AjaxException");
		ErrorInfo errorInfo = e.getErrorInfo();
		
		ResponseError rese = new ResponseError(errorInfo.getStatus(), errorInfo.getMsg());
		return ResponseEntity.status(rese.getStatus()).body(rese.getMsg());

	}

}
