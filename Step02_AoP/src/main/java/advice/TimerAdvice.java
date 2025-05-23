package advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

/**
 * 공통관심사항
 * 사전-사후 시간체크
 * around 처리
 * @author kosta
 */


@Component
public class TimerAdvice {
	
	public Object around(ProceedingJoinPoint joinpoint) throws Throwable{
		String methodname = joinpoint.getSignature().getName();
		StopWatch sw = new StopWatch();
		sw.start();
		Object obj = joinpoint.proceed();
		sw.stop();
		System.out.println("총실행시간 : "+sw.getTotalTimeMillis());
		return obj;
	}
	
}
