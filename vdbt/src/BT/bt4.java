package BT;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class bt4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt4 frame = new bt4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bt4() {
		setTitle("Image Viewer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Đường dẫn đến ảnh (đảm bảo file này có thật)
		JLabel imageLabel = new JLabel(new ImageIcon("C:\\Users\\Admin\\Pictures\\Saved Pictures\\2500-1-.jpg"));
		contentPane.add(imageLabel, BorderLayout.CENTER);

		pack(); // Tự động điều chỉnh kích thước cửa sổ theo kích thước hình ảnh
		setLocationRelativeTo(null); // Căn giữa màn hình
	}
}
