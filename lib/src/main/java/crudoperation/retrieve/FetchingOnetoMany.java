package crudoperation.retrieve;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import sessionprovider.SessionFactoryProvider;
import tables.onetomany.StudData;
import tables.onetomany.StudExtend;

public class FetchingOnetoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		StudData studData = session.get(StudData.class, 1);
		System.out.println(studData.getStudID());
		System.out.println(studData.getStudName());
		List<StudExtend> list = studData.getStudExtends();
		for(StudExtend cExtend : list) {
			System.out.println(cExtend.getFkID());
			System.out.println(cExtend.getFkData());
		}		
		session.close();
		sessionFactory.close();
	}

}
