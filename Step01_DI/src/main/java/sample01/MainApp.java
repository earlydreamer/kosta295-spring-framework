package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		/*
		 * MessageBean bean = new MessageBeanKorImpl(); bean.sayHello("ㅇㅇㅇ");
		 * 
		 * bean = new MessageBeanEngImpl(); bean.sayHello("ddd");
		 */

		/**
		 * Spring Container IoC의 ApplicationContext를 이용한 객체관리 bean등록, 생성, 의존관계 주입, 생명주기
		 * 관리
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("sample01/ApplicationContext.xml");
		MessageBean bean = context.getBean("en",MessageBean.class);
		System.out.println(bean);
		bean.sayHello("hello");
		
		bean = context.getBean("ko",MessageBean.class);
		System.out.println(bean);
		bean.sayHello("ㅇㅇ");

		MessageBean bean2 = context.getBean("ko",MessageBean.class);
		System.out.println(bean2);
		bean.sayHello("ㅇㅇ");
		
		//SpringContainer는 객체를 싱글턴 형태로 관리한다
		//메모리에 미리 로딩하고 같은 ID를 여러번 getBean으로 호출하면 항상 같은 객체가 나온다...
		//즉시 로딩
		//bean설정에 prototype으로 설정하면 getBean 시 새로운 객체 생성
		
	}

}
