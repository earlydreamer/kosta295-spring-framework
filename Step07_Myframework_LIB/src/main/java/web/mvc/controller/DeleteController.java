package web.mvc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Spring �����ӿ�ũ import

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class DeleteController implements Controller {
//Spring���� �����ϴ� Controller�� ��ü	
	
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DeleteController �Դϴ�....");
		return new ModelAndView("index");//�⺻���� forward ����̴�. spring������ Ȯ���ڸ� ���� �ʴ´�.
		//ViewResolver�� ���� prefix�� suffix�� �ڵ����� �ٱ� ����
//		return new ModelAndView("index.jsp", true);
	}

}
