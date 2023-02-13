package gradlehibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class SessionFactoryProvider {
    public static SessionFactory getSessionFactory() {
		/**creating object for session factory for hibernate
    	sessionfactory is facotry which rovides session and provides method like connection in jdbc
    	it is thread safe object
    	we create on session factory for one project
    	if cfg file is in correct path and with correct name configure will auto detect it otherwise we have ot provide path
    	we have to use object of this session factory for all the works*/
    	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	return sessionFactory;
	}
}
