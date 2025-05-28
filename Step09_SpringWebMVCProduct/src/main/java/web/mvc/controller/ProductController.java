package web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.mvc.dto.ProductDTO;
import web.mvc.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	

	@RequestMapping("/controller")
	String home(Model model){
		model.addAttribute("productList",productService.productSelect());		
		return "productList";
	}
	
	@RequestMapping("/read")
	String selectById(@RequestParam String code, Model model) {
		model.addAttribute("product",productService.productSelectByCode(code));
		return "read";
	}
	
	@RequestMapping("/update")
	String update(ProductDTO dto) {		
		return "productList";
	}
	
	@RequestMapping("/products")
	String insert(ProductDTO dto) {
		productService.productInsert(dto);
		return "redirect:/controller";
	}
	
	@RequestMapping("/del/{code}")
	String delete(@PathVariable String code, Model model) {
		productService.productDelete(code);
		System.out.println("code="+code);
		model.addAttribute("productList",productService.productSelect());
		return "redirect:/controller";
	}
	
	@RequestMapping("{url}")
	public void url() {
		
	}

}
