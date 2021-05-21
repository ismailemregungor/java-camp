package Entities;

import Abstract.Entity;

public class Store implements Entity{
	
	private int id;
	private int itemId;
	
	
	public Store() {
		
	}


	public Store(int id, int itemId) {
		super();
		this.id = id;
		this.itemId = itemId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	
	
}
