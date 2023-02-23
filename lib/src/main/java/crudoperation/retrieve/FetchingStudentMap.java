package crudoperation.retrieve;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import sessionprovider.SessionFactoryProvider;
import tables.onetoonemapping.StudentMap;

public class FetchingStudentMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		StudentMap fetchedStudentMap = (StudentMap) session.get(StudentMap.class, 1);
		System.out.println(fetchedStudentMap.getStudentName());
		System.out.println(fetchedStudentMap.getStudentDetailMap().getCourse());
		
		StudentMap fetchedStudentMapTwo = session.get(StudentMap.class, 2);
		System.out.println(fetchedStudentMapTwo.getStudentName());
		System.out.println(fetchedStudentMapTwo.getStudentDetailMap().getCourse());
		
		session.close();
		
		sessionFactory.close();
	}

}
