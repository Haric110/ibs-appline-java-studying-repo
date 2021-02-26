package Task_4.Classes.Sweets;

public class Sweets {
    protected String brand;
    protected int weightInGrams;
    protected double price;

    public Sweets() {}

    public Sweets(String brand, int weightInGrams, double price) {
        this.brand = brand;
        this.weightInGrams = weightInGrams;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Task_4.Classes.Sweets{" +
                "brand='" + brand + '\'' +
                ", weightInGrams=" + weightInGrams +
                ", price=" + price +
                '}';
    }
}
