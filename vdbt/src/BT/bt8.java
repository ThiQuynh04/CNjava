package BT;

import java.awt.EventQueue;
import java.awt.Color;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class bt8 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt8 frame = new bt8();
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
	public bt8() {
		setTitle("Colored Background");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setLocationRelativeTo(null); // Căn giữa màn hình

		contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setBackground(Color.GREEN); // Đặt màu nền xanh lá

		setContentPane(contentPane);

		JLabel label = new JLabel("Colored Background", JLabel.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
	}
}
