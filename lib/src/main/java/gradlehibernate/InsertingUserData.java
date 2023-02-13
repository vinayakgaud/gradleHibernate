package gradlehibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class InsertingUserData {

	public static void main(String[] args) {
		System.out.println("Started..");
		
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		/**constructor parameter
		int id, String name, String gender, String email,String password)*/
		CreateUserDataTable firstUserData = new CreateUserDataTable(3,"Ana de Armas","Female","anadearmas@w.com","root#3");
		/**creating second user using getters and setters*/
		CreateUserDataTable secondUserData = new CreateUserDataTable();
		secondUserData.setUserID(4);
		/**userName was not provided in earlier call mistakenly sent it as email*/
		secondUserData.setUserName("Wednesday Addams");
		secondUserData.setUserGender("Female");
		secondUserData.setUserEmail("wednesdayaddams@wed.com");
		secondUserData.setUserPassword("root#4");
		
		CreateUserDataTable thirdUserData = new CreateUserDataTable(5,"Boa Hancock","Female","boahancock@al.com","root#5");
		CreateUserDataTable fourthUserData = new CreateUserDataTable(6,"Monkey D Luffy","Male","monkeyluffy@straw.com","root#6");
		CreateUserDataTable fifthUserData = new CreateUserDataTable(7,"Roronoa Zoro","Male","roronoazoro@straw.com","root#7");
		CreateUserDataTable sixthUserData = new CreateUserDataTable(8,"Vinsmoke Sanji","Male","vinmokesanji@straw.com","root#8");
		
		/**creating array to loop through it*/
		CreateUserDataTable[] createUserDataArray = {firstUserData,secondUserData,thirdUserData,fourthUserData,fifthUserData,sixthUserData};
		
		/**we will use session factory to open new session, 
		getCurrentSession() will only work when session is already open otherwise will through error*/
		Session session = sessionFactory.openSession();
		
		/**starting a session and storing it in Transaction object to use it again*/
		Transaction transaction = session.beginTransaction();
		
		/**saving the user data object to database, save() method is depreceated*/
		/**created multiple objects and will try to loop through it and save it*/
		
		for(CreateUserDataTable user : createUserDataArray) {
			session.persist(user);
		}
		
		/**commiting the transactions*/
		transaction.commit();
		
		/**closing the session*/
		session.close();
		
		
		
	}

}
