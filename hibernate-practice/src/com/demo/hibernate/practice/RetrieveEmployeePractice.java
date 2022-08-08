package com.demo.hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.practice.entity.Employee;

public class RetrieveEmployeePractice {
	
	public static void main (String args[]) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			
			// create new object
			Employee newEmployee = new Employee("Neha","Jadhav","Morgan");
			
			System.out.println("New object created: " + newEmployee);
			
			// start transaction
			session.beginTransaction();
			
			// save the object
			session.save(newEmployee);
			
			System.out.println("Object saved");
			
			// commit the transaction
			session.getTransaction().commit();
			
			// retrieve new session
			session = factory.getCurrentSession();
			
			// start transaction
			session.beginTransaction();
			
			// Retrieve the object
			Employee emp = session.get(Employee.class, newEmployee.getId());
			
			System.out.println("Retrieved employee: " + emp);
			
			session.getTransaction().commit();
			
			System.out.println("Done");
			
		
		}
		finally {
			
			factory.close();
		}
	}
}
