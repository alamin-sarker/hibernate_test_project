package com.sarker.hierarchy;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreData {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("Tamim khan");

		Regular_Employee e2 = new Regular_Employee();
		e2.setName("Al Amin");
		e2.setSalary(50000);
		e2.setBonus(5);

		Contract_Employee e3 = new Contract_Employee();
		e3.setName("M Sarker");
		e3.setPay_per_hour(1000);
		e3.setContract_duration("15 hours");

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		t.commit();
		session.close();
		System.out.println("success");
	}

}
