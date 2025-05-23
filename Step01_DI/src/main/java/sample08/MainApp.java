package sample08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample07.BoardController;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("sample08/spring-map.xml");		
		context.getBean("bookController",BookController.class).invoker();
	}

}
