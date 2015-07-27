package de.leifaktor.gdxrobbie.condition.number;

public class ItemNumber extends Number {
	
	private int itemID;

	public ItemNumber(int itemID) {
		super(Number.ITEM_NUMBER);
	}
	
	public int getItemID() {
		return itemID;
	}
	
}
