package sample07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BoardDto dto = new BoardDto(100,"ㅇ1","ㅇ2");
//		System.out.println(dto);
//		new BoardDto();

		ApplicationContext context = new ClassPathXmlApplicationContext("sample07/di.xml","sample07/product-init-context.xml");
		
//		context.getBean("boardMybatis",BoardDao.class);
		context.getBean("controller",BoardController.class).select();
		
		
	}

}
