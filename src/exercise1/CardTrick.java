package Exercise1;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * A class that fills a hand of 7 cards with random Card objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card.
 * To be used as starting code in Exercise.
 *
 * @author dancye
 * @author Paul Bonenfant
 * @date Jan 25, 2022
 */
public class CardTrick {

    public static void main(String[] args) {
       
       

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue(generateRandomNumber(1, 13));
            card.setSuit(Card.SUITS[generateRandomNumber(0, 3)]);
            hand[i] = card;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your card value (1-10, 11 for Jack, 12 for Queen, 13 for King): ");
        int value = scanner.nextInt();
        System.out.print("Enter your card suit (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades): ");
        int suit = scanner.nextInt();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(Card.SUITS[suit - 1]);

        boolean matchFound = false;

        for (Card card : hand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                matchFound = true;
                break;
            }
        }

        if (matchFound) {
            printInfo();
        } else {
            System.out.println("Sorry, no match found.");
        }
    }

    private static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    private static void printInfo() {
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        System.out.println("My name is Mankirat Singh, but you can call me Mankirat");
        System.out.println();
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on Social Media");
        System.out.println("-- Being a Software Engineer");
        System.out.println();
        System.out.println("My hobbies:");
        System.out.println("-- Playing Outdoor Games");
        System.out.println("-- Driving");
        System.out.println("-- Watching TV");
        System.out.println("-- Gardening");
        System.out.println();
    }
}

