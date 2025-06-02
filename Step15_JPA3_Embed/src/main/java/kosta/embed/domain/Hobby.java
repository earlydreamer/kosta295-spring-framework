package kosta.embed.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class Hobby {

    @Id @GeneratedValue
    private Long id;
    private String name;

	
	
}
