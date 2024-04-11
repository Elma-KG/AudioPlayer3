import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import v.vinnsla.Lagalisti;



public class lagalistiTest {

    private Lagalisti lagalisti;

    @Before
    public void initalize(){
        lagalisti = new Lagalisti();
    }



    @Test
    public void testIndex(){
        assertEquals(0,lagalisti.getIndex());
    }

    @Test
    public void testIndex2(){
        lagalisti.setIndex(1);
        assertEquals(1,lagalisti.getIndex());
    }

    @Test
    public void indexIsNegitive(){
        lagalisti.setIndex(-1);
        assertEquals(-1,lagalisti.getIndex());

    }

    @Test
    public void testGetLagListi(){
        assertEquals(0,lagalisti.getLagListi().size());
    }

}
