package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main (String argsp[]) {
		
		//Spring Container를 사용하지 않은 코드
		/*StudentDAO dao =new StudentDAOImpl();
		
		StudentService service = new StudentServiceImpl();
		StudentServiceImpl serviceImp =(StudentServiceImpl) service;
		serviceImp.setStudentDAO(dao);
		
		Student student = new Student();
		student.setNo(1);
		student.setAddr("서울");
		student.setName("희정");
		student.setPhone("111-2222");
		
		StudentController controller = new StudentController();
		controller.setStudentService(service);
		controller.setStudent(student);
		
		controller.insert();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample04/StudentApplicationContext.xml");
		
		System.out.println("--");
		
		context.getBean("controller");
		
		
		
	}

}
