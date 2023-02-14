package tables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "userData") 
/**annotation to tell hibernate that this class can save or fetch data from database
if we don't mention name in entity it will use default class name eg. 'CreateUserDataTable' in this case */

@Table(name = "userdata") /**annotation to set the table name in database */

public class UserData {
	@Id /**to set any column as primary key */
	private int userID;
	private String userName;
	private String userGender;
	private String userEmail;
	private String userPassword;
	
	public UserData() {
		super();
	}
	
	public UserData(int id, String name, String gender, String email,String password) {
		this.userID = id;
		this.userName = name;
		this.userGender = gender;
		this.userEmail = email;
		this.userPassword = password;
	}
	
	/**getters and setters*/
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
