package BT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

public class bt20 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bt20 frame = new bt20();
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
	public bt20() {
		setTitle("JTabbedPane Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400); // Kích thước như yêu cầu
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null); // sử dụng layout thủ công
		setContentPane(contentPane);

		// Tạo JTabbedPane
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.setBounds(10, 10, 460, 340); // đặt kích thước và vị trí
		contentPane.add(tabbedPane);

		// Tab Home
		JPanel homePanel = new JPanel();
		homePanel.add(new JLabel("Welcome to the Home tab!"));
		tabbedPane.addTab("Home", homePanel);

		// Tab Profile
		JPanel profilePanel = new JPanel();
		profilePanel.add(new JLabel("This is your Profile tab."));
		tabbedPane.addTab("Profile", profilePanel);

		// Tab Settings
		JPanel settingsPanel = new JPanel();
		settingsPanel.add(new JLabel("Adjust your Settings here."));
		tabbedPane.addTab("Settings", settingsPanel);
	}
}
