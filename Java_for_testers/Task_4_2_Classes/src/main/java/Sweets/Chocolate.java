package Sweets;

public class Chocolate extends Sweets {
    private double percentOfCocoa;


    public Chocolate(String brand, double price, int weightInGrams, double percentOfCocoa) {
        super(brand, weightInGrams, price);
        this.percentOfCocoa = percentOfCocoa;
    }

    public double getPercentOfCocoa() {
        return percentOfCocoa;
    }

    public void setPercentOfCocoa(double percentOfCocoa) {
        this.percentOfCocoa = percentOfCocoa;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "brand = '" + brand + '\'' +
                ", price = " + price +
                ", weightInGrams = " + weightInGrams +
                ", percentOfCocoa = " + percentOfCocoa +
                '}';
    }
}
