package ptud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by thinhdbui on 24/4/17.
 */
public class App extends JFrame {
    private JPanel panelApp;
    private JButton btnHelloSwing;
    private JTable tableProduct;

    final String DB_URL = "";
    final String USER = "root";
    final String PASSWORD = "";
    final String options = "";



    public App() {
        panelApp = new JPanel();
        btnHelloSwing = new JButton("Hello Swing");
        btnHelloSwing.addActionListener(onClickBtnSwing());
        panelApp.add(btnHelloSwing);

        Object[][] data = getDanhSachNhanVien();
        String[] columns = {"MaNv", "TenNV", "Ngaysinh"};
        tableProduct = new JTable(data, columns);
        JScrollPane sp = new JScrollPane(tableProduct);
        panelApp.add(sp);
    }

    public Object[][] getDanhSachNhanVien() {
        Object[][] data = null;
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            String sql = "SELECT * FROM NHANVIEN";
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()) {
                int maNv = rs.getInt("MaNv");
                String tenNv = rs.getString("TenNv");
                String ngaySinh = rs.getString("NgaySinh");
                Object line = new Object[]{maNv, tenNv, ngaySinh};
                //
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return data;
    }

    private ActionListener onClickBtnSwing() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello swing");
            }
        };
    }

    public static void main(String[] args) {
        App app = new App();
        JFrame jf = new JFrame();
        jf.add(app.panelApp);
        jf.pack();
        jf.setVisible(true);
    }

}
