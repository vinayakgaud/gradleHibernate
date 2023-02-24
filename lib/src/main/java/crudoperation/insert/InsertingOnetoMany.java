package crudoperation.insert;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import sessionprovider.SessionFactoryProvider;
import tables.onetomany.StudData;
import tables.onetomany.StudExtend;

public class InsertingOnetoMany {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		Session session = sessionFactory.openSession();
		StudData studData = new StudData();
		studData.setStudName("WW");
		
		StudExtend studExtend1 = new StudExtend();
		studExtend1.setFkData("win win");
		
		StudExtend studExtend2 = new StudExtend();
		studExtend2.setFkData("winner winner");
		
		List<StudExtend> studExtends = new ArrayList<>();
		studExtends.add(studExtend1);
		studExtends.add(studExtend2);
		
		studData.setStudExtends(studExtends);
		Transaction transaction = session.beginTransaction();
		
		session.persist(studData);
		for(StudExtend c : studExtends) {
			session.persist(c);
		}
		
		
		transaction.commit();
		
		System.out.println("data added succesfully");
		session.close();
		sessionFactory.close();
	}
}
