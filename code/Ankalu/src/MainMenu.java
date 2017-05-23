import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame{

    public JPanel panelMenu;
    public JButton playButton;
    public JButton settingsButton;
    public JButton highscoreButton;

    MainMenu() {
        JFrame frame = new JFrame("MainMenu");
        if(MusicPlayed.GetMusic() == null) MusicPlayed.SetMusic("src//Music//tetris-gameboy.wav");
        frame.setSize(new Dimension(600, 800));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setContentPane(panelMenu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBackground(Color.black);
        panelMenu.setBackground(Color.black);
        ImageIcon icon = new ImageIcon("src//Pictures//pic1.jpg");
        playButton.setIcon(icon);
        playButton.setText("");
        playButton.setBackground(Color.black);
        playButton.setBorder(BorderFactory.createLineBorder(Color.black));



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


