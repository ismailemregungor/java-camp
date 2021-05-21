package Entities;

import Abstract.Entity;

public class Billing implements Entity {

	private int id;
	private int orderId;
	private int paymentAmount;
	private String paymentCardNo;
	private String address;

	public Billing() {

	}

	public Billing(int id, int orderId, int paymentAmount, String paymentCardNo, String address) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.paymentAmount = paymentAmount;
		this.paymentCardNo = paymentCardNo;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getPaymentCardNo() {
		return paymentCardNo;
	}

	public void setPaymentCardNo(String paymentCardNo) {
		this.paymentCardNo = paymentCardNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
