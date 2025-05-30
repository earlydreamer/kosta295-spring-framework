package kosta.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

//		//Team 등록
//		Team t1 =Team.builder().teamName("Team1").build();
//		Team t2 =Team.builder().teamName("Team2").build();
//		Team t3 =Team.builder().teamName("Team3").build();
//		
//		em.persist(t1);
//		em.persist(t2);
//		em.persist(t3);
//		
//		//팀에 소속되는 Member 생성
//		em.persist(Member.builder().memberName("member1").team(t1).age(25).build());
//		em.persist(Member.builder().memberName("member2").team(t3).age(21).build());
//		em.persist(Member.builder().memberName("member3").team(t2).age(33).build());
//		em.persist(Member.builder().memberName("member4").team(t2).age(24).build());
//		em.persist(Member.builder().memberName("member5").team(t3).age(23).build());
//		em.persist(Member.builder().memberName("member6").team(t1).age(21).build());
//		em.persist(Member.builder().memberName("member7").team(t3).age(25).build());

		// member 조회

//		Member member = em.find(Member.class, 2L);
//		System.out.println(member);
//		
//		Team team = member.getTeam();
//		System.out.println(team);
//		

		// ---

		// team1에 소속된 member 정보를 team 정보와 함께 조회하고 싶다
		//

//		Team team = em.find(Team.class, 1L);
//		System.out.println(team);

		//삭제		
		Member m = em.find(Member.class,2L);
		em.remove(m);
		//자식을 삭제할땐 별 문제가 안된다
		
//		Team t = em.find(Team.class,1L);
//		em.remove(t);	
//		//FK로 묶여있기 때문에... 삭제가 안된다
		/**
			 * cascade는  Entity 의 상태변화가 생기면 연관관계 있는 Entity도 상태변화를 전이시키는 옵션
			 *	CascadeType.ALL: 모든 CascadeType을 적용
			 *	CascadeType.PERSIST: 부모 엔티티를 저장할 때 연관된 자식 엔티티도 함께 저장
			 * 	CascadeType.MERGE: 부모 엔티티를 병합할 때 연관된 자식 엔티티도 함께 병합
			 * 	CascadeType.REMOVE: 부모 엔티티를 삭제할 때 연관된 자식 엔티티도 함께 삭제
			 * 	CascadeType.REFRESH: 부모 엔티티를 새로 고칠 때 연관된 자식 엔티티도 함께 새로 고침
			 * 	CascadeType.DETACH: 부모 엔티티를 분리할 때 연관된 자식 엔티티도 함께 분리
			 * */
		
		
		
		
		
		et.commit();
		em.close();
		emf.close();

	}

}
