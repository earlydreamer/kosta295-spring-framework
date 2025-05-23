package sample07;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @AllArgsConstructor 
@NoArgsConstructor // final이 있으면 기본생성자를 못 만듬
@RequiredArgsConstructor //final 필드 혹은 non-null 필수 인수를 포함한 Constructor 생성
//@ToString(exclude="subject") //subject를 제외하고 toString을 실행
@ToString
@Component
@Scope("prototype")
public class BoardDto {
	//롬복 쓸 거임
	//getter-setter가 묵시적으로 생성된다
	
	@NonNull
	@Value("100")
	private int no;
	@Value("asdf")
	private String subject;
//	private final String subject;
	@Value("asdfasdf")
	private String content;
	
	

}
