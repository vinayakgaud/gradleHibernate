package crudoperation.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import sessionprovider.SessionFactoryProvider;
import tables.manytoone.FirstData;
import tables.manytoone.SecondData;

public class InsertingManytoOne {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		
		FirstData firstData = new FirstData();
		firstData.setFirstName("Zoro");
		
		SecondData secondData1 = new SecondData();
		secondData1.setSecondName("Roronoa");
		secondData1.setFirstData(firstData);
		
		SecondData secondData2 = new SecondData();
		secondData2.setSecondName("Straw Hat Vice Captain");
		secondData2.setFirstData(firstData);
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.persist(firstData);
		session.persist(secondData1);
		session.persist(secondData2);
		
		transaction.commit();
		
		session.close();
		sessionFactory.close();
	}
}
