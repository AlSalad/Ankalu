package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by koopa on 18.06.2017.
 */
public class About {
    private JTextArea aboutText;
    private JPanel panel1;
    private JButton backToMain;

    public About() {
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

        aboutText.setText(" Die Entwickler dieses Spiels heißen Katharina-Maria Heer, Luka Kröger und André Harbrecht. \n " +
                " Der Name AnKaLu-Tetris setzt sich also aus unseren Namen zusammen. Dieses Tetris Game entstand \n" +
                " im Rahmen eines Studienprojektes im Fach Software Engineering. Ziel des Projektes ist es, das Tetris \n " +
                " aus dem Jahr von 1984 wieder aufleben zu lassen. Doch in unserer Version ist nicht nur das normale Standardspiel \n" +
                " enthalten, sondern verschiedene Modi. Hier kann man zwischen dem Epilepsie-Modus, dem Fast-Modus und dem \n " +
                " Reverse-Modus unterscheiden. Der Fast-Modus besteht im Wesentlichen aus dem Standard-Modus, mit dem Unterschied, \n" +
                " dass sich hier die Blöcke schneller nach unten bewegen und der Spieler dadurch weniger Zeit hat zu überlegen und \n " +
                " entsprechend zu reagieren. Der Revers-Modus ist eine kleine Neuheit in der Tetrisszene. Hier ist die Steuerung der \n " +
                " Blöcke umgekehrt. Um den Block als nach rechts bewegen zu wollen, muss man hierfür die Pfeiltaste nach links nutzen \n " +
                " und umgekehrt. Für die ultimative Challenge bieten wir den Epilepsie Modus. Hier  flackert der Hintergrund, die Blöcke \n" +
                " bewegen sich schneller nach unten und die Steuerung wechselt. Rundum bietet dieses Tetris sämtliche Funktionen und spricht \n" +
                " jede Altersgruppe an. Die älteren bevorzugen laut einer von uns durchgeführten Umfrage den Standard-Modus, da es damals eben \n" +
                " nur diesen gab. Die jüngeren finden vor allem den Epilepsie-Modus sehr interessant und reizend.");


        backToMain.addActionListener(e -> {
            new SettingsMenuGUI();
            frame.dispose();
        });
    }
}
