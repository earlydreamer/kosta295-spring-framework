package web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class PathVariableController {
	@RequestMapping("/{type}/{id}.do")
	// ������ ������
	public void aa(@PathVariable String type, @PathVariable String id) {
		log.info("aaȣ��� {},{}", type, id);

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

		
		//controller->controller ��û�ϰ� ������
//		return "result";
//		return "redirect:/a.do";// a.do�� ���� (URL �ּ� �ٲ�) (PRG ���)
		return "forward:/a.do";// a.do�� ���� (URL �ּ� �״����)
	}

	
	//�ƹ��͵� ���ϰ� �ܼ��� ������ �����̷��Ǹ� ������
	//������ �ּ� = �� �̸�... �̷��� �ϸ� requestMapping�� ������ ������ �ʾƵ� �ȴ�
	@RequestMapping("{url}.do")
	public void url() {
		
	}
	
	
}
