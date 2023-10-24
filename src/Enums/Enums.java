package Enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class Enums {
    public static class Card{
        RANK rank;
        SUITE suite;
        public Card(RANK rank, SUITE suite){
            this.rank = rank;
            this.suite = suite;
        }
    }
    public enum SUITE{
        HEART(0, "heart"),
        SPADE(1, "spade");

        private final int value;
        private final String name;

        SUITE(final int newValue, final String newName) {
            value = newValue;
            name = newName;
        }

        public int getValue() { return value; }

        public String getName() { return name; }
    }
    public enum RANK{
        TWO(2, "two"),
        THREE(3, "three");

        private final int value;
        private final String name;

        RANK(final int newValue, final String newName) {
            value = newValue;
            name = newName;
        }

        public int getValue() { return value; }

        public String getName() { return name; }
    }

    public static void main(String[] args) {
        System.out.println(RANK.TWO.getValue());
        System.out.println(RANK.TWO.getName());
        ArrayList<Card> hand = new ArrayList<>(Arrays.asList(
                new Card(RANK.TWO, SUITE.HEART),
                new Card(RANK.TWO, SUITE.SPADE),
                new Card(RANK.THREE, SUITE.SPADE),
                new Card(RANK.THREE, SUITE.HEART),
                new Card(RANK.THREE, SUITE.HEART),
                new Card(RANK.TWO, SUITE.SPADE),
                new Card(RANK.TWO, SUITE.HEART)
        ));
        HashMap<SUITE, Integer> countSuits = new HashMap<>();

        for(int i=0; i<hand.size(); i++){
            Card card = hand.get(i);
            if (!countSuits.containsKey(card.suite)) {
                countSuits.put(card.suite, 1);
            } else {
                countSuits.put(card.suite, countSuits.get(card.suite) + 1);
            }
        }
        System.out.println(countSuits);
    }
}
