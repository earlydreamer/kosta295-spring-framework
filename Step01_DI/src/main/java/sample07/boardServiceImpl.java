package sample07;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class boardServiceImpl implements BoardService{
	@Autowired
	@Qualifier("oracle")
	BoardDao oracleDao;
	@Autowired
	@Qualifier("boardMybatis")
	BoardDao mybatisDao;
	
	boardServiceImpl(){
	System.out.println("service constructor");
	}
	
	@PostConstruct
	void init() {
		System.out.println(oracleDao);
		System.out.println(mybatisDao);
	}
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
	}

}
