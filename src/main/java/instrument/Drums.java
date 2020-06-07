package instrument;

import instruments.IPlay;

public class Drums extends Instrument {

    private int pedals;
    private int purchasePrice;
    private int sellingPrice;

    public Drums(String name, int pedals, int purchasePrice, int sellingPrice) {
        super(name);
        this.pedals = pedals;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public int getPedals() {
        return pedals;
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
