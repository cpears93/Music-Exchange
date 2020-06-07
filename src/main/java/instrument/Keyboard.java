package instrument;

import instruments.IPlay;

public class Keyboard extends Instrument {

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
}
