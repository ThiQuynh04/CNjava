package BT;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class bt7 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt7 frame = new bt7();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bt7() {
		setTitle("Resizable Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Kích thước ban đầu
		setSize(400, 300);
		setLocationRelativeTo(null); // Căn giữa màn hình

		// Giới hạn kích thước tối thiểu và tối đa
		setMinimumSize(new Dimension(200, 150));
		setMaximumSize(new Dimension(800, 600));

		contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);

		JLabel label = new JLabel("Resizable Window", JLabel.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
	}
}
