package tables.manytomany;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int empID;
	private String empName;
	//it will create separate table for managing mapping, we can prevent it by using mappedBy so 
	//mapping is managed by other entity and new table is not created for current entity
	@ManyToMany
	//we can also set the name for new table created using join table
	//then can name each column inside it, first column is join column
	//second is inverse join column, we can do it this way
	@JoinTable(
			name = "emp_data",
			joinColumns = {@JoinColumn(name="emp_id")},
			inverseJoinColumns = {@JoinColumn(name="emplr_id")}
	)
	private List<Employer> employers;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<Employer> getEmployers() {
		return employers;
	}
	public void setEmployers(List<Employer> employers) {
		this.employers = employers;
	}
	public Employee(int empID, String empName, List<Employer> employers) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.employers = employers;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}
	
	
}
