package kosta.embed.domain;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Setter
public class Address {
	private String zipcode;
	private String state;
	private String city;
	private String addr;
	
}
