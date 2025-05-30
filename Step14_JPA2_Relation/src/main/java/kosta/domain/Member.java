package kosta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
//@ToString //ToString은 여기있는 모든 객체를 출력한다. 지연로딩 시 Team을 가져온다.
@ToString //(exclude="team") //team은 toString에 포함시키지 않는다. 이러면 매번 team을 찾지 않는다. 

public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long memberId;
	@Column(nullable=false,length=100)
	private String memberName;
	private int age;
	
	//관계설정
	//@ManyToOne
	//@OneToMany
	//@OneToOne
	@ManyToOne //즉시로딩(무조건 Join)
//	@ManyToOne(fetch=FetchType.LAZY) // 지연로딩
	@JoinColumn(name="team_id")
	private Team team;
	
}
