package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddKuih extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddKuih frame = new AddKuih();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddKuih() {
		setTitle("Kedai Kuih Pak Mat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddKuih = new JLabel("Add Kuih");
		lblAddKuih.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAddKuih.setForeground(Color.WHITE);
		lblAddKuih.setBounds(57, 21, 123, 43);
		contentPane.add(lblAddKuih);
		
		JLabel lblKuihName = new JLabel("Kuih Name  :");
		lblKuihName.setForeground(Color.WHITE);
		lblKuihName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblKuihName.setBounds(51, 75, 90, 32);
		contentPane.add(lblKuihName);
		
		textField = new JTextField();
		textField.setBounds(129, 82, 179, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblSupplierId = new JLabel("Supplier Id :");
		lblSupplierId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSupplierId.setForeground(Color.WHITE);
		lblSupplierId.setBounds(51, 118, 90, 20);
		contentPane.add(lblSupplierId);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 119, 179, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price         :");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrice.setForeground(Color.WHITE);
		lblPrice.setBounds(51, 160, 78, 14);
		contentPane.add(lblPrice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(129, 158, 179, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(309, 208, 89, 23);
		contentPane.add(btnAdd);
	}
}
