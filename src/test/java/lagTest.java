

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import v.vinnsla.Lag;


public class lagTest {

    private Lag lagid;

    @Before
    public void setUp() {
        lagid = new Lag("slod", "mynd", "nafn", 10);
    }

    @Test
    public void testHljodskraNafn() {
        assertEquals("slod", lagid.getHljodskraNafn());
    }

    @Test
    public void testLagNafn() {
        assertEquals("nafn", lagid.getLagNafn());
    }
    @Test
    public void testMyndskraNafn() {
        assertEquals("mynd", lagid.getMyndskraNafn());
    }

    @Test
    public void testLengd() {
        assertEquals(10, lagid.getLengd());
    }

}
