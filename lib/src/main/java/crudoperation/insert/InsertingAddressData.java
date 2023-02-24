package crudoperation.insert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.swing.JFileChooser;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import sessionprovider.SessionFactoryProvider;
import tables.UserAddress;

public class InsertingAddressData {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		
		UserAddress firstAddress = new UserAddress();
		firstAddress.setAddressName("sobo");
		firstAddress.setAddressCity("south bo");
		firstAddress.setOpen(true);
		firstAddress.setAddedDate(new Date());
		firstAddress.setX(22.22);
		
		/**Reading image, using jfilechoose(file picker) to select file on runtime*/
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.showOpenDialog(null);
		File file = fileChooser.getSelectedFile();
		
		try (FileInputStream fis = new FileInputStream(file)) {
			/**creating the new image data array*/
			byte[] data = new byte[fis.available()];
			/**storing value of image in byte*/
			fis.read(data);
			/**storing byte[] in DB as image*/
			firstAddress.setPicture(data);
		}
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();		
		session.persist(firstAddress);		
		transaction.commit();
		session.close();
		
		sessionFactory.close();
	}

}
