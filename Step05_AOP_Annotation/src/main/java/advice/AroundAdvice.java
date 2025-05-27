package advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 사전-사후처리
 * @author kosta
 *
 */

@Component
@Aspect
@Order(2)
public class AroundAdvice {
	
	@Around("PointCutDef.aa")
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable {
		System.out.println("AroundAdvice의 around 사전처리");
		Object obj = joinpoint.proceed();// 다음 advice 또는 joinpoint 호출
		System.out.println("AroundAdvice의 around 사후처리");
		return obj;
	}

}
