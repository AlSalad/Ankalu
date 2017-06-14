package GUI;

import Program.Highscore;
import Program.Score;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Luka on 14.06.2017.
 */
public class HighscoreView {

    private JPanel panel;
    private JButton backToMenu;
    private JButton button_Reset;
    private DefaultListModel listModel;
    private JList list;
    private ArrayList<Score> highscoreListClass = new ArrayList<>();

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

        listModel = new DefaultListModel();
        list = new JList(listModel);

        Highscore hs = new Highscore();
        highscoreListClass = hs.getHighscoreList();
        LoadList();

        backToMenu.setIcon(new ImageIcon("src//main//resources//Pictures//backbtn.jpg"));
        backToMenu.setText("");
        backToMenu.setBackground(Color.black);
        backToMenu.setBorder(BorderFactory.createLineBorder(Color.black));
        backToMenu.addActionListener(e -> {
            new MainMenu();
            frame.dispose();
        });
    }

    private void LoadList(){
        for (Score item : highscoreListClass) {
            String entry = item.getName() + ": " + Integer.toString(item.getPoints());
            listModel.addElement(entry);
        }
    }
}
