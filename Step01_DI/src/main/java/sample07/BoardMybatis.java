package sample07;

import org.springframework.stereotype.Repository;

@Repository //id는 클래스 이름의 첫글자를 소문자로 한 것으로 자동 등록됨
//@Repository("dao") //id를 dao로 지정
public class BoardMybatis implements BoardDao {

	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("select mybatis");

	}
	
	public BoardMybatis(){
		System.out.println("test Mybatis");
	}

}
