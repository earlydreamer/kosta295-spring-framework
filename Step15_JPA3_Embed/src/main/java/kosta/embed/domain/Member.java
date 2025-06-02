package kosta.embed.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude="addressHistory")
@Getter
@Setter
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Embedded
	private ContactInfo contactinfo;

	@ElementCollection
	@CollectionTable(name="member_hobby", joinColumns =@JoinColumn (name="member_id"))
	private List<String> hobby = new ArrayList();
	
	//회원은 여러 개의 주소 정보 (우편번호, 시, 구, 동, 번지)를 가질 수 있다
	@ElementCollection
	@CollectionTable(name="member_address", joinColumns = @JoinColumn(name="member_id"))
	private List<Address> addressHistory;

	
	
}

















