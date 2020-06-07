package instrument;

import instruments.IPlay;
import shop.IShop;

public class Keyboard extends Instrument implements IShop {

    private int musicSheet;
    private int purchasePrice;
    private int sellingPrice;

    public Keyboard(String name, int musicSheet, int purchasePrice, int sellingPrice) {
        super(name);
        this.musicSheet = musicSheet;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public int getMusicSheet() {
        return musicSheet;
    }

    @Override
    public int getPurchasePrice() {
        return purchasePrice;
    }

    @Override
    public int getSellingPrice() {
        return sellingPrice;
    }

    public void buy(Instrument Instrument) {

    }

    public int getBuyPrice() {
        return 0;
    }
}
