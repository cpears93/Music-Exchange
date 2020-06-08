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

    }

    @Test
    public void getName(){
        assertEquals("Les Paul", musicStore.getName());
    }

    @Test
    public void canAddToStock(){
        guitar = new Guitar("Les Paul", 6, 1200, 1500);;
        assertEquals(1, musicStore.getAddToStock());
    }

    @Test
    public void canRemoveFromStock(){
        musicStore.addToStock(guitar);
        musicStore.removeFromStock(guitar);
        assertEquals(0, musicStore.stockCount());

    }
}
