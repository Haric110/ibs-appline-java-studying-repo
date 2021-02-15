package Sweets;

public class Cookies extends Sweets{
    private String type;

    public Cookies(String name, int weightInGrams, double price, String type) {
        super(name, weightInGrams, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cookies{" +
                "brand = '" + brand + '\'' +
                ", price = " + price +
                ", weightInGrams = " + weightInGrams +
                ", type= '" + type + '\'' +
                '}';
    }
}
