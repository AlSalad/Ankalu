package GUI;

import Program.MusicPlayed;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class MusicGUI {

    public JPanel musicPanel;
    public JButton selectMusic;
    public JList musicList;
    public JButton backToSettings;

    MusicGUI(){
        JFrame frame = new JFrame("MusicGUI");
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
                new settingsMenuGUI();

            }
            catch (Exception ignored){}
        });

        musicList.addListSelectionListener(event -> {
            if (event.getValueIsAdjusting()) {return;}
            JList source = (JList)event.getSource();
            MusicPlayed mp = new MusicPlayed();

            selectMusic.addActionListener(e -> {
                String selected = source.getSelectedValue().toString();
                if(selected.equals("Tetris")){
                    MusicPlayed.SetMusic("src//main//resources//Music//tetris-gameboy.wav");
                }
                if(selected.equals("Tetris-Rap")){
                    MusicPlayed.SetMusic("src//main//resources//Music//Hannes.wav");
                }
                if(selected.equals("Ok")){
                    MusicPlayed.SetMusic("src//main//resources//Music//WithoutMe.wav");
                }
            });
        });

    }
}


