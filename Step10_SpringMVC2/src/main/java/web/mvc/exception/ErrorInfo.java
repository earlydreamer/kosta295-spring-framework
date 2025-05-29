package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 예외코드와 예외메시지를 상수 객체로 관리(예정)
 */
@RequiredArgsConstructor
@Getter
public enum ErrorInfo {
	INVALID_AGE("나이 조건을 확인해 주세요", 600), DUPLICATED_ID("ID가 중복입니다.", 601);

	private final String msg;
	private final int status;	
	
}

//
//public void error(Exception e) {
//	throw new BasicException(ErrorInfo.DUPLICATED_ID);
//	e.getErrorInfo().getMsg().getStatus();
//}

//
//public class Test
//{
//
//	public void aa() {
//		String message = ErrorInfo.INVALID_AGE.getMsg();
//	}
//}
