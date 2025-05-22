package sample03;

public class BookVo {
	String subject;
	String writer;
	int price;
	String date;
	
	BookVo(){
		
	}

	public BookVo(String subject, String writer, int price, String date) {
		super();
		this.subject = subject;
		this.writer = writer;
		this.price = price;
		this.date = date;
	}

	@Override
	public String toString() {
		return "BookVo [subject=" + subject + ", writer=" + writer + ", price=" + price + ", date=" + date + "]";
	}
	

}
