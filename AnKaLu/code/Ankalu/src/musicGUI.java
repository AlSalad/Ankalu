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

public class musicGUI {

    private JPanel musicPanel;
    private JButton selectMusic;
    private JList musicList;
    private JButton backToSettings;

    public musicGUI(){
        JFrame frame = new JFrame("musicGUI");
        frame.setContentPane(musicPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);


        backToSettings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    settingsMenuGUI sm = new settingsMenuGUI();
                    frame.dispose();
                }
                catch (Exception ex){
                }
            }
        });
        musicList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()){
                    JList source = (JList)event.getSource();


                    selectMusic.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String selected = source.getSelectedValue().toString();
                            if(selected.equals("Tetris")){
                                try {
                                    String str = "C:/Users/Koopa/Music/tetris-gameboy.wav";
                                    File newTextFile = new File("musicfile.txt");

                                    FileWriter fw = new FileWriter(newTextFile);
                                    fw.write(str);
                                    fw.close();

                                } catch (IOException iox) {
                                    //do stuff with exception
                                    iox.printStackTrace();
                                }
                            }
                            if(selected.equals("Sandstorm")){
                                try {
                                    String str = "C:/Users/Koopa/Music/Hannes.wav";
                                    File newTextFile = new File("musicfile.txt");

                                    FileWriter fw = new FileWriter(newTextFile);
                                    fw.write(str);
                                    fw.close();

                                } catch (IOException iox) {
                                    //do stuff with exception
                                    iox.printStackTrace();
                                }
                            }
                        }
                    });
                }
            }
        });

    }
}


