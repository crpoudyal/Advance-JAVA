package np.edu.scst.first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialogDemo extends JFrame {

    JDialogDemo() {

        JLabel lbl = new JLabel("Click in check button to show dialog box");
        add(lbl);
        JButton chk = new JButton("Check");
        add(chk);

        chk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog jd = new JDialog();

                jd.setTitle("Warning!!");
                JLabel jlbl = new JLabel("This is warning!!!");
                jd.add(jlbl);

                JButton jbtn = new JButton("Yes");
                jd.add(jbtn);
                JButton jbtn1 = new JButton("No");
                jd.add(jbtn1);
                jd.setVisible(true);
                jd.setSize(400, 400);
                jd.setLayout(new FlowLayout());

            }
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setTitle("JDialog Box");
        setSize(600, 600);
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new JDialogDemo();
    }
}
