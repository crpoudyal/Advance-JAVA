package np.edu.scst.lab2;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import javax.swing.*;
import java.awt.event.MouseEvent;

public class MouseEvntDemo extends JFrame {

    MouseEvntDemo() {
        JButton jbtn = new JButton("Click");
        JLabel lbl = new JLabel();
        jbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                lbl.setText("Clicked");

            }
        });
        add(jbtn);
        add(lbl);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(3);
        setSize(400, 400);
        setTitle("Mouse Event Handling");
    }

    public static void main(String[] args) {
        new MouseEvntDemo();
    }

}
