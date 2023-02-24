package tables.onetomany;

import java.util.List;

import org.hibernate.cfg.AvailableSettings;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "stud_data")
public class StudData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "stud_id")
	private int studID;
	@Column(name = "stud_name")
	private String studName;
	//setting onetomany relationship with studExtend entity
	@OneToMany
	private List<StudExtend> studExtends;
	public StudData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudData(int studID, String studName, List<StudExtend> studExtends) {
		super();
		this.studID = studID;
		this.studName = studName;
		this.studExtends = studExtends;
	}
	public int getStudID() {
		return studID;
	}
	public void setStudID(int studID) {
		this.studID = studID;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public List<StudExtend> getStudExtends() {
		return studExtends;
	}
	public void setStudExtends(List<StudExtend> studExtends) {
		this.studExtends = studExtends;
	}
	
	
}
