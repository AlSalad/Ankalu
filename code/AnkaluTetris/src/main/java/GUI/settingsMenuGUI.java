package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class settingsMenuGUI extends JFrame{
    private JPanel panelSettings;
    private JButton musicBtn;
    private JButton aboutBtn;
    private JButton howToBtn;
    private JButton backToMain;

    public settingsMenuGUI(){
        JFrame frame = new JFrame("settingsMenuGUI");
        frame.setContentPane(panelSettings);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600, 800));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);

        musicBtn.addActionListener(e -> {
            frame.dispose();
            new MusicGUI();
        });
        backToMain.addActionListener(e -> {
            new MainMenu();
            frame.dispose();
        });
    }

}
