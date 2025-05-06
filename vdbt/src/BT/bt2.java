package BT;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

public class bt2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt2 frame = new bt2();
					int result = JOptionPane.showConfirmDialog(
						frame,
						"Welcome to Java Swing",
						"Welcome",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE
					);
					
					if (result == JOptionPane.OK_OPTION || result == JOptionPane.CLOSED_OPTION) {
						System.exit(0);
					}

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bt2() {
		setTitle("Welcome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
	}
}
