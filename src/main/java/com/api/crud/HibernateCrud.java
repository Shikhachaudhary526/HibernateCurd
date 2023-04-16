package com.api.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.api.entity.StudentBean;

public class HibernateCrud {

	public static void main(String[] args) {
		StudentBean student = new StudentBean();

		student.setName("Pushkar");
		student.setAddress("Delhi");
		student.setAge(30);

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();

	}
}
