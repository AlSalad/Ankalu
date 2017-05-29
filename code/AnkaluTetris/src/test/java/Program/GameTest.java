package Program;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * Created by Luka on 29.05.2017.
 */
public class GameTest {
    @Test
    public void getState() throws Exception {
        Game game = new Game();
        final Field field = game.getClass().getDeclaredField("state");
        field.setAccessible(true);
        field.set(game, 0);
        final int result = game.getState();
        //then
        assertEquals("field wasn't retrieved properly", result, 0);
    }

    @Test
    public void getLevel() throws Exception {
        Game game = new Game();
        final Field field = game.getClass().getDeclaredField("level");
        field.setAccessible(true);
        field.set(game, 0);
        final int result = game.getLevel();
        //then
        assertEquals("field wasn't retrieved properly", result, 0);
    }

    @Test
    public void getScore() throws Exception {
        Game game = new Game();
        final Field field = game.getClass().getDeclaredField("score");
        field.setAccessible(true);
        field.set(game, 0);
        final int result = game.getState();
        //then
        assertEquals("field wasn't retrieved properly", result, 0);
    }

    @Test
    public void getRemovedLines() throws Exception {
        Game game = new Game();
        SquareBoard board = new SquareBoard(0, 0);
        final Field field = board.getClass().getDeclaredField("removedLines");
        field.setAccessible(true);
        field.set(board, 0);
        final int result = game.getRemovedLines();
        //then
        assertEquals("field wasn't retrieved properly", result, 0);
    }

    @Test
    public void init() throws Exception {
        Game game = new Game();
        game.state = Game.STATE_GAMEOVER;
        game.init();
        assertEquals("Fields didn't match", game.state, Game.STATE_GETREADY);
    }

    @Test
    public void start() throws Exception {
        Game game = new Game();
        game.state = Game.STATE_GETREADY;
        game.start();
        assertEquals("Fields didn't match", game.state, Game.STATE_PLAYING);
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