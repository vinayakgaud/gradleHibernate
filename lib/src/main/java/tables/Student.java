//embedding Certificate class

package tables;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import tables.embeddedTable.Certificate;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@Column(name = "stud_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentID;
	@Column(name = "stud_name")
	private String studentName;
	@Column(name = "stud_class")
	private String studentClass;
	@Column(name = "stud_certificate")
	//telling that this class is embedded class
	//data for certificate variables was saved without embedded annotation
	//same with embedded annotation also
	@Embedded
	private Certificate studentCertificate;
	
	public Student(int studentID, String studentName, String studentClass, Certificate studentCertificate) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentClass = studentClass;
		this.studentCertificate = studentCertificate;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public Certificate getStudentCertificate() {
		return studentCertificate;
	}

	public void setStudentCertificate(Certificate studentCertificate) {
		this.studentCertificate = studentCertificate;
	}
	
	
}
