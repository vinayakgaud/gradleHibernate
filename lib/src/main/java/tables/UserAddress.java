package tables;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity(name = "user_address")
@Table(name = "useraddress")
public class UserAddress {
	@Id
	/**To specify the auto generation of value if not set, identity is for auto increment*/
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/**to specify column mapping, specifying name in DB*/
	@Column(name = "address_id")
	private int addressId;
	/**specifying the length for varchar as it is string*/
	@Column(name = "address_street",length = 200)
	private String addressName;
	
	@Column(name = "address_city",length = 50)
	private String addressCity;
	
	@Column(name = "is_open")
	private boolean isOpen;
	
	/**Transient mean column for this instance vairable will not be created in DB*/
	@Transient
	private double x;
	
	@Column(name = "address_date")
	/**to format the date type, as in which formate date will be stored in DB, Date only will take date no time stamp*/
	@Temporal(TemporalType.DATE)
	private Date addedDate;

	/**to specify that column should of lob(large object) type, blob or clob*/
	@Lob
	/**setting column definition as long blob to store large images*/
	@Column(name = "address_picture",columnDefinition = "longblob")
	private byte[] picture;
	
	public UserAddress(int addressId, String addressName, String addressCity, boolean isOpen, double x, Date addedDate,
			byte[] picture) {
		super();
		this.addressId = addressId;
		this.addressName = addressName;
		this.addressCity = addressCity;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.picture = picture;
	}

	public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
	
}
