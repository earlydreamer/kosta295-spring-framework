package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.GoodsService;
import service.MemberService;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springAop.xml");
	
		System.out.println();
		MemberService service = context.getBean("target",MemberService.class);
		GoodsService servicegoods = context.getBean("target-goods",GoodsService.class);
		
		service.memberInsert("hello");
		service.memberUpdate();
		service.select("1", "1");
		service.memberDelete(0);
		
		System.out.println("--------------------");
		servicegoods.select();
		servicegoods.update();
		servicegoods.insert();
		
		
	}
	
}
