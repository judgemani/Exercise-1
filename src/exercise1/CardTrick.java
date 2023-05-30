package exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random = new Random();
            card.setValue(random.nextInt(13) + 1);
            card.setSuit(random.nextInt(4));
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of the card (1-13): ");
        int value = scanner.nextInt();
        
        System.out.print("Enter the suit of the card (0-3): ");
        int suit = scanner.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        boolean found = false;
        
        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulations, you guessed right!");
            printInfo();
        } else {
            System.out.println("Sorry, the card was not found.");
        }
    }

    /**
     * A simple method to print out personal information.
     */
    private static void printInfo() {
        
        System.out.println("My name is Mankirat");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be a programmer");
 
        System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Travelling");
        System.out.println("-- Playing");
        System.out.println("-- Watching TV");
        System.out.println("-- Reading  ");

        System.out.println();
    }
}
