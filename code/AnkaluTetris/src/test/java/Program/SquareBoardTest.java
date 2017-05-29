package Program;

import org.junit.Test;

import java.awt.*;
import java.lang.reflect.Field;

import static org.junit.Assert.*;

/**
 * Created by koopa on 29.05.2017.
 */
public class SquareBoardTest {

    @Test
    public void isSquareEmpty() throws Exception {

        final SquareBoard sb = new SquareBoard(100, 100);
        boolean result = sb.isSquareEmpty(0, 0);
        //then
        assertEquals("Wrong Square passed", result, true);
    }

    @Test
    public void isLineEmpty() throws Exception {
    }

    @Test
    public void isLineFull() throws Exception {
    }

    @Test
    public void hasFullLines() throws Exception {
    }

    @Test
    public void getComponent() throws Exception {
    }

    @Test
    public void getBoardHeight() throws Exception {
    }

    @Test
    public void getBoardWidth() throws Exception {
    }

    @Test
    public void getRemovedLines() throws Exception {
    }

    @Test
    public void getSquareColor() throws Exception {
    }

    @Test
    public void setSquareColor() throws Exception {
    }

    @Test
    public void setMessage() throws Exception {
    }

    @Test
    public void clear() throws Exception {
    }

    @Test
    public void removeFullLines() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

}