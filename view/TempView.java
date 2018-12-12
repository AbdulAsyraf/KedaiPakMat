package view;

import java.sql.SQLException;

import controller.KuihManager;
import model.Kuih;

public class TempView {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		KuihManager semuaKuih = new KuihManager();
		for (Kuih k: semuaKuih.selectAllKuih()) {
			System.out.println("\nName:\t"+ k.getName());//This goes in the table panel thing
			System.out.println("Price:\t"+ k.getPrice());
		}
	}
}
