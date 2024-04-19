import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import v.vinnsla.Lagalistar;

import java.io.FileNotFoundException;
import java.io.IOException;

public class LagalistarTest {

   private Lagalistar lagalistar;
    @Before
    public void initialize(){
       Lagalistar.setIndex(0);
    }

    @Test
    public void testInitializtion(){
        Lagalistar.frumstilla();
        assertNotNull(Lagalistar.getNuverandi());
    }

    @Test
    public void testException() {
        Lagalistar.setIndex(4);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Lagalistar.getNuverandi());
    }

    @Test
    public void testException2() {
        Lagalistar.setIndex(-1);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Lagalistar.getNuverandi());
    }






}

