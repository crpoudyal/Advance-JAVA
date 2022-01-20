package np.edu.scst.first;

import javax.swing.*;
import java.awt.*;

public class Fonts extends JFrame {

    Fonts() {

        JButton serif = new JButton("serif");
        JButton sansSerif = new JButton("sansSerif");
        JButton dialog = new JButton("dialog");
        JButton dialogInput = new JButton("dialogInput");
        JButton monospace = new JButton("monospace");

        Font serifFont = new Font(Font.SERIF, Font.BOLD | Font.ITALIC, 12);
        Font sensSerifFont = new Font(Font.SANS_SERIF, Font.BOLD | Font.ITALIC, 12);
        Font dialogFont = new Font(Font.DIALOG, Font.BOLD | Font.ITALIC, 12);
        Font dialogInputFont = new Font(Font.DIALOG_INPUT, Font.BOLD | Font.ITALIC, 12);
        Font monospaceFont = new Font(Font.MONOSPACED, Font.BOLD | Font.ITALIC, 12);

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
        setSize(400, 400);
        setTitle("Fonts in JAVA");
        setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        new Fonts();

    }

}
