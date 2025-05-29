package web.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.ProductDTO;
import web.mvc.dto.UserDTO;
import web.mvc.exception.AjaxException;
import web.mvc.exception.ErrorInfo;

@Controller
@Slf4j
public class AjaxController {

	@Autowired
	List<ProductDTO> list;

	@PostMapping("/ajax.do")
	public ProductDTO ajaxbtn(String email, String pwd) {
		// String���� �޾ƺ���
		log.info("email:{},pwd:{}", email, pwd);
		return ProductDTO.builder().code("123").detail("ddd").price(1234).name("ddd1").build();
	}

	/**
	 * @RequestBody ������ front���� json���� ������ ����
	 * @param userDto
	 * @return
	 */
	@PostMapping("/ajax2.do")
	public ResponseEntity<?> ajax2(@RequestBody UserDTO userDto) {
		// String���δ� �޾����µ�, ��üŸ�����δ� �� �޾�����
		// JSON���� �ְ�޾ƾ� �ϴµ� ��������@RequestBody annotation�� �ٿ����Ѵ�
		log.info("userDto:{}", userDto);
		return ResponseEntity.status(HttpStatus.CREATED).body("OK");
	}

	@PostMapping("/ajax3.do")
	public ResponseEntity<?> ajax3(@RequestBody UserDTO userDto) {
		log.info("UserDto{}", userDto);
		if (userDto.getAge() < 18) {
			throw new AjaxException(ErrorInfo.INVALID_AGE);
		}
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}

	@RequestMapping("/ajax4.do")
	public ResponseEntity<?> ajax4(@RequestBody UserDTO userDTO) {
		log.info("userDTO = {}", userDTO);

		HttpHeaders resHeaders = new HttpHeaders();
		resHeaders.add("Content-Type", "application/json;charset=UTF-8");
		return new ResponseEntity<>("OK", resHeaders, HttpStatus.CREATED);

	}

}
