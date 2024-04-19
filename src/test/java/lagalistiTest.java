import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import v.vinnsla.Lag;
import v.vinnsla.Lagalisti;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;


public class lagalistiTest {

    private Lagalisti lagalisti;

    @Before
    public void initalize() {
        lagalisti = new Lagalisti();
    }


    @Test
    public void testIndex() {
        assertEquals(0, lagalisti.getIndex());
    }

    @Test
    public void testIndex2() {
        lagalisti.setIndex(1);
        assertEquals(1, lagalisti.getIndex());
    }

    @Test
    public void indexIsNegitive() {
        lagalisti.setIndex(-1);
        assertEquals(-1, lagalisti.getIndex());

    }

    @Test
    public void testGetLagListi() {
        assertEquals(0, lagalisti.getLagListi().size());
    }

    @Test
    public void testLesaLog() throws IOException {

        lagalisti.lesaLog("lagalisti1.dat");
        assertEquals(2, lagalisti.getLagListi().size());
    }
    @Test
    public void testFileNotFound() throws IOException {
        assertThrows(IOException.class, () -> lagalisti.lesaLog("lagalisti3.dat"));
    }
    @Test
    public void testNaesti() throws IOException {
        lagalisti.setIndex(0);
        lagalisti.lesaLog("lagalisti1.dat");
        lagalisti.naesti();
        assertEquals(1, lagalisti.getIndex());
        lagalisti.naesti();
        assertEquals(0, lagalisti.getIndex());
    }

    }



