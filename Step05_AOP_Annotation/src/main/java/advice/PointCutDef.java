package advice;

import org.aspectj.lang.annotation.Pointcut;

/**
 * \ PointCut 기록
 * 
 * @author kosta
 *
 */
public class PointCutDef {

	@Pointcut("Execution (* service.*Impl.*(..))")
	public void aa() {
		System.out.println("aa");
	}

	public void bb() {
	}

	public void cc() {
	}

	public void dd() {
	}

}
