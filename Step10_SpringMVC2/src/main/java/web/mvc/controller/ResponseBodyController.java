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
@RestController // controller와 responseBody를 묶어둔 것
public class ResponseBodyController {

	@GetMapping("/responseBody.do")
//	@ResponseBody //리턴값을 response Body로 만들어준다.
	public String aaa() {
		log.info("responsebody요청");
		return "helloworld";
	}

	@GetMapping(value = "/responseBody2.do", produces = { "text/html;charset=UTF-8" })
	@ResponseBody // 리턴값을 response Body로 만들어준다.
	public String aab() {
		log.info("responsebody 요청2");
		// 그냥 출력하면 한글이 깨진다 인코딩을 utf-8로 맞춰줘야한다
		return "helloworld 헬로월드";
	}

	/**
	 * Java 객체를 ResponseBody로 응답하기 위해 json 변환 필요 Spring에서는 jackson-databind 라이브러리를
	 * 많이 사용
	 * 
	 * @return
	 */
	@GetMapping(value = "/responseBody3.do")
	@ResponseBody // 리턴값을 response Body로 만들어준다.
	public ProductDTO aac() {
		log.info("responsebody 요청3");
		// 그냥 출력하면 한글이 깨진다 인코딩을 utf-8로 맞춰줘야한다
		return ProductDTO.builder().code("A01").detail("오예").price(1200).build();
	}
	

	
	
}
