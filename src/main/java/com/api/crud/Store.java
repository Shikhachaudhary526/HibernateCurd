package com.api.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.api.entity.AddressEntity;
import com.api.entity.EmployeeEntity;

public class Store {

	public static void main(String[] args) {
		
		EmployeeEntity employee = new EmployeeEntity();
		employee.setName("Shikha");
		employee.setEmail("shikha@gmail.com");
		
		AddressEntity  address = new AddressEntity();
		address.setCountry("India");
		address.setState("Ambedkar nagar");
		address.setCity("Akbarpur");
		
		employee.setAccount(address);
		address.setEmployee(employee);
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.persist(employee);
		session.getTransaction().commit();
		session.close();
	}

}
