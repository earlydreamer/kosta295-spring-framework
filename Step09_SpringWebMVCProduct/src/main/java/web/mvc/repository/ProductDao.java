package web.mvc.repository;

import java.util.List;

import web.mvc.dto.ProductDTO;

public interface ProductDao {
	List<ProductDTO> select();
	ProductDTO selectByCode(String code);
	int insert(ProductDTO dto);
	int update(ProductDTO dto);
	int delete(String code);
}
