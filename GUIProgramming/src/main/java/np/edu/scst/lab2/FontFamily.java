// 1.WAP to display the use of various font families and styles in a swing application.
package np.edu.scst.lab2;

import java.awt.*;
import javax.swing.*;

public class FontFamily extends JFrame {

    FontFamily() {

        JButton serif = new JButton("serif");
        JButton sansSerif = new JButton("sansSerif");
        JButton dialog = new JButton("dialog");
        JButton dialogInput = new JButton("dialogInput");
        JButton monospace = new JButton("monospace");

        Font serifFont = new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 28);
        Font sensSerifFont = new Font(Font.SANS_SERIF, Font.BOLD | Font.ITALIC, 28);
        Font dialogFont = new Font(Font.DIALOG, Font.BOLD | Font.ITALIC, 28);
        Font dialogInputFont = new Font(Font.DIALOG_INPUT, Font.BOLD | Font.ITALIC, 28);
        Font monospaceFont = new Font(Font.MONOSPACED, Font.BOLD | Font.ITALIC, 28);

        serif.setFont(serifFont);
        sansSerif.setFont(sensSerifFont);
        dialog.setFont(dialogFont);
        dialogInput.setFont(dialogInputFont);
        monospace.setFont(monospaceFont);

        add(serif);
        add(sansSerif);
        add(dialog);
        add(dialogInput);
        add(monospace);
        setLayout(new FlowLayout());

        setVisible(true);
        setTitle("Font Family");
        setSize(500, 500);
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new FontFamily();

    }

}
