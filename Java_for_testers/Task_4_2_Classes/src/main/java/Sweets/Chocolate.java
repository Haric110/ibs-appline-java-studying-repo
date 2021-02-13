package Sweets;

public class Chocolate extends Sweets {
    private String type;
    private int weightInGrams;


    public Chocolate(String name, double price, String type, int weightInGrams) {
        super(name, price);
        this.type = type;
        this.weightInGrams = weightInGrams;
    }

    public String getType() {
        return type;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }
}
