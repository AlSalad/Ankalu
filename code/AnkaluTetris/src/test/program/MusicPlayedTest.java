package program;

import org.junit.Test;
import program.MusicPlayed;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * Created by Luka on 29.05.2017.
 */
public class MusicPlayedTest {
    @Test
    public void setMusic() throws Exception {
        final MusicPlayed mp = new MusicPlayed();
        mp.setMusic("music");

        final Field field = mp.getClass().getDeclaredField("musicPath");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(mp), "music");
    }

    @Test
    public void getMusic() throws Exception {
        final MusicPlayed mp = new MusicPlayed();
        final Field field = mp.getClass().getDeclaredField("musicPath");
        field.setAccessible(true);
        field.set(mp, "music");
        //when
        final String result = mp.getMusic();
        //then
        assertEquals("field wasn't retrieved properly", result, "music");
    }



}