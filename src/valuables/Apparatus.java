package valuables;

public class Apparatus extends Valuable {

    private int retailPrice;

    private int wearNumber;



    public Apparatus(String name, int retailPrice, int wearNumber) {
        super (name);
        this.retailPrice = retailPrice;
        if (wearNumber < 0){
            this.wearNumber = 1;
        }
        else if (wearNumber > 10){
            this.wearNumber = 10;
        }
        else {
            this.wearNumber = wearNumber;
        }
    }

    public int getRetailPrice(){
        return retailPrice;
    }

    public int getWearNumber(){
        return wearNumber;
    }

    public double calculateValue() {
        return retailPrice * wearNumber / 10;
    }

    public String property() {
        return ("Retail value: " + retailPrice + " Wear: " + wearNumber);
    }

}
