package BakeryInheritance;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake = new Cake();
        cake.setPrice(29.99);
        System.out.println("Cake flavour: " + cake.getFlavour());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(7);
        System.out.println("Birthday cake flavour: " + birthdayCake.getFlavour());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());
        System.out.println("Number of candles on birthday cake: " + birthdayCake.getCandles());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavour("pina colada");
        weddingCake.setPrice(350);
        weddingCake.setTiers(3);
        System.out.println("Wedding cake flavour: " + weddingCake.getFlavour());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
        System.out.println("Number of tiers: " + weddingCake.getTiers());
    }
}
