package valuables;

public class Jewellery extends Valuable {

    private int numberOfStones;
    private String material;


    public int getNumberOfStones() {
        return numberOfStones;
    }

    public String getMaterial(){
        return material;
    }

    public Jewellery(String name, int numberOfStones, boolean isGold) {
        super(name);
        this.numberOfStones = numberOfStones;
        this.isGold = isGold;

    }

    public boolean isGold;

    public double calculateValue() {

        double valueOfMaterial = isGold ? 2000 : 700;
        return valueOfMaterial + (500 * numberOfStones);
    }





    public String property() {
        material = isGold ? "Gold" : "Silver";
        return "Stones: " + numberOfStones + " Material: " + material;
    }
}
