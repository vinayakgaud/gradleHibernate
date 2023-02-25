package crudoperation.insert;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import sessionprovider.SessionFactoryProvider;
import tables.manytomany.Employee;
import tables.manytomany.Employer;

public class InsertingManytoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.setEmpID(1);
		emp1.setEmpName("J");
		emp2.setEmpID(2);
		emp2.setEmpName("A");
		
		Employer emplr1 = new Employer();
		Employer emplr2 = new Employer();
		emplr1.setEmpId(1);
		emplr1.setEmpName("S");
		emplr2.setEmpId(2);
		emplr2.setEmpName("T");
		
		List<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		List<Employer> emplrList = new ArrayList<>();
		emplrList.add(emplr1);
		emplrList.add(emplr2);
		
		emp1.setEmployers(emplrList);
		emplr1.setEmployees(empList);
		
		Transaction transaction = session.beginTransaction();
		session.persist(emp1);
		session.persist(emp2);
		session.persist(emplr1);
		session.persist(emplr2);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
