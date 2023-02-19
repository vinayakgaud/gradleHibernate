package crudoperation.retrieve;

import org.hibernate.SessionFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.hibernate.Session;
import sessionprovider.SessionFactoryProvider;
import tables.UserAddress;


public class FetchingAddressData {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		SessionFactory sessionfactory = SessionFactoryProvider.getSessionFactory();
		Session session = sessionfactory.openSession();
		
		UserAddress userAddress = (UserAddress) session.get(UserAddress.class, 2);
		/**UserAddress userAddress = (UserAddress) session.load(UserAddress.class, 1);
		we can use loan also but it is deprecated */
		System.out.println("Fetched data");
		System.out.println(userAddress.getAddressId()); 
		System.out.println(userAddress.getAddressCity());
		System.out.println(userAddress.getAddressName());
		System.out.println(userAddress.getAddedDate());
		System.out.println(userAddress.isOpen());
		FileOutputStream fos = new FileOutputStream("G:\\JAVA_Projects\\Full Stack Projects\\gradleHibernate\\lib\\src\\main\\java\\images\\fetchedImage\\fetchedImage#"+userAddress.getAddressId()+".png");
		fos.write(userAddress.getPicture());
		fos.close();
		System.out.println("image saved");
		session.close();
		sessionfactory.close();
	}

}
