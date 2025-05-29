package web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

	@RequestMapping("/")
	String gotomain() {
		return "redirect:/controller";
	}
	

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
	
	@RequestMapping("/updateForm/{code}")
	String update(@PathVariable String code, Model model) {
		ProductDTO product = productService.productSelectByCode(code);
		model.addAttribute("product",product);
		return "updateForm";
	}
	
	@PostMapping("/products")
	public String update(@ModelAttribute("product") ProductDTO product) {
	    productService.productUpdate(product);		
	    return "read";
	}

	@GetMapping("/insertForm")
	public String insertform() {		
	    return "insertForm";
	}
	
	
	
	@PostMapping("/products/{code}")
	public String update(
			@ModelAttribute("product") ProductDTO product, 
			@PathVariable String code) { //${product.code}
		
		product.setCode(code);
		productService.productUpdate(product);		
		return "read";// WEB-INF/views/read.jsp ¿Ãµø
	
	}
	

	@GetMapping("/products")
	String products() {
		return "redirect:/Controller";
	}
	
	@RequestMapping("/del/{code}")
	String delete(@PathVariable String code, Model model) {
		productService.productDelete(code);
		System.out.println("code="+code);
		model.addAttribute("productList",productService.productSelect());
		return "redirect:/controller";
	}
	
//	@RequestMapping("{url}")
//	public void url() {
//		
//	}

}
