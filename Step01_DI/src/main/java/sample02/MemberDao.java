package sample02;

public class MemberDao {
	
	public MemberDao() {
		
	}
	
	public void insert(Member member) {
		System.out.println("Memberdao insert call");
		System.out.println("member"+member);
	}

}
