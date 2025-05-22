package sample01;

public class MessageBeanKorImpl implements MessageBean {
	@Override
	public void sayHello(String name) {
		System.out.println(name+"한국말");
		// TODO Auto-generated method stub
		
	}
	
	public MessageBeanKorImpl() {
		System.out.println("ko호출");
	}

}
