package com.example.Entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import ch.qos.logback.core.status.Status;

@Entity
public class Order implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3889257460219547158L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long totalPrice;
	private String created;
	private Status status;
	private String shipmentAddress;
	private String shipmentDate;
	
	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	@JoinColumn(name= "orderItem_id")
	@JsonBackReference
	
	private OrderItem orderItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getShipmentAddress() {
		return shipmentAddress;
	}

	public void setShipmentAddress(String shipmentAddress) {
		this.shipmentAddress = shipmentAddress;
	}

	public String getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}

	public OrderItem getOrderItem() {
		return orderItem;
	}

	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(created, id, orderItem, shipmentAddress, shipmentDate, status, totalPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(created, other.created) && Objects.equals(id, other.id)
				&& Objects.equals(orderItem, other.orderItem) && Objects.equals(shipmentAddress, other.shipmentAddress)
				&& Objects.equals(shipmentDate, other.shipmentDate) && Objects.equals(status, other.status)
				&& Objects.equals(totalPrice, other.totalPrice);
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", totalPrice=" + totalPrice + ", created=" + created + ", status=" + status
				+ ", shipmentAddress=" + shipmentAddress + ", shipmentDate=" + shipmentDate + ", orderItem=" + orderItem
				+ "]";
	}

	public Order(Long id, Long totalPrice, String created, Status status, String shipmentAddress, String shipmentDate,
			OrderItem orderItem) {
		super();
		this.id = id;
		this.totalPrice = totalPrice;
		this.created = created;
		this.status = status;
		this.shipmentAddress = shipmentAddress;
		this.shipmentDate = shipmentDate;
		this.orderItem = orderItem;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
