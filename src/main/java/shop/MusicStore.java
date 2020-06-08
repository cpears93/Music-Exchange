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

    public int getAddToStock() {
        return addToStock;
    }

    public int getRemoveFromStock(ISell item) {
        return removeFromStock;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addToStock(ISell guitar) {
    }

    public void removeFromStock(ISell guitar) {
    }
}
