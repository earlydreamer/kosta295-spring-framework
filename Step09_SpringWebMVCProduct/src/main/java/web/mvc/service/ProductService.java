package web.mvc.service;

import java.util.List;

import web.mvc.dto.ProductDTO;

public interface ProductService {
	List<ProductDTO> productSelect();
	ProductDTO productSelectByCode(String code);
	int productInsert(ProductDTO dto);
	int productUpdate(ProductDTO dto);
	int productDelete(String code);
}
