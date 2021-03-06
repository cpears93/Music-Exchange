package instrument;

import instruments.IPlay;

public class Bass extends Instrument {

    private int strings;
    private int purchasePrice;
    private int sellingPrice;

    public Bass(String name, int strings, int purchasePrice, int sellingPrice) {
        super(name);
        this.strings = strings;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public int getStrings() {
        return strings;
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
