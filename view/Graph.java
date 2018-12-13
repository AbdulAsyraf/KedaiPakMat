package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class Graph extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Graph frame = new Graph();
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
	public Graph() {
		setTitle("Graph");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 410);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSales = new JButton("SALES");
		btnSales.setBounds(36, 21, 89, 23);
		contentPane.add(btnSales);
		btnSales.addActionListener(new ActionListener()
		{
	 		public void actionPerformed(ActionEvent e) {
	 		dispose();
	        new Sales().setVisible(true);
	        }
	        
		});
		JButton btnGraph = new JButton("GRAPH");
		btnGraph.setBounds(126, 21, 89, 23);
		contentPane.add(btnGraph);
		
		JButton btnDone = new JButton("DONE");
		btnDone.setBounds(392, 323, 89, 23);
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
