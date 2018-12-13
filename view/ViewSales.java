package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class ViewSales extends JFrame {

	private JPanel contentPane;
	private JTextField txtfieldKuihName;
	private JTextField txtfieldByMonth;
	private JTextField txtfieldByYear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewSales frame = new ViewSales();
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
	public ViewSales() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 64, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblViewSales = new JLabel("VIEW SALES");
		lblViewSales.setForeground(Color.RED);
		lblViewSales.setBackground(Color.BLACK);
		lblViewSales.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblViewSales.setBounds(20, 11, 125, 31);
		contentPane.add(lblViewSales);
		
		JLabel lblKuihName = new JLabel("KUIH NAME *");
		lblKuihName.setForeground(Color.PINK);
		lblKuihName.setBounds(20, 53, 94, 31);
		contentPane.add(lblKuihName);
		
		JLabel lblByMonth = new JLabel("BY MONTH *");
		lblByMonth.setForeground(Color.PINK);
		lblByMonth.setBounds(20, 95, 94, 31);
		contentPane.add(lblByMonth);
		
		JLabel lblByYear = new JLabel("BY YEAR *");
		lblByYear.setForeground(Color.PINK);
		lblByYear.setBounds(20, 127, 94, 31);
		contentPane.add(lblByYear);
		
		txtfieldKuihName = new JTextField();
		txtfieldKuihName.setBounds(93, 58, 131, 20);
		contentPane.add(txtfieldKuihName);
		txtfieldKuihName.setColumns(10);
		
		txtfieldByMonth = new JTextField();
		txtfieldByMonth.setColumns(10);
		txtfieldByMonth.setBounds(93, 100, 131, 20);
		contentPane.add(txtfieldByMonth);
		
		txtfieldByYear = new JTextField();
		txtfieldByYear.setColumns(10);
		txtfieldByYear.setBounds(93, 132, 131, 20);
		contentPane.add(txtfieldByYear);
		
		JComboBox comboBoxKuihName = new JComboBox();
		comboBoxKuihName.setBounds(93, 58, 148, 20);
		contentPane.add(comboBoxKuihName);
		
		JComboBox comboBoxByMonth = new JComboBox();
		comboBoxByMonth.setBounds(93, 100, 148, 20);
		contentPane.add(comboBoxByMonth);
		
		JComboBox comboBoxByYear = new JComboBox();
		comboBoxByYear.setBounds(93, 132, 148, 20);
		contentPane.add(comboBoxByYear);
		
		JButton btnGo = new JButton("Go");
		btnGo.setBounds(179, 227, 75, 23);
		contentPane.add(btnGo);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(349, 227, 75, 23);
		contentPane.add(btnReset);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(264, 227, 75, 23);
		contentPane.add(btnBack);
	}

}
