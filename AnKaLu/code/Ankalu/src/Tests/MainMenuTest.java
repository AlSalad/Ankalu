import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static org.junit.Assert.*;

/**
 * Created by Luka on 08.05.2017.
 */
public class MainMenuTest {

    @Test
    public void testOpenMainMenu() {
        MainMenu mm = new MainMenu();
        assertFalse(mm.isVisible());
    }

    @Test
    public void testPlayMenuTest() throws InterruptedException {
        MainMenu mm = new MainMenu();
        mm.playButton.doClick();
       // Thread.sleep(1000);
        assertFalse(mm.isVisible());
    }

    @Test
    public void minimizeTest(){
        MainMenu mm = new MainMenu();
        mm._Button.doClick();

        assertFalse(mm.getState() == Frame.ICONIFIED);
    }


}