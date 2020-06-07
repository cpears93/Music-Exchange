package instrumentTest;

import instrument.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Gibson", 5, 400, 500);
    }

    @Test
    public void getName(){
        assertEquals("Gibson", guitar.getName());
    }

    @Test
    public void getStrings(){
        assertEquals(5, guitar.getStrings());
    }

    @Test
    public void getPurchasePrice(){
        assertEquals(400, guitar.getPurchasePrice());
    }

    @Test
    public void getSellingPrice(){
        assertEquals(500, guitar.getSellingPrice());
    }
}
