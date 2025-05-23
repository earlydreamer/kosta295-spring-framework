package sample08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class BookServiceImpl implements BookService {
	@Autowired
	EmailSender emailSender;
	@Autowired
	MessageSender messageSender;
	@Autowired
	BookDao bookDao;
	
	@Override
	public void save(BookDto dto1, BookDto dto2) {
	bookDao.save(emailSender, messageSender, dto1, dto2);		
	}
	
}
