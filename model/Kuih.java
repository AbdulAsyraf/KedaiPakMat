package model;

public class Kuih extends Entity {
	private int supplierId;
	private float price;
	
	public Kuih() {
		super();
	}
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Name:\t" + getName());
		System.out.println("Price:\t" + getPrice());
	}
	
	
}
