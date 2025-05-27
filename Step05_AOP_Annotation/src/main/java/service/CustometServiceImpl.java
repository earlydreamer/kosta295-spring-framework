package service;

import org.springframework.stereotype.Service;

@Service("customerService")
public class CustometServiceImpl implements CustomerService {

	@Override
	public int select() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+"SELECT");
		return 0;
	}

	@Override
	public String selectById(String id) {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+"ID="+id);
		if (id==null)
			throw new RuntimeException("id must not null");
		return "RETURN";
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName()+"update");
		
	}

}
