
import javax.swing.*;
import java.awt.*;

class MainPanel {

    public MainPanel() {

        JFrame frame = new JFrame("Лабораторная 1");

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);

        tabbedPane.add("Задание 1", new FirstTask().getPanel());
        tabbedPane.add("Задание 2", new SecondTask().getPanel());
        tabbedPane.add("Задание 3", new ThirdTask().getPanel());


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(tabbedPane);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
    public class Main {

        public static void main(String[] args) {

            new MainPanel();
        }
    }