import org.junit.Test;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.junit.Assert.*;

/**
 * Created by koopa on 23.05.2017.
 */
public class FigureTest {
    @Test
    public void moveLeft() throws Exception {
        JFrame frame = new JFrame("Tetris");
        final Game game = new Game();
        frame.add(game.getSquareBoardComponent());
        frame.pack();
        frame.show();
        game.start();
    }

    @Test
    public void moveRight() throws Exception {
    }

    @Test
    public void moveDown() throws Exception {
    }

}