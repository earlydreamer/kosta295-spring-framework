package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.CustomerService;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("springAop.xml");
		CustomerService service = context.getBean("customerService",CustomerService.class);
		service.select();
		service.update();
		String str = service.selectById("1");
//		service.selectById(null); // null이 들어갔으니 returning 실행안되고 throwing이 실행된다
		System.out.println("return="+str);
		
		

	}

}
