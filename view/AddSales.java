package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddSales extends JFrame {

	private JPanel contentPane;
	private JTextField txtDate;
	private JTextField txtKuih;
	private JTextField txtQuantityMade;
	private JTextField txtQuantitySold;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSales frame = new AddSales();
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
	public AddSales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddSales = new JLabel("ADD SALES");
		lblAddSales.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblAddSales.setForeground(Color.RED);
		lblAddSales.setBackground(Color.YELLOW);
		lblAddSales.setBounds(20, 11, 89, 25);
		contentPane.add(lblAddSales);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setForeground(Color.PINK);
		lblDate.setBounds(20, 47, 79, 25);
		contentPane.add(lblDate);
		
		JLabel lblKuih = new JLabel("KUIH");
		lblKuih.setForeground(Color.PINK);
		lblKuih.setBounds(20, 81, 79, 25);
		contentPane.add(lblKuih);
		
		JLabel lblQuantity = new JLabel("QUANTITY MADE");
		lblQuantity.setForeground(Color.PINK);
		lblQuantity.setBounds(20, 117, 95, 25);
		contentPane.add(lblQuantity);
		
		JLabel lblSold = new JLabel("QUANTITY SOLD");
		lblSold.setForeground(Color.PINK);
		lblSold.setBounds(20, 153, 95, 25);
		contentPane.add(lblSold);
		
		txtDate = new JTextField();
		txtDate.setBounds(66, 49, 136, 20);
		contentPane.add(txtDate);
		txtDate.setColumns(10);
		
		txtKuih = new JTextField();
		txtKuih.setBounds(66, 83, 136, 20);
		contentPane.add(txtKuih);
		txtKuih.setColumns(10);
		
		txtQuantityMade = new JTextField();
		txtQuantityMade.setBounds(132, 119, 142, 20);
		contentPane.add(txtQuantityMade);
		txtQuantityMade.setColumns(10);
		
		txtQuantitySold = new JTextField();
		txtQuantitySold.setBounds(132, 155, 142, 20);
		contentPane.add(txtQuantitySold);
		txtQuantitySold.setColumns(10);
		
		JComboBox comboBoxDate = new JComboBox();
		comboBoxDate.setBounds(66, 49, 152, 20);
		contentPane.add(comboBoxDate);
		
		JComboBox comboBoxKuih = new JComboBox();
		comboBoxKuih.setBounds(66, 83, 152, 20);
		contentPane.add(comboBoxKuih);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(335, 227, 89, 23);
		contentPane.add(btnCancel);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSave.setBounds(236, 227, 89, 23);
		contentPane.add(btnSave);
	}
}
