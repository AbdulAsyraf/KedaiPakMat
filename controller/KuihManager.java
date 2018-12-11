package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.MysqlDatabase;
import model.Kuih;

public class KuihManager {
	public ArrayList<Kuih> selectAllKuih() throws ClassNotFoundException, SQLException{
		
		ArrayList<Kuih> kuihs = new ArrayList<Kuih>();
		
		Connection conn = MysqlDatabase.doConnection();
		String query = "SELECT id, supplierId, name, price FROM test.kuih";		
		PreparedStatement prepState = conn.prepareStatement(query);
		ResultSet rs = prepState.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			int supplierId = rs.getInt("supplierId");
			String name = rs.getString("name");
			float price = rs.getFloat("price");
			
			Kuih kuih = new Kuih();
			kuih.setId(id);
			kuih.setSupplierId(supplierId);
			kuih.setName(name);
			kuih.setPrice(price);
			
			kuihs.add(kuih);
		}
		
		conn.close();
		prepState.close();
		rs.close();
		return kuihs;
	}
}
