package service;

import org.springframework.stereotype.Service;

@Service("target")
public class MemberServiceImpl implements MemberService {

	@Override
	public void memberInsert(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " insert");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Override
	public void memberUpdate() {
		// TODO Auto-generated method stub
		System.out.println("memberupdate");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int memberDelete(int no) {
		// TODO Auto-generated method stub
		System.out.println(no + " memberdelete");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public String select(String keyField, String keyWord) {
		// TODO Auto-generated method stub
		System.out.println(keyField+" "+keyWord+" "+"select");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
