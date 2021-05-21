package Entities;

import Abstract.Entity;

public class Game implements Entity{
	
	private int id;
	private String type;
	private String name;
	private double unitPrice;
	
	public Game() {
		
	}

	public Game(int id, String type, String name, double unitPrice) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
