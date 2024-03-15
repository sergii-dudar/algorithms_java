package intro.cs.princeton.edu.elements.of.programming;

public class ArraysTests {

    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King", "Ace"
    };

    public static void main(String[] args) {
        // randomsArraysValues();
        final String[] arrays = mergeTwoArrays();
        shufflingAnArray(arrays);
    }

    public static void randomsArraysValues() {
        int i = (int) (Math.random() * RANKS.length);
        int j = (int) (Math.random() * SUITS.length);
        System.out.println(RANKS[i] + " of " + SUITS[j]);
    }

    public static String[] mergeTwoArrays() {
        final String[] deck = new String[RANKS.length * SUITS.length];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                final int index = SUITS.length * i + j; //<<<<<<<<<<<<<<<
                deck[index] = RANKS[i] + " of " + SUITS[j];
                //System.out.println("index: " + index);
            }
        }
        System.out.println(String.join("\n", deck));
        return deck;
    }

    public static void shufflingAnArray(String[] deck) {

        /*final Map<Integer, AtomicInteger> crossing = new HashMap<>();
        final Map<String, AtomicInteger> crossingStrs = new HashMap<>();*/

        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));  //<<<<<<<<<<<<<<<

            /*crossing.computeIfAbsent(r, integer -> new AtomicInteger())
                .incrementAndGet();*/

            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
        System.out.println("------------------------------");
        System.out.println(String.join("\n", deck));
    }
}