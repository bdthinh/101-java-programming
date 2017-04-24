package com.ptud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by thinhdbui on 23/4/17.
 */
public class FrameName extends JFrame {
    JButton btnHelloWorld;
    JTable tableNhanVien;
    final String[] columns = {"First", "Last"};
    final Object[][] data = {{"Thinh", "Bui"}, {"Other", "One"}};


    public FrameName() {
        initComponents();
    }

    private void initComponents() {
        JPanel panel = new JPanel();

        tableNhanVien = new JTable(data, columns);
        tableNhanVien.setBounds(20, 30, 300, 400);
        JScrollPane scrollPane = new JScrollPane(tableNhanVien);
        panel.add(scrollPane);

        btnHelloWorld = new JButton("Hello world");
        btnHelloWorld.addActionListener(onBtnHelloWorldClick());
        panel.add(btnHelloWorld);

        add(panel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    private ActionListener onBtnHelloWorldClick() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello world");
            }
        };
    }
}
