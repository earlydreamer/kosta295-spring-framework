package sample06;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//annotation을 통한 주입 테스트
public class EmpController {
	@Autowired // 객체 주입 -> 기본적으로 ByType으로 주입함. 같은Type이 2개 이상 있을 경우면 byName으로 주입 시도
	@Qualifier("dto") EmpDTO dto;
	@Autowired @Qualifier("dto2") EmpDTO dto2;
	@Autowired EmpService service;

	public EmpController() {
		System.out.println("Run Controller Constructor");
	}
	
	@PostConstruct
	void init() {
	}

	public void empTest() {
		System.out.println("empTest Call");
		System.out.println(dto);
		System.out.println(dto2);
		System.out.println(service);

		service.test(dto);

	}

}
