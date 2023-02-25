package tables.manytomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Employer {
	@Id
	private int empId;
	private String empName;
	@ManyToMany
	private List<Employee> employees;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public Employer(int empId, String empName, List<Employee> employees) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.employees = employees;
	}
	public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employer [empId=" + empId + ", empName=" + empName + "]";
	}
	
}
