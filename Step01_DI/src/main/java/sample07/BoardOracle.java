package sample07;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("oracle")
public class BoardOracle implements BoardDao {

	@Autowired
	private List<ProductDTO> list;
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("select oracle");
	}
	
	@PostConstruct
	void init() {
		System.out.println(list);
	}
	
	public BoardOracle() {
		System.out.println("test Oracle");
	}

}
