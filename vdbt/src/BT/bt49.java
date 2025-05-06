package BT;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class bt49 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblSample; // Biến lblSample cho toàn class

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt49 frame = new bt49();
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
	public bt49() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200); // Kích thước 300x200
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Tạo RadioButtons
		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.setFont(new Font("Times New Roman", Font.PLAIN, 15));

		// Gộp các RadioButton vào ButtonGroup
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnRed);
		group.add(rdbtnBlue);
		group.add(rdbtnGreen);

		// Tạo JLabel Sample
		lblSample = new JLabel("Sample");
		lblSample.setFont(new Font("Times New Roman", Font.BOLD, 18));

		// Thêm ItemListener để thay đổi màu khi chọn
		rdbtnRed.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (rdbtnRed.isSelected()) {
					lblSample.setForeground(Color.RED);
				}
			}
		});

		rdbtnBlue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (rdbtnBlue.isSelected()) {
					lblSample.setForeground(Color.BLUE);
				}
			}
		});

		rdbtnGreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (rdbtnGreen.isSelected()) {
					lblSample.setForeground(Color.GREEN);
				}
			}
		});

		// Layout
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.CENTER)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.CENTER)
						.addComponent(rdbtnRed)
						.addComponent(rdbtnBlue)
						.addComponent(rdbtnGreen)
						.addComponent(lblSample))
					.addGap(10))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createSequentialGroup()
				.addGap(10)
				.addComponent(rdbtnRed)
				.addGap(5)
				.addComponent(rdbtnBlue)
				.addGap(5)
				.addComponent(rdbtnGreen)
				.addGap(10)
				.addComponent(lblSample)
		);

		contentPane.setLayout(gl_contentPane);
	}
}
