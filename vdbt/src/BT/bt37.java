package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class bt37 extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt37 frame = new bt37();
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
	public bt37() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBackground(new Color(128, 255, 255));
		btnNewButton_3.setForeground(new Color(255, 128, 128));
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_9 = new JButton("reset");
		btnNewButton_9.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		getContentPane().add(btnNewButton_9, BorderLayout.SOUTH);
	}

}
