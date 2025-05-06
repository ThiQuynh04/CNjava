package BT;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.awt.Color;

public class BKT extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtHoten;
    private JFormattedTextField txtDate;
    private JTextField txtQue;
    private JTable table;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BKT frame = new BKT();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BKT() {
        setTitle("Bài Kiểm Tra");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 350);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JLabel lblNewLabel = new JLabel("Họ và tên");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

        JLabel lblNewLabel_1 = new JLabel("Ngày sinh");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

        JLabel lblNewLabel_2 = new JLabel("Quê quán");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));

        txtHoten = new JTextField();
        txtHoten.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtHoten.setColumns(10);

        try {
            MaskFormatter dateFormatter = new MaskFormatter("##/##/####");
            dateFormatter.setPlaceholderCharacter('_');
            txtDate = new JFormattedTextField(dateFormatter);
            txtDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
            txtDate.setColumns(10);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        txtQue = new JTextField();
        txtQue.setFont(new Font("Tahoma", Font.PLAIN, 15));
        txtQue.setColumns(10);

        JButton btnXuat = new JButton("Xuất");
        btnXuat.setBackground(new Color(255, 255, 255));
        btnXuat.setFont(new Font("Tahoma", Font.PLAIN, 15));

        JScrollPane scrollPane = new JScrollPane();

        btnXuat.addActionListener(e -> {
            String hoten = txtHoten.getText().trim();
            String ngaysinh = txtDate.getText().trim();
            String que = txtQue.getText().trim();

            // Kiểm tra họ tên
            if (!hoten.matches("^[\\p{L}\\s]+$")) {
                JOptionPane.showMessageDialog(this, "Họ và tên chỉ được chứa chữ cái và khoảng trắng!");
                return;
            }

            // Kiểm tra dữ liệu trống hoặc không hợp lệ
            if (hoten.isEmpty() || ngaysinh.contains("_") || que.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ và đúng định dạng!");
                return;
            }

            // Thêm dữ liệu vào bảng
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.addRow(new Object[] { hoten, ngaysinh, que });

            // Làm mới các trường nhập liệu
            txtHoten.setText("");
            txtDate.setValue(null);
            txtQue.setText("");
        });

        // Thiết lập layout
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                .addComponent(btnXuat, GroupLayout.PREFERRED_SIZE, 467, GroupLayout.PREFERRED_SIZE)
                                .addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
                                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNewLabel_2)
                                        .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(ComponentPlacement.RELATED)
                                    .addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                                        .addComponent(txtHoten, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                        .addComponent(txtDate, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                                        .addComponent(txtQue, GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                                    .addGap(172)))
                            .addContainerGap())
                        .addGroup(gl_contentPane.createSequentialGroup()
                            .addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                            .addGap(153))))
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel)
                        .addComponent(txtHoten, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel_1)
                        .addComponent(txtDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                        .addComponent(lblNewLabel_2)
                        .addComponent(txtQue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18)
                    .addComponent(btnXuat)
                    .addGap(33)
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );

        table = new JTable();
        table.setModel(new DefaultTableModel(
            new Object[][] {},
            new String[] {
                "Họ và Tên", "Ngày Sinh", "Quê Quán"
            }
        ) {
            Class[] columnTypes = new Class[] {
                String.class, String.class, String.class
            };
            public Class getColumnClass(int columnIndex) {
                return columnTypes[columnIndex];
            }
        });
        scrollPane.setViewportView(table);
        contentPane.setLayout(gl_contentPane);
    }
}
