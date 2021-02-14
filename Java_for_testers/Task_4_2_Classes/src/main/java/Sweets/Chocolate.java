package Sweets;

public class Chocolate extends Sweets {
    private String type;


    public Chocolate(String brand, double price, int weightInGrams, String type) {
        super(brand, weightInGrams, price);
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
        return "Chocolate{" +
                "brand ='" + getBrand() + '\'' +
                ", price =" + getPrice() +
                ", type='" + type + '\'' +
                ", weightInGrams=" + getWeightInGrams() +
                '}';
    }
}
