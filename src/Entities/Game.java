package Entities;

import Abstract.Entity;

public class Game implements Entity {
	private int id;
	private double gamePrice;
	private String gameType;
	private String gameName;
	
	public Game(int id, double gamePrice, String gameType, String gameName) {
		super();
		this.id = id;
		this.gamePrice = gamePrice;
		this.gameType = gameType;
		this.gameName = gameName;
	}
	
	public Game() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
}
