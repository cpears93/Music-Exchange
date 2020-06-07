package instrumentsTest;

import instruments.Instruments;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class instrumentsTest {

    Instruments instruments;

    @Before
    public void before(){
        instruments = new Instruments("Piano", "Roland", "Black", "Wood", 600, 800);
    }

    @Test
    public void getName(){
        assertEquals("Piano", instruments.getName());
    }

    @Test
    public void getMake(){
        assertEquals("Roland", instruments.getMake());
    }

    @Test
    public void getColour(){
        assertEquals("Black", instruments.getColour());
    }

    @Test
    public void getMaterial(){
        assertEquals("Wood", instruments.getMaterial());
    }

    @Test
    public void getPurchasePrice(){
        assertEquals(600, instruments.getPurchasePrice());
    }

    @Test
    public void getSellingPrice(){
        assertEquals(800, instruments.getSellingPrice());
    }
}
