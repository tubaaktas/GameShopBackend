package Entities;

import Abstract.Entity;

public class Sale implements Entity {
	int id;
	int numberOfGameinBasket;

	public Sale(int id, int numberOfGameinBasket) {
		super();
		this.id = id;
		this.numberOfGameinBasket = numberOfGameinBasket;
	}

	public Sale() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfGameinBasket() {
		return numberOfGameinBasket;
	}

	public void setNumberOfGameinBasket(int numberOfGameinBasket) {
		this.numberOfGameinBasket = numberOfGameinBasket;
	}

}
