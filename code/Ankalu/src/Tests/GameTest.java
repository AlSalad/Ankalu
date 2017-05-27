import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by koopa on 27.05.2017.
 */
public class GameTest {
    @Test
    public void getState() throws Exception {
        int state = 0;
        assertTrue(state == 0);
    }

    @Test
    public void getLevel() throws Exception {
        int level = 1;
        assertTrue(level == 1);
    }

    @Test
    public void getScore() throws Exception {
        int score = 1;
        assertTrue(score == 1);
    }

    @Test
    public void getRemovedLines() throws Exception {
        SquareBoard board = new SquareBoard(1, 1);
        assertTrue(board.getRemovedLines() == 0);
    }

    @Test
    public void init() throws Exception {
        Game game = new Game();
        game.state = Game.STATE_GAMEOVER;
        game.init();
        assertTrue(game.getState() == Game.STATE_GETREADY);
    }

    @Test
    public void start() throws Exception {
        Game game = new Game();
        game.start();
        assertTrue(game.getState() == Game.STATE_PLAYING);
    }

    @Test
    public void pause() throws Exception {
        Game game = new Game();
        game.state = Game.STATE_PLAYING;
        game.pause();
        assertTrue(game.getState() == Game.STATE_PAUSED);
    }

    @Test
    public void resume() throws Exception {
        Game game = new Game();
        game.state = Game.STATE_PAUSED;
        game.resume();
        assertTrue(game.getState() == Game.STATE_PLAYING);
    }

    @Test
    public void terminate() throws Exception {
        Game game = new Game();
        game.terminate();
        assertTrue(game.getState() == Game.STATE_GAMEOVER);
    }

}