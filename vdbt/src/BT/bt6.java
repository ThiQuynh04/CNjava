package BT;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class bt6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt6 frame = new bt6();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bt6() {
		setTitle("Custom Icon Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null); // Căn giữa màn hình

		// Đặt biểu tượng cửa sổ (logo.png cần nằm cùng thư mục hoặc đường dẫn hợp lệ)
		ImageIcon icon = new ImageIcon("logo.png");
		setIconImage(icon.getImage());

		contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);

		JLabel label = new JLabel("Custom Icon Window", JLabel.CENTER);
		contentPane.add(label, BorderLayout.CENTER);
	}
}
