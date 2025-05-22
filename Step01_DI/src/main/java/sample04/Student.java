package sample04;

public class Student {
   private String name;
   private int no;
   private String phone;
   private String addr;
   
   public Student() {
	   System.out.println("Student 생성자..");
   }

	public void setName(String name) {
		System.out.println("setNamd(String addr) cal...");
		this.name = name;
	}
	
	public void setNo(int no) {
		System.out.println("setNo(String addr) cal...");
		this.no = no;
	}
	
	public void setPhone(String phone) {
		System.out.println("setPhone(String addr) cal...");
		this.phone = phone;
	}
	
	public void setAddr(String addr) {
		System.out.println("setAddr(String addr) cal...");
		this.addr = addr;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", no=" + no + ", phone=" + phone + ", addr=" + addr + "]";
	}
    
   
}
