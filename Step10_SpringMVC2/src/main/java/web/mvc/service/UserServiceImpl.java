package web.mvc.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import web.mvc.dto.ProductDTO;
import web.mvc.exception.BasicException;
import web.mvc.exception.ErrorInfo;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

	@Autowired
	private List<ProductDTO> product;
	
	@PostConstruct
	public void init() {
		log.info("list={}",product);
	}
	
	@Override
	public void ageCheck(int age) throws BasicException {
		// TODO Auto-generated method stub
		log.info("age={}", age);
		if (age < 18)
			throw new BasicException(ErrorInfo.INVALID_AGE);

	}

	@Override
	public void idCheck(String id) throws BasicException {
		// TODO Auto-generated method stub
		log.info("id={}", id);
		if (id.equals(id))
			throw new BasicException(ErrorInfo.DUPLICATED_ID);
	}

}
