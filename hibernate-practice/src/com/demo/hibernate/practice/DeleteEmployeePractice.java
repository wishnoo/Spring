package com.demo.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.practice.entity.Employee;

public class DeleteEmployeePractice {
	
	public static void main (String args[]) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			// initialize id
			int employeeId = 1;
			
			// start transaction
			session.beginTransaction();
			
			// query to delte the object
			session.createQuery("delete from Employee where id =" + employeeId)
						.executeUpdate();
			
			System.out.println("query executed");
			
			System.out.println(session.createQuery("from Employee").getResultList());
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			
		
		}
		finally {
			
			factory.close();
		}
	}
	
}
