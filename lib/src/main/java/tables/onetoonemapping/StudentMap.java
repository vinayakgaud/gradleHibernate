package tables.onetoonemapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

//class which will be mapped to other class
@Entity
@Table(name = "student_map")
public class StudentMap {
	@Id
	@Column(name = "stud_id",length = 4)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentID;
	@Column(name = "stud_name",length = 50)
	private String studentName;
	//we have mappedBy attribute in OneToOne which tells that no need to create the fk for this
	//as it is already being mapped
	@OneToOne
	@JoinColumn(name = "fk_stud_detail_map")
	private StudentDetailMap studentDetailMap;
		
	public StudentMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentMap(int studentID, String studentName, StudentDetailMap studentDetailMap) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentDetailMap = studentDetailMap;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public StudentDetailMap getStudentDetailMap() {
		return studentDetailMap;
	}
	public void setStudentDetailMap(StudentDetailMap studentDetailMap) {
		this.studentDetailMap = studentDetailMap;
	}
	
	
}
