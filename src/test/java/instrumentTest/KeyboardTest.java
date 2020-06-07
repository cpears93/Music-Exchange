package instrumentTest;

import instrument.Keyboard;
import org.junit.Before;
import org.junit.Test;

public class KeyboardTest {
    
    Keyboard keyboard;
    
    @Before
    public void before(){
        keyboard = new Keyboard("Yamaha", 4, 1500, 1800);
    }

    @Test
    public void getName() {
    }
}
