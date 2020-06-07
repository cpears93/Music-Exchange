package instrument;

import instruments.IPlay;
import shop.ISell;

public class Guitar extends Instrument implements ISell {

    private int strings;
    private int purchasePrice;
    private int sellingPrice;

    public Guitar(String name, int strings, int purchasePrice, int sellingPrice) {
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

    public void Sell(Instrument Instrument) {

    }

    public int setSellValue() {
        return 0;
    }
}
