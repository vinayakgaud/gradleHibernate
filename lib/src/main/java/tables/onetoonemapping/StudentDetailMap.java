package tables.onetoonemapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

//class which is being mapped
@Entity
@Table(name = "student_detail_map")
public class StudentDetailMap {
	@Id
	@Column(name = "fk_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fkId;
	@Column(name = "stud_course")
	private String course;
	
	//it will not create separate column for this entity
	@OneToOne(mappedBy = "studentDetailMap")
	private StudentMap studentMap;
	public StudentDetailMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetailMap(int fkId, String course) {
		super();
		this.fkId = fkId;
		this.course = course;
	}
	public int getFkId() {
		return fkId;
	}
	public void setFkId(int fkId) {
		this.fkId = fkId;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
