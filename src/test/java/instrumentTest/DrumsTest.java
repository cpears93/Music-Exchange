package instrumentTest;

import instrument.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Roland", 2, 600, 750);
    }

    @Test
    public void getName(){
        assertEquals("Roland", drums.getName());
    }

    @Test
    public void getPedals(){
        assertEquals(2, drums.getPedals());
    }

    @Test
    public void getPurchasePrice(){
        assertEquals(600, drums.getPurchasePrice());
    }

    @Test
    public void getSellingPrice(){
        assertEquals(750, drums.getSellingPrice());
    }
}
