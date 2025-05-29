package web.mvc.repository;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import web.mvc.dto.ProductDTO;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	List<ProductDTO> productDtoList;
	
//	@PostConstruct
//	public void a() {
//		System.out.println("tkdl = " + productDtoList.size());
//		System.out.println("productDtoList = " + productDtoList);
//	}

	@Override
	public List<ProductDTO> select() {
		// TODO Auto-generated method stub
		System.out.println(productDtoList);
		return productDtoList;
	}

	@Override
	public ProductDTO selectByCode(String code) {
		// TODO Auto-generated method stub
		for (ProductDTO dto : productDtoList) {
			if (dto.getCode() == null)
				continue; // 왜 null이 하나 껴있는지 모르겠는데 null 있으면 터지니까 null체크후 스킵
			if (dto.getCode().equals(code))
				return dto;
		}
		return new ProductDTO();// null일경우 빈객체를 만들어보낸다 (임시처리)
	}

	@Override
	public int insert(ProductDTO dto) {
		// TODO Auto-generated method stub
		productDtoList.add(dto);
		return 0;
	}

	@Override
	public int update(ProductDTO dto) {
		int count = -1;
		for (ProductDTO curdto : productDtoList) {
			count++;
			System.out.println("index="+count);
			if (curdto.getCode() == null)
				continue;
			else if (curdto.getCode().equals(dto.getCode())) {
				productDtoList.remove(count);
				break;
			}
		}
		productDtoList.add(dto);
		return 0;
	}

	@Override
	public int delete(String code) {
		// TODO Auto-generated method stub
		int count = -1;
		for (ProductDTO dto : productDtoList) {
			count++;
			System.out.println("index="+count);
			if (dto.getCode() == null)
				continue;
			else if (dto.getCode().equals(code)) {
				productDtoList.remove(count);
				break;
			}
				
		}
		return 0;
	}

}
