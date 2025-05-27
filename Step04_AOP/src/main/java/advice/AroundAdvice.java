package advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 사전-사후처리
 * @author kosta
 *
 */

public class AroundAdvice {
	
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("AroundAdvice의 around 사전처리");
		Object obj = joinpoint.proceed();// 다음 advice 또는 joinpoint 호출
		System.out.println("AroundAdvice의 around 사후처리");
		return obj;
	}

}
