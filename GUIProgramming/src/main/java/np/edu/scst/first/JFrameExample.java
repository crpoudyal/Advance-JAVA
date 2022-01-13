package np.edu.scst.first;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author crpoudyal
 */
public class JFrameExample extends JFrame {

    public JFrameExample() {

        JPanel jPanel = new JPanel();
        
        jPanel.setBackground(Color.red);
        
        add(jPanel);

        setVisible(true);

        setSize(200, 200); // (width,height)

        setTitle("JFrame Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JFrameExample JF = new JFrameExample();

    }

}
