package shop;

public class MusicStore {

    ISell isell;
    IShop ishop;

    private String name;
    private int stock;
    private int stockValue;
    private int addToStock;
    private int removeFromStock;

    public MusicStore() {
        this.isell = isell;
        this.ishop = ishop;
        this.name = name;
        this.stock = stock;
        this.stockValue = 2;
        this.stockValue = stockValue;
        this.addToStock = addToStock;
        this.removeFromStock = removeFromStock;
    }

    public ISell getIsell() {
        return isell;
    }

    public IShop getIshop() {
        return ishop;
    }

    public String getName() {
        return name;
    }

    public void getAddToStock(int value) {
        if (stockValue > 0){
            value = value /2;
            this.stockValue += 1;
        }
        super.addToStock(value);
    }

    public void getRemoveFromStock(int value) {
        if (stockValue < 0){
            value = value /2;
            this.stockValue -= 1;
        }
        super.removeFromStock(value);
    }


}
