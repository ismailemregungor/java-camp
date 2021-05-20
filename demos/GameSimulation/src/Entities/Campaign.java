package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
	
	private int id;
	private String name;
	private int discountAmount;
	private boolean status;
	
	public Campaign() {
		
	}

	public Campaign(int id, String name, int discountAmount, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.discountAmount = discountAmount;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
