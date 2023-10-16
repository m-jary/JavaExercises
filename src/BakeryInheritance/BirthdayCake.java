package BakeryInheritance;

public class BirthdayCake extends Cake {

    public int candles;

    public BirthdayCake() {
        super("chocolate");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
