package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HowToPlay {

    private JTextArea aboutText;
    private JPanel panel1;
    private JButton backToMain;

    HowToPlay(){
        JFrame frame = new JFrame("HowToPlay");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600, 800));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.setVisible(true);

        backToMain.setIcon(new ImageIcon("src//main//resources//Pictures//backbtn.jpg"));
        backToMain.setText("");
        backToMain.setBackground(Color.black);
        backToMain.setBorder(BorderFactory.createLineBorder(Color.black));

        aboutText.setText("     → : Move block to the right \n " +
                        "   ← : Move block to the left \n" +
                        "   ↓ : Move block to bottom \n" +
                        "   P : Pausieren \n" +
                        "   \uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C\uF04C");

        backToMain.addActionListener(e -> {
                new SettingsMenuGUI();
                frame.dispose();
        });
    }
}

