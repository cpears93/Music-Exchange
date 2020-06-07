package instrumentTest;

import instrument.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    
    Keyboard keyboard;
    
    @Before
    public void before(){
        keyboard = new Keyboard("Korg", 4, 1500, 1800);
    }

    @Test
    public void getName(){
        assertEquals("Korg", keyboard.getName());
    }

    @Test
    public void getMusicSheet(){
        assertEquals(4, keyboard.getMusicSheet());
    }

    @Test
    public void getPurchasePrice(){
        assertEquals(1500, keyboard.getPurchasePrice());
    }

    @Test
    public void getSellingPrice() {
       assertEquals(1800, keyboard.getSellingPrice());
    }
}
