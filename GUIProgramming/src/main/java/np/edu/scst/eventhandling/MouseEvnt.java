package np.edu.scst.eventhandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEvnt extends JFrame {

    MouseEvnt() {
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
        new MouseEvnt();
    }
}
