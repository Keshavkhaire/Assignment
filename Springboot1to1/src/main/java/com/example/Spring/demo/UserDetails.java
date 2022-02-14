package com.example.Spring.demo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name="USER_TABLE")
@Entity
public class UserDetails implements Serializable
{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6988866033596776239L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long userID;
	private String userName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public long getUserID() {
		return userID;
	}

	public void setUserID(long userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, userID, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserDetails other = (UserDetails) obj;
		return Objects.equals(address, other.address) && userID == other.userID
				&& Objects.equals(userName, other.userName);
	}

	@Override
	public String toString() {
		return "UserDetails [userID=" + userID + ", userName=" + userName + ", address=" + address + "]";
	}

	public UserDetails(long userID, String userName, Address address) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.address = address;
	}

	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
