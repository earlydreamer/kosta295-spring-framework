package sample06;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

public class EmpDTO {

	@Value("${empno}")
	private String empno;
	@Value("${name}")
	private String name;
	@Value("${job}")
	private String job;

	public EmpDTO() {
		System.out.println("Run EmpDTO Constructor");
		System.out.println("empno="+empno);
		
		//생성자안에서는 주입된 정보를 확인할수없다
		//주입은 생성 후 필드를통해 이루어진다. 이단계에선 확인할수없다		
		
	}
	
	//생성과 주입이 완료된 후 실행할 일을 PostConstruct에 등록한다
	//Spring의 기능이 아님 Javax.Annotation의 기능이므로 추가 Dependency 필요함
	@PostConstruct
	public void init() {
		System.out.println(this);
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", name=" + name + ", job=" + job + "]";
	}

}
