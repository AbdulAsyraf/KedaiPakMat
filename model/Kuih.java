package model;

public class Kuih extends Entity {
	private int supplierId;
	private double price;
	
	public Kuih() {
		super();
	}
	
	public Kuih(int id, String name) {
		super(id, name);
	}
	
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Name:\t" + getName());
		System.out.println("Price:\t" + getPrice());
	}
	
	
}
