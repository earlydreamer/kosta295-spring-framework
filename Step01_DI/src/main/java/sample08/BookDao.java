package sample08;

public interface BookDao {
	void save(EmailSender sender, MessageSender messagesender, BookDto dto, BookDto dto2);
}
