package BT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class bt24 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Color defaultColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bt24 frame = new bt24();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bt24() {
		setTitle("JCheckBox Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200); // chỉnh đúng kích thước yêu cầu

		contentPane = new JPanel();
		defaultColor = contentPane.getBackground(); // lưu màu nền mặc định
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null); // layout thủ công
		setContentPane(contentPane);

		JCheckBox checkBox = new JCheckBox("Enable Background");
		checkBox.setBounds(80, 60, 150, 30);
		contentPane.add(checkBox);

		// Sự kiện chọn checkbox
		checkBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (checkBox.isSelected()) {
					contentPane.setBackground(Color.GREEN);
				} else {
					contentPane.setBackground(defaultColor);
				}
			}
		});
	}
}
