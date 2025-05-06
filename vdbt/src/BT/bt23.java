package BT;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class bt23 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bt23 frame = new bt23();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bt23() {
		setTitle("Máy tính");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400); // Kích thước theo yêu cầu
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridBagLayout());
		setContentPane(contentPane);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.insets = new Insets(5, 5, 5, 5);

		// JTextField hiển thị kết quả
		display = new JTextField();
		display.setEditable(false);
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setFont(new Font("Arial", Font.BOLD, 20));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 4;
		gbc.ipady = 20;
		contentPane.add(display, gbc);

		// Các nút của máy tính
		String[] buttons = {
			"7", "8", "9", "/",
			"4", "5", "6", "*",
			"1", "2", "3", "-",
			"0", "=", "+", ""
		};

		int row = 1;
		int col = 0;
		for (String text : buttons) {
			if (!text.isEmpty()) {
				JButton button = new JButton(text);
				button.setFont(new Font("Arial", Font.BOLD, 18));
				gbc.gridx = col;
				gbc.gridy = row;
				gbc.gridwidth = 1;
				gbc.ipady = 15;
				contentPane.add(button, gbc);
			}
			col++;
			if (col > 3) {
				col = 0;
				row++;
			}
		}
	}
}
