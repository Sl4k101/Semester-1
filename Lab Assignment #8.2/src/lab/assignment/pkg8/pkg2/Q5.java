
package lab.assignment.pkg8.pkg2;

public class Q5 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        int picks = 0;

        // Initialize the deck with card values
        for (int i = 0; i < 52; i++) {
            deck[i] = (i % 13) + 1;
        }

        while (true) {
            int sum = 0;
            int[] pickedCards = new int[4];

            // Pick four random cards
            for (int i = 0; i < 4; i++) {
                int randomIndex;
                do {
                    randomIndex = (int) (Math.random() * deck.length);
                } while (deck[randomIndex] == 0); // Ensure the card is not already picked
                pickedCards[i] = deck[randomIndex];
                deck[randomIndex] = 0; // Mark the card as picked
                sum += pickedCards[i];
            }

            // Check if the sum is 24
            if (sum == 24) {
                System.out.println("Picks required to get a sum of 24: " + (picks + 1));
                break;
            }

            picks++;
        }
    }
}
