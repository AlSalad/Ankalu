package Program;

import org.junit.Assert;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class GameModeTest {
    @org.junit.Test
    public void setGameMode() throws Exception {
        GameMode gm = new GameMode();
        gm.setGameMode(0);

        final Field field = gm.getClass().getDeclaredField("value");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(gm), 0);
    }

    @org.junit.Test
    public void getGameMode() throws Exception {
        final GameMode gm = new GameMode();
        final Field field = gm.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(gm, 0);
        //when
        final int result = gm.getGameMode();
        //then
        assertEquals("field wasn't retrieved properly", result, 0);
    }

}