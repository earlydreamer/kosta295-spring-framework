package advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class SampleAdvice {

	//사전처리
	@Before(value = "PointcutDefinition.aa()")
	public void before(JoinPoint joinpoint ) {
		//before를 적용하려는 메소드명을 joinpoint로부터 받아와 출력
		System.out.println(joinpoint.getSignature().getName()+"호출전 before 처리");
		System.out.println("--");
	}
	
	//사후처리 (무조건)
	@After(value = "PointcutDefinition.aa()")
	public void afterFinally() {
		System.out.println("성공여부와관계없이무조건출력되는사후처리");
		System.out.println("--");
	}
	
	
	//사후처리(정상완료시)
	@AfterReturning(pointcut = "PointcutDefinition.aa()", returning = "obj")
	public void afterReturning(JoinPoint joinpoint, Object obj) {
		System.out.println(joinpoint.getSignature().getName()+"return is "+obj);
		System.out.println("성공시리턴이발생하며실행되는사후처리");
		System.out.println("--");
	}
	
	//사후처리(에러발생시)
	@AfterThrowing(pointcut = "PointcutDefinition.aa()",throwing = "e")
	public void afterThrowing(JoinPoint joinpoint, Throwable e) {
		System.out.println(e);
		System.out.println("Exception이발생했을경우실행되는사후처리");
		System.out.println("--");
	}
	
	
}
