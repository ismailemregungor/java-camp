package Entities;

import Abstract.Entity;

public class Order implements Entity{

	private int id;
	private int gameId;
	private int gamerId;
	private int campaignId;
	private String date;
	
	public Order() {
		
	}

	public Order(int id, int gameId, int gamerId, int campaignId, String date) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.gamerId = gamerId;
		this.campaignId = campaignId;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
