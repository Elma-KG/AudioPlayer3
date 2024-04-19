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
    public void testException()throws IOException {
        Lagalistar.setIndex(4); // Assuming there are fewer than 5 elements in your array
        // This lambda executes the code that should throw the exception
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Lagalistar.getNuverandi());
    }

    @Test
    public void testException2()throws IOException {
        Lagalistar.setIndex(-1); // Assuming there are fewer than 5 elements in your array
        // This lambda executes the code that should throw the exception
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> Lagalistar.getNuverandi());
    }






}

