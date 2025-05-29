package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AjaxException extends RuntimeException{
	
	private final ErrorInfo errorInfo;	

}
