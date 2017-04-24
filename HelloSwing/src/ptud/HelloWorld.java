package ptud;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by thinhdbui on 24/4/17.
 */
public class HelloWorld {
    private JPanel panelHelloWorld;
    private JButton buttonHelloWorld;

    public HelloWorld() {
        buttonHelloWorld.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello Swing");
            }
        });
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame("Hello world");
        jf.setContentPane(new HelloWorld().panelHelloWorld);
        jf.pack();
        jf.setVisible(true);
    }
}
