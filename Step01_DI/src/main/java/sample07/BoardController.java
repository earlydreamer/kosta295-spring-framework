package sample07;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Controller("controller") public class BoardController {
	
	private final BoardService service;
	@Autowired
	private BoardDto dto;
	@Autowired
	private BoardDto dto2;
	@PostConstruct
	void init() {
		System.out.println("boardService="+service);
		System.out.println("dto1="+dto);
		System.out.println("dto2="+dto2);
	}
	
	public void select() {		
		System.out.println("boardDTO="+dto);
		System.out.println("boardService="+service);
	}
}
