package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample02.MemberService;

public class MainApp {
	public static void main (String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample03/BookApplicationConstructor.xml");
		
		BookController controller = context.getBean("controller",BookController.class);
		controller.BookInsert();
		//bean기반으로 생성자주입
		//출력
		
		
	}
}
