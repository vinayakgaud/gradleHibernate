package crudoperation.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sessionprovider.SessionFactoryProvider;
import tables.Student;
import tables.embeddedTable.Certificate;

public class InsertingStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		
		Student studentOne = new Student();
		studentOne.setStudentName("Liam Payne");
		studentOne.setStudentClass("1A");
		
		Certificate certificateOne = new Certificate();
		certificateOne.setCertificateID(1101);
		certificateOne.setCertificateCode("A001");
		certificateOne.setCertificateGrade('A');
		
		studentOne.setStudentCertificate(certificateOne);
		
		Student studentTwo = new Student();
		studentTwo.setStudentName("Chris Heria");
		studentTwo.setStudentClass("1A");
		
		Certificate certificateTwo = new Certificate();
		certificateTwo.setCertificateID(1102);
		certificateTwo.setCertificateCode("A002");
		certificateTwo.setCertificateGrade('A');
		
		studentTwo.setStudentCertificate(certificateTwo);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.persist(studentOne);
		session.persist(studentTwo);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
