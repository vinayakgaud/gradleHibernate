package crudoperation.retrieve;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import sessionprovider.SessionFactoryProvider;
import tables.manytomany.Employee;
import tables.manytomany.Employer;

public class FetchingManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee employee = session.get(Employee.class, 1);
		Employer employer = session.get(Employer.class, 1);
		
		System.out.println(employee);
		for(Employer emplr : employee.getEmployers()) {
			System.out.println("emplr for employee: "+emplr);
		}
		System.out.println(employer);
		for(Employee emp : employer.getEmployees()) {
			System.out.println("emplr for employee: "+emp);
		}
		
		session.close();
		sessionFactory.close();
	}

}
