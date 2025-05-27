package advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * 공통관심사항
 * 사전-사후 시간체크
 * around 처리
 * @author kosta
 */

@Aspect //AOP의 공통관심사항
@Component("advice")
public class TimerAdvice {
	
	//사전-사후처리
	@Around ("execution(* service.*.* (..))") // pointcut 설정
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable{
		String methodname = joinpoint.getSignature().getName();
		System.out.println(methodname+"호출전");
		
		Object[] params = joinpoint.getArgs();
		System.out.println("--param--");
		for(Object param:params) {
			System.out.println(param);
		}
		System.out.println("----");
		
		StopWatch sw = new StopWatch();
		sw.start(); 
		//proceed 전후로 사전-사후처리 나뉜다
		Object obj = joinpoint.proceed();
		//
		sw.stop();
		System.out.println(methodname+"호출후");
		System.out.println("총실행시간 : "+sw.getTotalTimeMillis());
		System.out.println("사후처리 종료");
		System.out.println("------");
		return obj;
	}
	
}
