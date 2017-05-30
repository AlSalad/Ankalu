package program;

import org.junit.Test;
import program.SquareBoard;

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

}