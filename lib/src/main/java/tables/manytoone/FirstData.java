package tables.manytoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "first")
public class FirstData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "first_id")
	private int firstID;
	@Column(name = "first_name")
	private String firstName;
	public FirstData(int firstID, String firstName) {
		super();
		this.firstID = firstID;
		this.firstName = firstName;
	}
	public FirstData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFirstID() {
		return firstID;
	}
	public void setFirstID(int firstID) {
		this.firstID = firstID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}
