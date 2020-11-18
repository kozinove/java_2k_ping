package Zoopark;

import javax.swing.JTable;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Gui_Table extends JFrame{

    public static void createGUI(String[] _columnNames, String[][] _data) {
        JFrame frame = new JFrame("Animals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table = new JTable(_data, _columnNames);

        JScrollPane scrollPane = new JScrollPane(table);

        frame.getContentPane().add(scrollPane);
        frame.setPreferredSize(new Dimension(450, 450));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JFrame.setDefaultLookAndFeelDecorated(true);

    }
}