package model;

public class User extends Entity {
	public void display() {
		System.out.println("ID:\t" + getId());
		System.out.println("Name:\t" + getName());
	}
}
