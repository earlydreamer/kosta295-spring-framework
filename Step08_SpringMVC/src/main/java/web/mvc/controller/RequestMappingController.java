package web.mvc.controller;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rem/")
public class RequestMappingController {

	@RequestMapping("/a.do")
	public ModelAndView aa() {
		System.out.println("a.do ��û ����");

		ModelAndView mv;
		mv = new ModelAndView();
		mv.addObject("message", "spring test");
		mv.addObject("hobbies", Arrays.asList("���1", "���2", "���3", "���4"));
		mv.setViewName("result");// WEB-INF/views/result.jsp�� �̵�
		return mv;

	}

	/**
	 * Return�� String�� ��� �����ϴ� ���ڿ��� View�� �̸��� �ȴ�. Spring�� �ڵ����� �����ش�
	 * 
	 * @return
	 */
	@RequestMapping("/rem/a.do")
	public String bb() {
		System.out.println("rem/a.do ��û��");
		return "result";// /WEB-INF/views/result.jsp
	}

	/**
	 * ���� ��û �ּҰ� �ϳ��� �޼ҵ带 ����ų ���
	 *  
	 * @return
	 * @param : Model �����ϸ� Model ��ü�� ���޹���
	 * Model�� ������ ������ View�� Model�� ������ ������ ����� �� ����
	 */
	@RequestMapping(value = { "/b.do", "/c.do" })
	
	public void bbb(Model model) {
		// void���� ��û �ּҰ� view�� �̸��� �ȴ�.
		System.out.println("b.do || c.do ��û");
		model.addAttribute("message","Model�� ����� ����");
	}	
	
	/**
	 * ��û ��� �и�
	 * @throws UnsupportedEncodingException
	 * method : post, get, put, patch, delete -> REST�� ������ �޼ҵ������ ��Ÿ����
	 * @RequestMapping ��û Ÿ�� ������� ����
	 * @PostMapping POST ��û���� ����
	 * @GetMapping Get ��û���� ����
	 * @PutMapping Put ��û���� ����
	 * @PatchMapping Patch ��û�� ����
	 * @DeleteMapping Delete ��û���� ����
	 */
	//@RequestMapping("/test.do")
	@PostMapping("/test.do") //�� ��û�� POST �������� ����
	public ModelAndView ccc(HttpServletRequest request) throws UnsupportedEncodingException {
		//request.setCharacterEncoding("utf-8"); //���ڵ��� �ٲ����� ������ POST���� �ѱ��� ����� �� ����
		// ���� ���� ���ڵ��� filter�� ó���Ѵ�	
		
		String name = request.getParameter("name");
		System.out.println("name="+name);
		return new ModelAndView("result","message","��û��ı���");
		
	}
	
	@GetMapping("/test.do")
	public String asdf() {
		//��û�ּҰ� ������ �ٸ� �޼ҵ�� �����
		
		System.out.println("get�� ��������");
		return "result";
	}
	
	@RequestMapping(value="/a.do", params="id") //params�� ������ ���� �������� 2���� �ǹǷ� ������ ����
	public String qwer(String id) {
		System.out.println("rem/a.do?id= ��û�Դϴ�" +id);
		return "result"; //WEB-INF/views/result.jsp�� �̵�
	}
	
	
	
}
