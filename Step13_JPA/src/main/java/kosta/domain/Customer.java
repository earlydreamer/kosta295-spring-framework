package kosta.domain;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
	 * @GeneratedValue 는 자동으로 값을 넣어준다.
	 *  : strategy는 persistence provider가 엔티티의 기본키를 생성할때 사용해야하는 주키 생성 전략을 뜻함 (기본 AUTO)
	 *  1) GenerationType.AUTO
	 *      : 데이터베이싀 벤더에 종속적이지 않고 hibernate 내부에서 기본키를 생성해서 할당해주는 방법 
	 *      : Oracle - SEQUENCE , MYSQL -AUTOINCREMENT , MSSQL  - IDENTITY
	 *  2) GenerationType.SEQUENCE
	 *       : ORACLE 의 시퀀스 개념을 사용할때 
	 *       : 이 전략을 쓸때는 반드시   @SequenceGenerator 함께 사용
	 *  3) GenerationType.TABLE
	 *      : 키를 생성할때 테이블이 직접 만들어서 사용하는 방법 
	 *  4) GenerationType.IDENTITY
	 *       : MS-SQL, MY-SQL를 사용할때 
	 * */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@DynamicUpdate // 변경하고자 하는 컬럼만 수정 대상으로 함
@DynamicInsert
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Increment 동작을 할 수 있도록 자동으로 값을 넣어준다
	private Long id;
	
	@Column(nullable=false, length=50, name="user_name")
	private String userName;
	
//	@Transient //이 변수는 컬럼으로 만들지 않겠다
	private int age;
	
	
	@CreationTimestamp
	private LocalDateTime insertDate;
	@UpdateTimestamp
	private LocalDateTime updateDate;
	
	@Temporal(TemporalType.DATE)
	private Date birthday;
	
}
