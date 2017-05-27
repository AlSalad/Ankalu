import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Luka on 08.05.2017.
 */
public class MusicGUITest {

    @Test
    public void testOpenMusicGui() {
        MusicGUI fc = new MusicGUI();
        //assertFalse(fc.isVisible());
    }

    @Test
    public void SelectMusicTest() {
        MusicGUI mg = new MusicGUI();
        mg.musicList.setSelectedIndex(0);
        mg.selectMusic.doClick();
    }
}