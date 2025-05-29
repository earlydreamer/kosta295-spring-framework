package web.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.UserDTO;

@Controller
@RequestMapping("/param")
@Slf4j
public class ParameterController {

	@RequestMapping("/a.do")
	public String asdf(String name, Integer age) { // int에 null이 들어갈 수 없다. 기본값을 주거나 Integer를 사용

		log.info("name={},age={}", name, age);
		System.out.println(name + "," + age);

		return "result";
	}

	@RequestMapping("/b.do")
	public String qwer(@RequestParam(defaultValue="guest", value="userId") String id, @RequestParam(defaultValue="0") int age) {
		//프론트에서 넘어오는 이름과 백엔드에서 받는 이름이 다를수있다. value 값을 주면 연결되는 파라미터 값을 바꿔줄 수 있다
		
		
		log.info("id={},age={}",id,age);		
		return "result";
	}
	
	/**
	 * parameter로 전달된 정보를 객체로 바인딩했을 때는 전달된 객체를 view에 가서 사용할 수 있다.
	 * ${객체이름.속성}
	 * 객체이름은 클래스의 첫글자를 소문자로 바꾼 값
	 * @param dto
	 * @return
	 */
	@PostMapping("/user.do")
	public String user(@ModelAttribute("dto") UserDTO dto) {
		log.info("dto={}",dto);
		return "user-result";
	}
	
	@ModelAttribute("msg")
	public String Test() {
		System.out.println("test");
		return "테스트";
	}
	
	@ModelAttribute("menu")
	public List<String> test2(){
		return Arrays.asList("짜장","탕수육","짬뽕","군만두");
	}
}
