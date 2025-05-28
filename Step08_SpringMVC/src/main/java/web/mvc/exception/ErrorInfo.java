package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * �����ڵ�� ���ܸ޽����� ��� ��ü�� ����(����)
 */
@RequiredArgsConstructor
@Getter
public enum ErrorInfo {
	INVALID_AGE("���� ������ Ȯ���� �ּ���", 600), DUPLICATED_ID("ID�� �ߺ��Դϴ�.", 601);

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
