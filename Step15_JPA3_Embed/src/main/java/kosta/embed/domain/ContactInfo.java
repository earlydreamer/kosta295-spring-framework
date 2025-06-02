package kosta.embed.domain;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
public class ContactInfo {
	@Column(nullable=false,length=100)
	private String mobilePhone;
	private String housePhone;
	private String companyPhone;
	
}
