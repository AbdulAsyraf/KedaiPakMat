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

public class Addsupp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addsupp frame = new Addsupp();
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
	public Addsupp() {
		setTitle("Kedai Kuih Pak Mat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegisterSupplier = new JLabel("Register Supplier");
		lblRegisterSupplier.setForeground(Color.WHITE);
		lblRegisterSupplier.setBackground(Color.WHITE);
		lblRegisterSupplier.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegisterSupplier.setBounds(48, 22, 167, 43);
		contentPane.add(lblRegisterSupplier);
		
		JLabel lblName = new JLabel("Name      :");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblName.setBounds(29, 86, 82, 32);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(129, 94, 198, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBounds(297, 198, 89, 23);
		contentPane.add(btnAdd);
	}
}
