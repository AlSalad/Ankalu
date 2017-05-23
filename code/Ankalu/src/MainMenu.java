import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{

    public JPanel panelMenu;
    public JButton playButton;
    public JButton settingsButton;
    public JButton highscoreButton;
    public JButton _Button;


    public MainMenu() {
        JFrame frame = new JFrame("MainMenu");
        if(MusicPlayed.GetMusic() == null) MusicPlayed.SetMusic("src//Music//tetris-gameboy.wav");
        frame.setSize(new Dimension(600, 800));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setContentPane(panelMenu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        int height = frame.getHeight();
        highscoreButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new settingsMenuGUI();
            }
        });

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    frame.dispose();
                    new PlayMenu();
                }
                catch (Exception ignored){
                }
            }
        });
    }

}


