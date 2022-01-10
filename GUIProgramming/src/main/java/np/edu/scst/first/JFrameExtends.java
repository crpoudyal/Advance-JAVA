package np.edu.scst.first;

import javax.swing.JFrame;

/**
 *
 * @author crpoudyal
 */
public class JFrameExtends extends JFrame {

    public JFrameExtends() {
        setVisible(true);

//        setDefaultCloseOperation(3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(200,200);
        
        setTitle("JFrameExtends Example");

    }

    public static void main(String[] args) {
        JFrameExtends j = new JFrameExtends();

    }

}
