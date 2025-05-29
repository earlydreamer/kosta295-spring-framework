package web.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.ProductDTO;
import web.mvc.dto.UserDTO;

@Slf4j
//@Controller
@RestController // controller�� responseBody�� ����� ��
public class ResponseBodyController {

	@GetMapping("/responseBody.do")
//	@ResponseBody //���ϰ��� response Body�� ������ش�.
	public String aaa() {
		log.info("responsebody��û");
		return "helloworld";
	}

	@GetMapping(value = "/responseBody2.do", produces = { "text/html;charset=UTF-8" })
	@ResponseBody // ���ϰ��� response Body�� ������ش�.
	public String aab() {
		log.info("responsebody ��û2");
		// �׳� ����ϸ� �ѱ��� ������ ���ڵ��� utf-8�� ��������Ѵ�
		return "helloworld ��ο���";
	}

	/**
	 * Java ��ü�� ResponseBody�� �����ϱ� ���� json ��ȯ �ʿ� Spring������ jackson-databind ���̺귯����
	 * ���� ���
	 * 
	 * @return
	 */
	@GetMapping(value = "/responseBody3.do")
	@ResponseBody // ���ϰ��� response Body�� ������ش�.
	public ProductDTO aac() {
		log.info("responsebody ��û3");
		// �׳� ����ϸ� �ѱ��� ������ ���ڵ��� utf-8�� ��������Ѵ�
		return ProductDTO.builder().code("A01").detail("����").price(1200).build();
	}
	

	
	
}
