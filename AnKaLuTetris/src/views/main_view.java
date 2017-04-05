package views;

import views.Scroll.ScrollingBackground;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Luka on 04.04.2017.
 */
public class main_view extends JFrame {

    public static JFrame mainMenu_frame = new JFrame("view_main");
    public JPanel panel_main;
    private JButton btn_Close;
    private JButton btn_Shrink;
    private JButton btn_Play;
    private JPanel panel_menuBar;
    private JButton btn_Settings;
    private JButton highscoreButton;

    public main_view() {





        setVisible(true);

        //blauer Focus um Feld weg
        btn_Close.setFocusPainted(false);
        btn_Shrink.setFocusPainted(false);

        btn_Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btn_Shrink.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainMenu_frame.setState(Frame.ICONIFIED);
            }
        });
        btn_Play.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //MovingBackgroundDemo mov = new MovingBackgroundDemo();
            }
        });
    }

    public static void main(String[] args){
        mainMenu_frame.setContentPane(new main_view().panel_main);
        mainMenu_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainMenu_frame.setUndecorated(true);

        ScrollingBackground back = new ScrollingBackground();
        mainMenu_frame.getContentPane().add(back);

        mainMenu_frame.pack();
        mainMenu_frame.setVisible(true);
    }
}
