package web.mvc.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * ��ǰ�ڵ尡 �ߺ��ǰų� ������ ������ ������� �߻��ϴ� ���� Ŭ���� 
 * */

@Getter
@RequiredArgsConstructor
public class MyErrorException extends RuntimeException {
//public class MyErrorException extends Exception {//üũ����
	
   private final ErrorCode errorCode;
   
  
}
/*
 *   INVALID_PRODUCT_CODE(600, "��ǰ�ڵ尡 �߸��Ǿ����ϴ�."),
      DUPLICATE_PRODUCT_CODE(601, "��ǰ�ڵ� �ߺ��Դϴ�."),
     INVALID_PRICE(602, "������ 1000~ 10000�� ���̸� �����մϴ�."),
    FAILD_UPDATE(603, "�������� �ʾҽ��ϴ�.");
    
 * ���    throw new MyErrorException(ErrorCode.INVALID_PRODUCT_CODE);
 */


