package GUI;

import Program.Highscore;
import Program.Score;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Luka on 14.06.2017.
 */
public class HighscoreView {



    private JPanel panel;
    private JButton backToMenu;
    private JButton button_Reset;
    private JList<String> list;

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

        DefaultListModel<String> listModel = new DefaultListModel<String>();
        Highscore hs = new Highscore();
        ArrayList<Score> highscoreListClass = hs.getHighscoreList();
        for (Score item : highscoreListClass) {
            String entry = item.getName() + ": " + Integer.toString(item.getPoints());
            listModel.addElement(entry);
        }
        list.setModel(listModel);

        backToMenu.setIcon(new ImageIcon("src//main//resources//Pictures//backbtn.jpg"));
        backToMenu.setText("");
        backToMenu.setBackground(Color.black);
        backToMenu.setBorder(BorderFactory.createLineBorder(Color.black));
        backToMenu.addActionListener(e -> {
            new MainMenu();
            frame.dispose();
        });
        button_Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listModel.removeAllElements();
                try {
                    hs.ResetHighscore();
                } catch (FileNotFoundException e1) {
                    e1.printStackTrace();
                }
            }
        });
    }

}
