package sample03;

public class BookController {
	BookDao dao;
	BookVo vo;
	
	BookController(){
		
	}
	
	BookController(BookDao dao,BookVo vo){
		this.dao = dao;
		this.vo=vo;
	}
	
	void BookInsert() {
		System.out.println("call dao insert");
		dao.insert(vo);
		System.out.println(vo);
	}
	
	
}
