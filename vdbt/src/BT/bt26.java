package BT;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class bt26 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JSlider slider;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bt26 frame = new bt26();
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
    public bt26() {
        // Thiết lập cửa sổ JFrame
        setTitle("Đổi độ sáng nền");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200); // Kích thước cửa sổ 400x200

        // Tạo contentPane và thiết lập layout
        contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());  // Sử dụng BorderLayout cho contentPane
        setContentPane(contentPane);

        // Thêm border cho contentPane

        // Tạo JSlider với giá trị từ 0 đến 255
        slider = new JSlider(0, 255, 0);
        slider.setMajorTickSpacing(51); // Các dấu chia chính (mỗi 51)
        slider.setMinorTickSpacing(10); // Các dấu chia nhỏ (mỗi 10)
        slider.setPaintTicks(true); // Hiển thị các dấu chia
        slider.setPaintLabels(true); // Hiển thị nhãn cho các giá trị

        // Thêm JSlider vào contentPane
        contentPane.add(slider, BorderLayout.CENTER);

        // Thêm sự kiện thay đổi giá trị slider
        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                // Lấy giá trị của slider
                int value = slider.getValue();
                // Thay đổi màu nền dựa trên giá trị của slider (RGB)
                contentPane.setBackground(new Color(value, value, value));
            }
        });
    }
}
