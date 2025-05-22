package sample01;

public class MessageBeanEngImpl implements MessageBean {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"ENGLISH");
	}

	
	public MessageBeanEngImpl(){
		System.out.println("en호출");

	}
}
