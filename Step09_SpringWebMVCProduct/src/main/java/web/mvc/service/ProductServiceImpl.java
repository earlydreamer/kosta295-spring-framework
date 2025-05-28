package web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.mvc.dto.ProductDTO;
import web.mvc.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao productDao;
	
	@Override
	public List<ProductDTO> productSelect() {
		// TODO Auto-generated method stub
		return productDao.select();
	}

	@Override
	public ProductDTO productSelectByCode(String code) {
		// TODO Auto-generated method stub
		System.out.println(code);
		return productDao.selectByCode(code);
	}

	@Override
	public int productInsert(ProductDTO dto) {
		// TODO Auto-generated method stub
		productDao.insert(dto);
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
