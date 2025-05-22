package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("a","1234",20,"서울");
		MemberDao dao = new MemberDao();
		
		MemberService service = new MemberService();
//		service.serviceInsert();
		ApplicationContext context= new ClassPathXmlApplicationContext("sample02/ApplicationConstructor.xml");		
		service=context.getBean("service",MemberService.class);
		service.serviceInsert();		

	}

}
