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
    private JButton xButton;
    private JButton _Button;

    public PlayMenu(){
        JFrame frame = new JFrame("MainMenu");

        frame.setContentPane(panelPlayMenu);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //frame.setSize(1000, 700);

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);

        frame.setVisible(true);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MainMenu mm = new MainMenu();

            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        _Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setState(Frame.ICONIFIED);
            }
        });

        standardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Tetris tetris = new Tetris();
                //GameMode
                try {
                    File newTextFile = new File("C:\\repos\\AnKaLu\\code\\Ankalu\\src\\TextFiles\\GameMode.txt");
                    FileWriter fw = new FileWriter(newTextFile);
                    fw.write(0);
                    fw.close();

                } catch (IOException iox) {
                    //do stuff with exception
                    iox.printStackTrace();
                }

            }
        });
        fastButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Tetris tetris = new Tetris();
                //GameMode
                try {
                    File newTextFile = new File("C:\\repos\\AnKaLu\\code\\Ankalu\\src\\TextFiles\\GameMode.txt");
                    FileWriter fw = new FileWriter(newTextFile);
                    fw.write("1");
                    fw.close();

                } catch (IOException iox) {
                    //do stuff with exception
                    iox.printStackTrace();
                }
            }
        });
    }
}
