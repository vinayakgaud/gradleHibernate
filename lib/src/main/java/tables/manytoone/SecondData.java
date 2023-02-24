package tables.manytoone;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "second")
public class SecondData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "second_id")
	private int secondID;
	@Column(name = "second_name")
	private String secondName;
	@ManyToOne
	private FirstData firstData;
	public SecondData(int secondID, String secondName, FirstData firstData) {
		super();
		this.secondID = secondID;
		this.secondName = secondName;
		this.firstData = firstData;
	}
	public SecondData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSecondID() {
		return secondID;
	}
	public void setSecondID(int secondID) {
		this.secondID = secondID;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public FirstData getFirstData() {
		return firstData;
	}
	public void setFirstData(FirstData firstData) {
		this.firstData = firstData;
	}
	
	
}
