package BT;

import java.awt.EventQueue;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bt9 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt9 frame = new bt9();
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
	public bt9() {
		setTitle("Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());

		JButton btnOpenDialog = new JButton("Open Dialog");
		btnOpenDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Mở JDialog khi nhấn nút
				openDialog();
			}
		});
		contentPane.add(btnOpenDialog, BorderLayout.CENTER);
	}

	// Phương thức mở JDialog
	private void openDialog() {
		JDialog dialog = new JDialog(this, "Dialog Window", true); // true để cửa sổ chính không thể thao tác khi JDialog mở
		dialog.setSize(200, 150); // Kích thước của JDialog
		dialog.setLocationRelativeTo(this); // Căn giữa với cửa sổ chính

		// Thêm JLabel vào JDialog
		JLabel label = new JLabel("This is a dialog", JLabel.CENTER);
		dialog.add(label);

		dialog.setVisible(true); // Hiển thị JDialog
	}
}
