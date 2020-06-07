package instrumentTest;

import instrument.Drums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsTest {

    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Roland", 2, 60000, 75000);
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
        assertEquals(60000, drums.getPurchasePrice());
    }

    @Test
    public void getSellingPrice(){
        assertEquals(75000, drums.getSellingPrice());
    }
}
