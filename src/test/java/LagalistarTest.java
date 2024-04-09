import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import v.vinnsla.Lagalistar;

public class LagalistarTest {

    private Lagalistar lagalistar;

    @Before
    public void testFrumstilla() {

        lagalistar = new Lagalistar();
        lagalistar.frumstilla();

    }
    @Test
    public void testGetNuverandi() {

        assertEquals(lagalistar.getNuverandi(), lagalistar.getNuverandi());
    }



}
