package com.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Employee;

public class Client {

	public static void main(String[] args) {
      
		Employee e= new Employee(3, "Ansh", 22, "Male" , 45784);
		
	// 	Configuration cfg = new Configuration().configure();
		SessionFactory sf =  new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
//		session.save(e);
//		tx.commit();

		Employee employee = session.load(Employee.class, 2);
		System.out.println( employee);
		System.out.println("Transaction done..........");
	}

}
