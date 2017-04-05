package views.Scroll;

/**
 * Created by Luka on 04.04.2017.
 * https://www.nutt.net/create-scrolling-background-java/
 */
import java.awt.Component;
import javax.swing.JFrame;

public class Runner extends JFrame {

    public Runner() {
        //setSize(1000, 800);

        ScrollingBackground back = new ScrollingBackground();
        back.setFocusable(true);
        getContentPane().add(back);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Runner();
    }

}