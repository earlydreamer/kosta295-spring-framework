package sample08;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
@Scope("prototype")
public class BookDto {	
	//lombok으로 자동 세팅
	@Value("책")
	private String subject;
	@Value("저자")
	private String writer;
	@Value("1000")
	private int price;
	@Value("2025-05-23")
	private String date;			
}
