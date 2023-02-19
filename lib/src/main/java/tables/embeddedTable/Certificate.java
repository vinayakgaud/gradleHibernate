//is embedded by Student Class

package tables.embeddedTable;

import jakarta.persistence.Embeddable;

//tell that this class is embeddable class so the class owning this class will have this class's variables and no need to create new table of it in DB
@Embeddable
public class Certificate {
	private int certificateID;
	private String certificateCode;
	private char certificateGrade;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Certificate(int certificateID, String certificateCode, char certificateGrade) {
		super();
		this.certificateID = certificateID;
		this.certificateCode = certificateCode;
		this.certificateGrade = certificateGrade;
	}
	
	public int getCertificateID() {
		return certificateID;
	}
	public void setCertificateID(int certificateID) {
		this.certificateID = certificateID;
	}
	public String getCertificateCode() {
		return certificateCode;
	}
	public void setCertificateCode(String certificateCode) {
		this.certificateCode = certificateCode;
	}
	public char getCertificateGrade() {
		return certificateGrade;
	}
	public void setCertificateGrade(char certificateGrade) {
		this.certificateGrade = certificateGrade;
	}
	
	
}
