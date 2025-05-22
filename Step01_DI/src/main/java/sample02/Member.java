package sample02;

public class Member {
	
	private String id;
	private String password;
	private int age;
	private String addr;
	
	
	
	
	public Member() {
		
	}
	
	public Member(String id) {
		this.id = id;
		System.out.println("id="+id);
	}
	
	public Member(String id, String password) {
		this.id=id;
		this.password=password;
		System.out.println("id="+id+"password="+password);
	}
	
	public Member(String id, int age) {
		this.id=id;
		this.age=age;
		System.out.println("id="+id+"age="+age);
	}
	
	public Member(String id, String password, int age) {
		this.id=id;
		this.password=password;
		this.age=age;
		System.out.println("id="+id+"password="+password+"age="+age);
	}
	public Member(String id, String password, int age, String addr) {
		this.id=id;
		this.password=password;
		this.age=age;
		System.out.println("id="+id+"password="+password+"age="+age+"addr="+addr);
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", age=" + age + ", addr=" + addr + "]";
	}


}
