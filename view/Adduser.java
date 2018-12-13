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

public class Adduser extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Adduser frame = new Adduser();
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
	public Adduser() {
		setTitle("Kedai Kuih Pak Mat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegisterUser = new JLabel("Register User");
		lblRegisterUser.setForeground(Color.WHITE);
		lblRegisterUser.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegisterUser.setBounds(63, 11, 106, 42);
		contentPane.add(lblRegisterUser);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(40, 80, 76, 14);
		contentPane.add(lblUsername);
		
		username = new JTextField();
		username.setBounds(121, 78, 144, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblName = new JLabel("Name       : ");
		lblName.setForeground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblName.setBounds(40, 125, 76, 14);
		contentPane.add(lblName);
		
		name = new JTextField();
		name.setBounds(121, 123, 155, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(295, 195, 89, 23);
		contentPane.add(btnRegister);
	}
}
