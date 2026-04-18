package model;

public class Item {
	/*  Attributes  */
	private String name;
	private int count;
	private double price;
	
	
	/*  Constructor  */
	public Item(String name, int count, double orice) {
		this.name = name;
		this.count = count;
		this.price = price;
	}
	
	
	/*  Getter Methods */
	public String getName() {
		return name;
	}
	public int getCount() {
		return count;
	}
	public double getPrice() {
		return price;
	}
	
}
