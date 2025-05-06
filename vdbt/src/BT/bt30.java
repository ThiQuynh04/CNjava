package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class bt30 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt30 frame = new bt30();
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
	public bt30() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNew = new JButton("new");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSave = new JButton("save");
		
		JButton btnNewButton_2 = new JButton("open");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(108)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_2)
						.addComponent(btnSave)
						.addComponent(btnNew))
					.addContainerGap(263, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(btnNew)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSave)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_2)
					.addContainerGap(152, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		btnNew.addActionListener(e -> JOptionPane.showMessageDialog(this, "New button clicked!"));
		btnSave.addActionListener(e -> JOptionPane.showMessageDialog(this, "Save button clicked!"));
		btnNewButton_2.addActionListener(e -> JOptionPane.showMessageDialog(this, "Open button clicked!"));
	
	}
		
		
		
	}


