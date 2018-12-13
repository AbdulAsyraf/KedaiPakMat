package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sales extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sales frame = new Sales();
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
	public Sales() {
		setTitle("Kedai Kuih Pak Mat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 410);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSales = new JButton("SALES");
		btnSales.setBounds(26, 25, 89, 23);
		contentPane.add(btnSales);
		
		JButton btnGraph = new JButton("GRAPH");
		btnGraph.setBounds(115, 25, 89, 23);
		contentPane.add(btnGraph);
		btnGraph.addActionListener(new ActionListener()
		{
	 		public void actionPerformed(ActionEvent e) {
	 		dispose();
	        new Graph().setVisible(true);
	        }
	        
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 72, 403, 230);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnDone = new JButton("DONE");
		btnDone.setBounds(399, 320, 89, 23);
		contentPane.add(btnDone);
		btnDone.addActionListener(new ActionListener()
		{
	 		public void actionPerformed(ActionEvent e) {
	 		dispose();
	        new Index().setVisible(true);
	        }
	        
		});
	}
}
