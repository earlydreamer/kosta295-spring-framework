package web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.mvc.dto.ProductDTO;
import web.mvc.exception.ErrorCode;
import web.mvc.exception.MyErrorException;
import web.mvc.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	private final static int MIN_PRICE = 1000;
	private final static int MAX_PRICE = 10000;

	@Autowired
	ProductDao productDao;

	@Override
	public List<ProductDTO> productSelect() {
		return productDao.select();
	}

	@Override
	public ProductDTO productSelectByCode(String code) {
		// System.out.println(code);
		ProductDTO dto = productDao.selectByCode(code);
		if (dto.getCode() == null)
			throw new MyErrorException(ErrorCode.INVALID_PRODUCT_CODE);

		return dto;
	}

	@Override
	public int productInsert(ProductDTO dto) {
		// TODO Auto-generated method stub
		List<ProductDTO> list = productDao.select();
		if(dto.getPrice()>=MAX_PRICE || dto.getPrice()<=MIN_PRICE)
			throw new MyErrorException(ErrorCode.INVALID_PRICE);
		else {
			if(list.contains(dto))
				throw new MyErrorException(ErrorCode.DUPLICATE_PRODUCT_CODE);
			else productDao.insert(dto);
		}
		return 0;
	}

	@Override
	public int productUpdate(ProductDTO dto) {
		// TODO Auto-generated method stub
		productDao.update(dto);
		return 0;
	}

	@Override
	public int productDelete(String code) {
		// TODO Auto-generated method stub
		productDao.delete(code);
		return 0;
	}

}
