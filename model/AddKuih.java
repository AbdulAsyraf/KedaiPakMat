package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import database.MysqlDatabase;

public class AddKuih {
	
	public Kuih getDetails(String name, int supplierId, double price) {
		Kuih kuih = new Kuih(0, name);
		kuih.setSupplierId(supplierId);
		return kuih;
	}
	
	public void masukDb(Kuih kuih) throws ClassNotFoundException, SQLException {
		Connection conn = MysqlDatabase.doConnection();
		String query = "INSERT into test.kuih (name, supplierId, price) values (?, ?, ?)";
		PreparedStatement prepState = conn.prepareStatement(query);
		prepState.setString(1, kuih.getName());
		prepState.setInt(2, kuih.getSupplierId());
		prepState.setDouble(3, kuih.getPrice());
		
		if (prepState.execute()) {
			System.out.println("Successfully added kuih into database");
		}
		else {
			System.out.println("Something went wrong");
		}
			
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AddKuih addKuih = new AddKuih();
		addKuih.masukDb(addKuih.getDetails("donut", 1, 0.50));
		
	}
}
