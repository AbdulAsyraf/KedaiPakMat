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
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextPane txtpnUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Kedai Kuih Pak Mat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKedaiKuihPak = new JLabel("KEDAI KUIH PAK MAT");
		lblKedaiKuihPak.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblKedaiKuihPak.setForeground(Color.WHITE);
		lblKedaiKuihPak.setBounds(118, 39, 185, 14);
		contentPane.add(lblKedaiKuihPak);
		
		username = new JTextField();
		username.setBounds(195, 104, 133, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		txtpnUsername = new JTextPane();
		txtpnUsername.setBackground(Color.DARK_GRAY);
		txtpnUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtpnUsername.setForeground(Color.WHITE);
		txtpnUsername.setText("Username    :");
		txtpnUsername.setBounds(71, 104, 102, 20);
		contentPane.add(txtpnUsername);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.setBounds(118, 186, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
		        new Adduser().setVisible(true);
			}
		});
		btnRegister.setBounds(225, 186, 89, 23);
		contentPane.add(btnRegister);
	}
}
