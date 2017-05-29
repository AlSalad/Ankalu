package Program;

import static org.junit.Assert.*;

public class GameModeTest {
    @org.junit.Test
    public void setGameMode() throws Exception {
        GameMode.setGameMode(0);
        assertEquals("Wrong Value passed",GameMode.getGameMode(), 0);
    }

    @org.junit.Test
    public void getGameMode() throws Exception {

    }

}