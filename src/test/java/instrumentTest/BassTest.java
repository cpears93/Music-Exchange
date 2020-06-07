package instrumentTest;

import instrument.Bass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassTest {

    Bass bass;

    @Before
    public void before(){
        bass = new Bass("Fender",7, 300, 500);
    }

    @Test
    public void getName(){
        assertEquals("Fender",bass.getName());
    }

    @Test
    public void getStrings(){
        assertEquals(7, bass.getStrings());
    }

    @Test
    public void getPurchasePrice(){
        assertEquals(300, bass.getPurchasePrice());
    }

    @Test
    public void getSellingPrice(){
        assertEquals(500, bass.getSellingPrice());
    }
}
