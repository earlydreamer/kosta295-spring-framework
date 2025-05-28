package web.mvc.repository;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import web.mvc.dto.ProductDTO;

@Component
public class ProductDaoImpl implements ProductDao {

	@Autowired
	List<ProductDTO> productDtoList;
	
	@PostConstruct
	public void a() {
		System.out.println("tkdl = " + productDtoList.size());
		System.out.println("productDtoList = " + productDtoList);
	}

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
				continue; // �� null�� �ϳ� ���ִ��� �𸣰ڴµ� null ������ �����ϱ� nullüũ�� ��ŵ
			if (dto.getCode().equals(code))
				return dto;
		}
		return new ProductDTO();// null�ϰ�� ��ü�� �������� (�ӽ�ó��)
	}

	@Override
	public int insert(ProductDTO dto) {
		// TODO Auto-generated method stub
		productDtoList.add(dto);
		return 0;
	}

	@Override
	public int update(ProductDTO dto) {
		productDtoList.remove(dto);
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
