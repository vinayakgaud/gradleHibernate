package crudoperation.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import sessionprovider.SessionFactoryProvider;
import tables.onetoonemapping.StudentDetailMap;
import tables.onetoonemapping.StudentMap;

public class InsertingDataforStudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		StudentMap studentMapOne = new StudentMap();
		studentMapOne.setStudentName("Real Me");
		
		StudentDetailMap studentDetailMapOne = new StudentDetailMap();
		studentDetailMapOne.setCourse("JAVA");
		
		studentMapOne.setStudentDetailMap(studentDetailMapOne);
		
		Transaction transaction = session.beginTransaction();
		session.persist(studentMapOne);
		session.persist(studentDetailMapOne);
		transaction.commit();
		
		System.out.println("data saved");
		session.close();
		
		sessionFactory.close();
	}

}
