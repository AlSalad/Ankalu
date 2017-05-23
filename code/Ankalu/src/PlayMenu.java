import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Luka on 25.04.2017.
 */
public class PlayMenu {
    private JButton standardButton;
    private JPanel panelPlayMenu;
    private JButton fastButton;
    private JButton reverseButton;
    private JButton epilepsyButton;
    private JButton backButton;

    public PlayMenu(){
        JFrame frame = new JFrame("MainMenu");

        frame.setContentPane(panelPlayMenu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600, 800));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);
        panelPlayMenu.setBackground(Color.black);
        ImageIcon icon = new ImageIcon("src//Pictures//epilepsie.jpg");
        epilepsyButton.setIcon(icon);
        epilepsyButton.setText("");
        epilepsyButton.setBackground(Color.black);
        epilepsyButton.setBorder(BorderFactory.createLineBorder(Color.black));

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new MainMenu();
            }
        });

        standardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                GameMode.setGameMode(0);
                new Tetris();
            }
        });
        fastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                GameMode.setGameMode(1);
                new Tetris();
            }
        });
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                GameMode.setGameMode(2);
                new Tetris();
            }
        });
        epilepsyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                GameMode.setGameMode(3);
                new Tetris();
            }
        });
    }
}
