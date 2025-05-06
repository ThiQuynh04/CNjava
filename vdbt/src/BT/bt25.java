package BT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class bt25 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				bt25 frame = new bt25();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bt25() {
		setTitle("Giới tính");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200); // kích thước đúng yêu cầu

		contentPane = new JPanel();
		contentPane.setLayout(null); // dùng layout thủ công
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Tạo các JRadioButton
		JRadioButton maleButton = new JRadioButton("Male");
		maleButton.setBounds(50, 30, 80, 25);
		contentPane.add(maleButton);

		JRadioButton femaleButton = new JRadioButton("Female");
		femaleButton.setBounds(150, 30, 80, 25);
		contentPane.add(femaleButton);

		// Nhóm lại để chỉ chọn 1
		ButtonGroup group = new ButtonGroup();
		group.add(maleButton);
		group.add(femaleButton);

		// Label hiển thị lựa chọn
		JLabel resultLabel = new JLabel("Bạn chưa chọn giới tính.");
		resultLabel.setBounds(50, 80, 200, 30);
		contentPane.add(resultLabel);

		// Gắn sự kiện cho từng RadioButton
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = e.getActionCommand();
				resultLabel.setText("Bạn chọn: " + gender);
			}
		};

		maleButton.addActionListener(listener);
		femaleButton.addActionListener(listener);
	}
}
