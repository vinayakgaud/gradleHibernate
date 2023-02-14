package crudoperation.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import sessionprovider.SessionFactoryProvider;
import tables.UserData;


public class InsertingUserData {

	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		/**constructor parameter
		int id, String name, String gender, String email,String password)*/
		UserData firstUserData = new UserData(3,"Ana de Armas","Female","anadearmas@w.com","root#3");
		/**creating second user using getters and setters*/
		UserData secondUserData = new UserData();
		secondUserData.setUserID(4);
		/**userName was not provided in earlier call mistakenly sent it as email*/
		secondUserData.setUserName("Wednesday Addams");
		secondUserData.setUserGender("Female");
		secondUserData.setUserEmail("wednesdayaddams@wed.com");
		secondUserData.setUserPassword("root#4");
		
		UserData thirdUserData = new UserData(5,"Boa Hancock","Female","boahancock@al.com","root#5");
		UserData fourthUserData = new UserData(6,"Monkey D Luffy","Male","monkeyluffy@straw.com","root#6");
		UserData fifthUserData = new UserData(7,"Roronoa Zoro","Male","roronoazoro@straw.com","root#7");
		UserData sixthUserData = new UserData(8,"Vinsmoke Sanji","Male","vinmokesanji@straw.com","root#8");
		
		/**creating array to loop through it*/
		UserData[] createUserDataArray = {firstUserData,secondUserData,thirdUserData,fourthUserData,fifthUserData,sixthUserData};
		
		/**we will use session factory to open new session, 
		getCurrentSession() will only work when session is already open otherwise will through error*/
		Session session = sessionFactory.openSession();
		
		/**starting a session and storing it in Transaction object to use it again*/
		Transaction transaction = session.beginTransaction();
		
		/**saving the user data object to database, save() method is depreceated*/
		/**created multiple objects and will try to loop through it and save it*/
		
		for(UserData user : createUserDataArray) {
			session.persist(user);
		}
		
		/**commiting the transactions*/
		transaction.commit();
		
		/**closing the session*/
		session.close();
		
		
		
	}

}
