package GUI;

import Program.MusicPlayed;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Luka on 14.06.2017.
 */
public class HighscoreView {

    private JPanel panel;
    private JList HighscoreList;

    HighscoreView(){
        JFrame frame = new JFrame("HighscoreView");
        frame.setSize(new Dimension(600, 800));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBackground(Color.black);
        panel.setBackground(Color.black);

        
    }
}
