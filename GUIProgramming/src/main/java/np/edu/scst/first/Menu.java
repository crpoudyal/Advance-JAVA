package np.edu.scst.first;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    Menu() {
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem pdf = new JMenuItem("Pdf");
        JMenuItem docx = new JMenuItem("Docx");

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");
        JMenu saveAs = new JMenu("Save As");

        JMenuBar jMenuBar = new JMenuBar();

        saveAs.add(pdf);
        saveAs.add(docx);
        file.add(newItem);
        file.add(open);
        file.add(saveAs);

        jMenuBar.add(file);
        jMenuBar.add(view);
        jMenuBar.add(edit);
        add(jMenuBar);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(800, 800);
        setTitle("JAVA Menu");
        setDefaultCloseOperation(3);

    }

    public static void main(String[] args) {
        new Menu();

    }

}
