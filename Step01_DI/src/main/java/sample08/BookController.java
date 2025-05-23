package sample08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Controller
@AllArgsConstructor
@NoArgsConstructor
public class BookController {
	@Autowired
	private BookDto book1;
	@Autowired
	private BookDto book2;
	@Autowired
	private BookService service;

	void invoker() {
		service.save(book1, book2);
	}
	
	
}
