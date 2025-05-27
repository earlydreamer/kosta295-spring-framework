package service;

public class GoodsService {
	
	public void insert() {
		System.out.println("insert");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String select() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("select");
		return "select return";
		
	}

	public void update() {
		System.out.println("update");		
	}
}
