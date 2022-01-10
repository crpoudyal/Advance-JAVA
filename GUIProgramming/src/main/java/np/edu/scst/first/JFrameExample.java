package np.edu.scst.first;

import javax.swing.JFrame;

/**
 *
 * @author crpoudyal
 */
public class JFrameExample extends JFrame {

    public JFrameExample() {
        setVisible(true);

        setSize(200, 300); // (width,height)

        setTitle("JFrame Example");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JFrameExample JF = new JFrameExample();

    }

}
