package sample02;

public class MemberService {
	private MemberDao memberdao;
	private Member member;
	
	public void serviceInsert() {
		System.out.println("memberservice serviceinsert call");
		memberdao.insert(member);
	}

	public MemberService(MemberDao memberdao, Member member) {
		super();
		System.out.println("memberservice ..");
		System.out.println("member "+member);
		this.memberdao = memberdao;
		this.member = member;
	}
	
	MemberService(){
		
	}

}
