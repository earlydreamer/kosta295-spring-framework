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
	public String asdf(String name, Integer age) { // int�� null�� �� �� ����. �⺻���� �ְų� Integer�� ���

		log.info("name={},age={}", name, age);
		System.out.println(name + "," + age);

		return "result";
	}

	@RequestMapping("/b.do")
	public String qwer(@RequestParam(defaultValue="guest", value="userId") String id, @RequestParam(defaultValue="0") int age) {
		//����Ʈ���� �Ѿ���� �̸��� �鿣�忡�� �޴� �̸��� �ٸ����ִ�. value ���� �ָ� ����Ǵ� �Ķ���� ���� �ٲ��� �� �ִ�
		
		
		log.info("id={},age={}",id,age);		
		return "result";
	}
	
	/**
	 * parameter�� ���޵� ������ ��ü�� ���ε����� ���� ���޵� ��ü�� view�� ���� ����� �� �ִ�.
	 * ${��ü�̸�.�Ӽ�}
	 * ��ü�̸��� Ŭ������ ù���ڸ� �ҹ��ڷ� �ٲ� ��
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
		return "�׽�Ʈ";
	}
	
	@ModelAttribute("menu")
	public List<String> test2(){
		return Arrays.asList("¥��","������","«��","������");
	}
}
