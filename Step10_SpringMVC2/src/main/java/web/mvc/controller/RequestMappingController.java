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
		System.out.println("a.do 요청 들어옴");

		ModelAndView mv;
		mv = new ModelAndView();
		mv.addObject("message", "spring test");
		mv.addObject("hobbies", Arrays.asList("취미1", "취미2", "취미3", "취미4"));
		mv.setViewName("result");// WEB-INF/views/result.jsp로 이동
		return mv;

	}

	/**
	 * Return이 String인 경우 리턴하는 문자열이 View의 이름이 된다. Spring이 자동으로 맞춰준다
	 * 
	 * @return
	 */
	@RequestMapping("/rem/a.do")
	public String bb() {
		System.out.println("rem/a.do 요청됨");
		return "result";// /WEB-INF/views/result.jsp
	}

	/**
	 * 여러 요청 주소가 하나의 메소드를 가리킬 경우
	 *  
	 * @return
	 * @param : Model 선언하면 Model 객체를 전달받음
	 * Model에 정보를 저장해 View로 Model을 전달해 정보를 사용할 수 있음
	 */
	@RequestMapping(value = { "/b.do", "/c.do" })
	
	public void bbb(Model model) {
		// void형은 요청 주소가 view의 이름이 된다.
		System.out.println("b.do || c.do 요청");
		model.addAttribute("message","Model에 저장된 정보");
	}	
	
	/**
	 * 요청 방식 분리
	 * @throws UnsupportedEncodingException
	 * method : post, get, put, patch, delete -> REST한 행위를 메소드명으로 나타낸다
	 * @RequestMapping 요청 타입 관계없이 응답
	 * @PostMapping POST 요청에만 응답
	 * @GetMapping Get 요청에만 응답
	 * @PutMapping Put 요청에만 응답
	 * @PatchMapping Patch 요청에 응답
	 * @DeleteMapping Delete 요청에만 응답
	 */
	//@RequestMapping("/test.do")
	@PostMapping("/test.do") //이 요청을 POST 전용으로 설정
	public ModelAndView ccc(HttpServletRequest request) throws UnsupportedEncodingException {
		//request.setCharacterEncoding("utf-8"); //인코딩을 바꿔주지 않으면 POST에서 한글이 제대로 안 나옴
		// 위와 같은 인코딩은 filter로 처리한다	
		
		String name = request.getParameter("name");
		System.out.println("name="+name);
		return new ModelAndView("result","message","요청방식구분");
		
	}
	
	@GetMapping("/test.do")
	public String asdf() {
		//요청주소가 같지만 다른 메소드로 연결됨
		
		System.out.println("get은 이쪽으로");
		return "result";
	}
	
	@RequestMapping(value="/a.do", params="id") //params가 없으면 같은 진입점이 2개가 되므로 에러가 난다
	public String qwer(String id) {
		System.out.println("rem/a.do?id= 요청입니다" +id);
		return "result"; //WEB-INF/views/result.jsp로 이동
	}
	
	
	
}
