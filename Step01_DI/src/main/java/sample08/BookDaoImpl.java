package sample08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BookDaoImpl implements BookDao {

	private final DbUtil db;
	
	@Override
	public void save(EmailSender sender, MessageSender messagesender, BookDto dto, BookDto dto2) {
		// TODO Auto-generated method stub
		System.out.println("emailSender="+sender);
		System.out.println("messageSender="+messagesender);
		System.out.println("book1="+dto);
		System.out.println("book2="+dto2);
		System.out.println("dbutil="+db);
		
	}

}
