package com.example.Entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Customer implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2240902004675110886L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String fullname,email;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL )
	@JoinColumn(name="order_id")
	@JsonManagedReference
	private List<Order> order;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, fullname, id, order);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(email, other.email) && Objects.equals(fullname, other.fullname)
				&& Objects.equals(id, other.id) && Objects.equals(order, other.order);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fullname=" + fullname + ", email=" + email + ", order=" + order + "]";
	}

	public Customer(Long id, String fullname, String email, List<Order> order) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.email = email;
		this.order = order;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	


}
