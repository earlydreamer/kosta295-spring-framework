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

//		em.persist(Customer.builder().userName("a").age(123).birthday(new Date()).build());
//		em.persist(Customer.builder().userName("b").age(13).birthday(new Date()).build());
//		em.persist(Customer.builder().userName("c").age(14).birthday(new Date()).build());
//		em.persist(Customer.builder().userName("d").age(23).birthday(new Date()).build());
//		em.persist(Customer.builder().userName("q1").birthday(new Date()).build());
//		em.persist(Customer.builder().userName("e").age(23).build());
//		em.persist(Employee.builder().name("d").age(23).build());

		// Customer cu = em.find(Customer.class, 3L);
		// System.out.println("cu="+cu);

		// Customer cu2 = em.find(Customer.class, 3L);
		// System.out.println("cu2="+cu2);

		// cu.setAge(555);
		// cu.setUserName("이름2");

		// Customer cu3 = em.find(Customer.class, 3L);
		// em.remove(cu3);

		// ------

		/**
		 * JPQL 문법을 이용해 객체 중심으로 쿼리를 작성할 수 있음 특정 DB에 종속되지 않는 것이 장점
		 */

//		//나이가 25세 이상인 정보를 검색한다고 했을때		
//		String sql = "select c from Customer c where c.age>=25";
//		//이름에 a가 들어간 정보를 검색한다고 했을때
//		String sql2 = "select c from Customer c where c.userName like '%a%'";
//		List<Customer> list = em.createQuery(sql2,Customer.class).getResultList(); //리스트로 결과를 받는다.
//		for(Customer customer : list) {
//			System.out.println(customer);
//		}

		// ---

		// 인수를 전달해 조건으로 사용하고 싶다
//		String sql3 = "select c from Customer c where c.age>=?1 or c.userName like ?2";
//		List<Customer> list = em.createQuery(sql3, Customer.class).setParameter(1, 11).setParameter(2, "%a%")
//				.getResultList();
//
//		for (Customer customer : list) {
//			System.out.println(customer);
//		}

		// ---

		int age = 12;
		String name = "%d%";
		String sql4 = "select c from Customer c where c.age>=:age or c.userName like :name";
		List<Customer> list = em.createQuery(sql4, Customer.class).setParameter("age", age).setParameter("name", name)
				.getResultList();
		for (Customer customer : list) {
			System.out.println(customer);
		}

		et.commit();
		em.close();
		emf.close();

	}

}
