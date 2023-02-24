package tables.onetomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud_extend")
public class StudExtend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fk_id")
	private int fkID;
	@Column(name = "fk_data")
	private String fkData;
	public StudExtend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudExtend(int fkID, String fkData) {
		super();
		this.fkID = fkID;
		this.fkData = fkData;
	}
	public int getFkID() {
		return fkID;
	}
	public void setFkID(int fkID) {
		this.fkID = fkID;
	}
	public String getFkData() {
		return fkData;
	}
	public void setFkData(String fkData) {
		this.fkData = fkData;
	}
	
}
