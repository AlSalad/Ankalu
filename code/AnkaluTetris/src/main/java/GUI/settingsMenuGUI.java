package gui;

import javax.swing.*;
import java.awt.*;


public class settingsMenuGUI extends JFrame{
    private JPanel panelSettings;
    private JButton musicBtn;
    private JButton aboutBtn;
    private JButton howToBtn;
    private JButton backToMain;


    public settingsMenuGUI(){

        panelSettings.setBackground(Color.black);
        musicBtn.setIcon(new ImageIcon("src//main//resources//Pictures//musicbtn.jpg"));
        musicBtn.setText("");
        musicBtn.setBackground(Color.black);
        musicBtn.setBorder(BorderFactory.createLineBorder(Color.black));
        aboutBtn.setIcon(new ImageIcon("src//main//resources//Pictures//aboutbtn.jpg"));
        aboutBtn.setText("");
        aboutBtn.setBackground(Color.black);
        aboutBtn.setBorder(BorderFactory.createLineBorder(Color.black));
        howToBtn.setIcon(new ImageIcon("src//main//resources//Pictures//howtoplaybtn.jpg"));
        howToBtn.setText("");
        howToBtn.setBackground(Color.black);
        howToBtn.setBorder(BorderFactory.createLineBorder(Color.black));
        backToMain.setIcon(new ImageIcon("src//main//resources//Pictures//backbtn.jpg"));
        backToMain.setText("");
        backToMain.setBackground(Color.black);
        backToMain.setBorder(BorderFactory.createLineBorder(Color.black));
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
