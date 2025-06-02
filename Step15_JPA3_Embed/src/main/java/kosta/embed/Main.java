package kosta.embed;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import kosta.embed.domain.Address;
import kosta.embed.domain.ContactInfo;
import kosta.embed.domain.Member;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAProject");

		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();

		// 회원등록
		em.persist(Member.builder().name("name")
				.contactinfo(ContactInfo.builder().mobilePhone("123").housePhone("456").companyPhone("789").build())
				.build());

		//취미가 추가된
		em.persist(Member.builder().name("name2")
				.hobby(List.of("취미1","취미2","취미3","취미4"))
				.contactinfo(ContactInfo.builder().mobilePhone("122").housePhone("436").companyPhone("780").build())
				.build());

		//주소가 추가된
		
		Address addr = Address.builder().zipcode("1234").state("ad").city("df").addr("ccc").build();
		Address add2 = Address.builder().zipcode("2234").state("ag").city("ds").addr("cdf").build();
		Address add3 = Address.builder().zipcode("3234").state("ae").city("ge").addr("czz").build();
		
		List<Address> addrList = new ArrayList<Address>();
		addrList.add(addr);
		addrList.add(add2);
		addrList.add(add3);
		
		em.persist(Member.builder().name("name3")
				.addressHistory(addrList)
				.hobby(List.of("취미1","취미2","취미3","취미4"))
				.contactinfo(ContactInfo.builder().mobilePhone("122").housePhone("436").companyPhone("780").build())
				.build());

//		Member m = em.find(Member.class,1L);
//		Member m = em.find(Member.class,2L);
		Member m = em.find(Member.class,3L);
		System.out.println("---");
		System.out.println(m);
		System.out.println(m.getAddressHistory());
		m.getContactinfo().setCompanyPhone("1203981");
		List<Address> addressList = m.getAddressHistory();
		addressList.add(Address.builder().zipcode("12345").state("ㅁㄴㅇㄹ").city("city").addr("asdfa").build());
		System.out.println("---");
		
		em.remove(m); //find로 찾은 m을 삭제 (자식까지 같이 삭제된다)
		
		et.commit();
		em.close();
		emf.close();

	}

}
