package GUI;

import Program.MusicPlayed;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame{

    public JPanel panelMenu;
    public JButton playButton;
    public JButton settingsButton;
    public JButton highscoreButton;

    public MainMenu() {
        JFrame frame = new JFrame("MainMenu");
        if(MusicPlayed.GetMusic() == null) MusicPlayed.SetMusic("src//main//resources//Music//tetris-gameboy.wav");
        frame.setSize(new Dimension(600, 800));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setContentPane(panelMenu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBackground(Color.black);
        panelMenu.setBackground(Color.black);
        playButton.setIcon(new ImageIcon("src//main//resources//Pictures//playbtn.jpg"));
        playButton.setText("");
        playButton.setBackground(Color.black);
        playButton.setBorder(BorderFactory.createLineBorder(Color.black));
        settingsButton.setIcon(new ImageIcon("src//main//resources//Pictures//settingsbtn.jpg"));
        settingsButton.setText("");
        settingsButton.setBackground(Color.black);
        settingsButton.setBorder(BorderFactory.createLineBorder(Color.black));
        highscoreButton.setIcon(new ImageIcon("src//main//resources//Pictures//highscorebtn.jpg"));
        highscoreButton.setText("");
        highscoreButton.setBackground(Color.black);
        highscoreButton.setBorder(BorderFactory.createLineBorder(Color.black));


        highscoreButton.addActionListener(e -> {
        });

        settingsButton.addActionListener(e -> {
            frame.dispose();
            new settingsMenuGUI();
        });

        playButton.addActionListener(e -> {
            try {
                frame.dispose();
                new PlayMenu();
            }
            catch (Exception ignored){}
        });
    }

}


