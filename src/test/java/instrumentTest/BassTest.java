package instrumentTest;

import instrument.Bass;
import instrument.Instrument;
import instruments.Instruments;
import org.junit.Before;
import org.junit.Test;
import shop.ISell;
import shop.IShop;

public class BassTest {

    Instruments instruments;
    Bass bass;
    ISell sellingPrice;
    IShop purchasePrice;

    @Before
    public void before(){
        instruments = new Instruments();
        bass = new Bass();
        sellingPrice = new SellingPrice(100);
        purchasePrice = new PurchasePrice(80);
    }

    @Test
    public void getName(){
        assertEqual("", bass.getName());
    }
}
