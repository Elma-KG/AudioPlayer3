

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import v.vinnsla.Askrifandi;

public class askrifandiTest {

    private Askrifandi askrifandi;

    @Before
    public void initalize(){
        askrifandi = new Askrifandi("Jón");
    }

    @Test
    public void testName(){
        assertEquals("Jón", askrifandi.getNafn());
    }

    @Test
    public void testName2(){
        askrifandi.setNafn("Sigríður");
        assertEquals("Sigríður", askrifandi.getNafn());
    }

    @Test
    public void emptyString(){
        askrifandi.setNafn("");
        assertEquals("", askrifandi.getNafn());
    }

    @Test
    public void isNull(){
        askrifandi.setNafn(null);
        assertNull(askrifandi.getNafn());
    }

}
