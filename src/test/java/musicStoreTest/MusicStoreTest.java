package musicStoreTest;

import instrument.Guitar;
import instrument.Keyboard;
import org.junit.Before;
import org.junit.Test;
import shop.ISell;
import shop.IShop;
import shop.MusicStore;

import static org.junit.Assert.assertEquals;

public class MusicStoreTest {

    MusicStore musicStore;
    IShop keyboard;
    ISell guitar;

    @Before
    public void before(){
        musicStore = new MusicStore();
        keyboard = new Keyboard("Yamaha", 3, 500, 700);
        guitar = new Guitar("Les Paul", 6, 1200, 1500);
    }

    @Test
    public void getName(){
        assertEquals("Les Paul", musicStore.getName());
    }

    @Test
    public void canAddToStock(){
        musicStore.stock(1);
        assertEquals(3, musicStore.getAddToStock());
    }

    @Test
    public void canRemoveFromStock(){
        musicStore.stock(1);
        assertEquals(2, musicStore.getRemoveFromStock());
    }
}
