package com.example.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OrderItem implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 820693857010513094L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String product;
	private Long quantity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, product, quantity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id) && Objects.equals(product, other.product)
				&& Objects.equals(quantity, other.quantity);
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", product=" + product + ", quantity=" + quantity + "]";
	}
	public OrderItem(Long id, String product, Long quantity) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
	}
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
