package com.demo.hibernate.practice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.practice.entity.Employee;

public class QueryEmployeePractice {
	
	public static void main (String args[]) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			// Create list to store the result
			List<Employee> result = new ArrayList<>();
			
			// start transaction
			session.beginTransaction();
			
			// query the database
			result = session.createQuery("from Employee where company = 'Marlabs'")
						.getResultList();
			
			System.out.println("List saved");
			System.out.println("List: " + result);
			
			// commit the transaction
			session.getTransaction().commit();
			
			System.out.println("Done");
			
		
		}
		finally {
			
			factory.close();
		}
	}
	
}
