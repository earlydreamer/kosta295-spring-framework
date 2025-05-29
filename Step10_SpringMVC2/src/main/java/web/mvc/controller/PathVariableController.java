package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PathVariableController {
	@RequestMapping("/{type}/{id}.do")
	// 장점은 유연함
	public void aa(@PathVariable String type, @PathVariable String id) {
		log.info("aa호출됨 {},{}", type, id);

	}

	@RequestMapping("/{id}")
	public String id(@PathVariable String id) {
		log.info("id={}", id);
		return "result";

	}

	@RequestMapping("/{type}/{name}/{id}")
	public String test( @PathVariable String type, 
						@PathVariable String name, 
						@PathVariable String id) {
		log.info("type={},name={}", type, name);
		log.info("id={}", id);

		
		//controller->controller 요청하고 싶으면
//		return "result";
//		return "redirect:/a.do";// a.do로 보냄 (URL 주소 바뀜) (PRG 방식)
		return "forward:/a.do";// a.do로 보냄 (URL 주소 그대로임)
	}

	
	//아무것도 안하고 단순히 페이지 리다이렉션만 시켜줌
	//들어오는 주소 = 뷰 이름... 이렇게 하면 requestMapping을 일일히 만들지 않아도 된다
	@RequestMapping("{url}.do")
	public void url() {
		
	}
	
	
}
