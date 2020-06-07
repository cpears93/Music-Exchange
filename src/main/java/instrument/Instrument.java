package instrument;

public abstract class Instrument {

    String name;
    int strings;
    int purchasePrice;
    int sellingPrice;


    public Instrument(String name) {
        this.name = name;
        this.strings = strings;
    }

    public String getName() {
        return name;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
