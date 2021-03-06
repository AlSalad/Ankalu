package GUI;

import Program.MusicPlayed;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;

import java.awt.*;
import java.awt.event.*;

public class MusicView {

    public JPanel musicPanel;
    public JButton selectMusic;
    public JList musicList;
    public JButton backToSettings;

    MusicView(){
        JFrame frame = new JFrame("MusicView");
        frame.setContentPane(musicPanel);
        frame.setSize(new Dimension(600, 800));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

        musicPanel.setBackground(Color.black);
        backToSettings.setIcon(new ImageIcon("src//main//resources//Pictures//backbtn.jpg"));
        backToSettings.setText("");
        backToSettings.setBackground(Color.black);
        backToSettings.setBorder(BorderFactory.createLineBorder(Color.black));
        selectMusic.setIcon(new ImageIcon("src//main//resources//Pictures//selectbtn.jpg"));
        selectMusic.setText("");
        selectMusic.setBackground(Color.black);
        selectMusic.setBorder(BorderFactory.createLineBorder(Color.black));
        musicList.setBackground(Color.black);
        musicList.setForeground(Color.white);
        musicList.setSelectionForeground(Color.black);
        musicList.setSelectionBackground(Color.decode("#119933"));
        musicList.setBorder(BorderFactory.createLineBorder(Color.black));

        backToSettings.addActionListener((ActionEvent e) -> {
            try {
                frame.dispose();
                new SettingsMenuGUI();
            }
            catch (Exception ignored){}
        });

        musicList.addListSelectionListener((ListSelectionEvent event) -> {
            if (event.getValueIsAdjusting()) {return;}
            JList source = (JList)event.getSource();
            MusicPlayed mp = new MusicPlayed();

            selectMusic.addActionListener(e -> {
                String selected = source.getSelectedValue().toString();
                if("Tetris".equals(selected)){
                    mp.setMusic("src//main//resources//Music//tetris-gameboy.wav");
                }
                if("Tetris-Rap".equals(selected)){
                    mp.setMusic("src//main//resources//Music//Tetris Rap.wav");
                }
                if("Sonic".equals(selected)){
                    mp.setMusic("src//main//resources//Music//sonic.wav");
                }
            });
        });

    }
}


