package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
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
	public Index() {
		setTitle("Kedai Kuih Pak Mat");
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("KEDAI KUIH PAK MAT");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBackground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(127, 27, 185, 42);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("View Sales");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
		    new ViewSales().setVisible(true);	
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(62, 80, 99, 93);
		contentPane.add(btnNewButton);
		
		JButton btnAddSales = new JButton("Add Sales");
		btnAddSales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
		    new AddSales().setVisible(true);
			}
		});
		btnAddSales.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddSales.setBounds(171, 80, 99, 93);
		contentPane.add(btnAddSales);
		
		JButton btnAddKuih = new JButton("Add Kuih");
		btnAddKuih.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddKuih.setBounds(280, 80, 99, 93);
		contentPane.add(btnAddKuih);
		btnAddKuih.addActionListener(new ActionListener()
		{
	 		public void actionPerformed(ActionEvent e) {
	 		dispose();
	        new AddKuih().setVisible(true);
	        }
	        
		});
	}
}
