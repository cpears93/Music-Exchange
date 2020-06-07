package instruments;

public class Instruments {

    String name;
    String make;
    String colour;
    String material;
    int purchasePrice;
    int sellingPrice;

    public Instruments(String name, String make, String colour, String material, int purchasePrice, int sellingPrice) {
        this.name = name;
        this.make = make;
        this.colour = colour;
        this.material = material;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }
}
