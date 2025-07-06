/* Last modified: 2023-01-30 */

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Blackjack {

    public static int drawCard() {
        Random r = new Random();
        return r.nextInt(12);
    }

    public static String getName(int ID) {
        String cardNames[] = new String[] { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Jack", "Queen", "King" };
        return cardNames[ID];
    }

    public static int getValue(int ID) {
        int cardValues[] = new int[] { 11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };
        return cardValues[ID];
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Hello human! Welcome to Blackjack on a budget. \n You start with 1 moneyz. You can just spawn money because you're the overlord of this \"casino\". \n");
        double moneyz = 1;

        while (moneyz > 0) {
            // Start game
            double bet = 0;
            boolean stood = false;
            int hand = 0;
            int dealerValue = 0;
            int doSomething = 0;
            int doSomethingII = 0;
            String card = "n/a for now";

            System.out.println("\nYou've got " + moneyz
                    + " moneyz left. \n Enter the amount of money you want added to your stash.");
            // while (!in.hasNextDouble()) {
            //     in.nextLine();
            //     System.out.println("That ain't a valid number! Please go again.");
            // }
            // moneyz = moneyz + in.nextInt();
            // System.out.println("You now have " + moneyz + " bank.");

            // Setting bets
            System.out.println("\nHow much money would you like to waste?");
            while (!in.hasNextDouble()) {
                in.nextLine();
                System.out.println("That ain't a valid number! Please go again.");
            }
            bet = in.nextDouble();
            while(bet < 0) {
                System.out.println("Human, how could you waste a negative amount of money? Go again.");
                while (!in.hasNextDouble()) {
                    in.nextLine();
                    System.out.println("That ain't a valid number! Please go again.");
                }
                bet = in.nextDouble();
            }
            while (bet > moneyz) {
                System.out.println("Human, you don't have that much money to feed into my bank account.\n Waste something within your " + moneyz + " budget.");
                while (!in.hasNextDouble()) {
                    in.nextLine();
                    System.out.println("That ain't a valid number! Please go again.");
                }
                bet = in.nextDouble();
            }

            System.out.println("\nAlright, drawing cards.");

            // Dealer's internal crap
            dealerValue = getValue(drawCard());
            doSomething = drawCard();
            dealerValue = dealerValue + getValue(doSomething);

            // Card stuff
            drawCard();
            System.out.println("Your cards: ");
            for (int dr = 0; dr < 2; dr++) {
                doSomethingII = drawCard();
                hand = hand + getValue(doSomethingII);
                System.out.println(getName(doSomethingII));
            }
            System.out.print("Your hand: " + hand);
            System.out.println("\nDealer's revealed card: " + getName(doSomething));

            TimeUnit.SECONDS.sleep(1);

            // Player's actions
            while (!stood) {
                System.out.println("Alright, now what you wanna do? \nActions: 1- Hit, 2- Double bet, 3- Stand");
                while (!in.hasNextDouble()) {
                    in.nextLine();
                    System.out.println("Human, that's not a action. Please choose 1- Hit, 2- Double bet, 3- Stand.");
                }
                int action = in.nextInt();
                if (action == 1) {
                    doSomething = drawCard();
                    hand = hand + getValue(doSomething);
                    card = getName(doSomething);
                    System.out.println("Hit...");
                    if (hand > 21) {
                        stood = true;
                    }
                    System.out.println("You get a " + card + ". Currently, your hand is " + hand + ".");
                } else if (action == 2) {
                    System.out.println("Double...");
                    if (bet * 2 > moneyz) {
                        System.out.println("Human, you don't have that much money to feed into my bank account.");
                    } else {
                        bet = bet * 2;
                        System.out.println("Okay human, you're now wasting " + bet + " moneyz.");
                    }

                } else if (action == 3) {
                    System.out.println("Stand...");
                    stood = true;
                }
            }

            // Dealer's stuff
            dealerValue = getValue(drawCard());
            while (dealerValue < 17) {
                dealerValue = dealerValue + getValue(drawCard());
            }

            // Determining outcome
            System.out.println(" ");
            if (dealerValue > 21) {
                System.out.println("Human! The dingus dealer has busted! You win " + bet + " moneyz. ");
                moneyz = moneyz + bet;
            } else if (hand > 21) {
                System.out.print("Ya bust ya dingus!! \nYou lose your " + bet);
                moneyz = moneyz - bet;
            } else if (hand == 21) {
                bet = bet + bet*.5;
                System.out.println("Human! You got a blackjack. You win " + bet + " moneyz.");
                moneyz = moneyz + bet;
            } else if(dealerValue == 21) {
                bet = bet + bet*.5;
                System.out.println("Human! Dealer got a blackjack. You lose " + bet + " moneyz.");
                moneyz = moneyz - bet;
            } else if (dealerValue > hand) {
                System.out.println("Dealer wins with a " + dealerValue + " You've lost " + bet + " moneyz.");
                moneyz = moneyz - bet;
            } else if (dealerValue < hand) {
                System.out.println("You win! You get " + bet + " moneyz.");
                System.out.println("Dealer had " + dealerValue + ", you had " + hand);
                moneyz = moneyz + bet;
            } else if (dealerValue == hand) {
                System.out.println("Push. How uneventful.");
            }

            TimeUnit.SECONDS.sleep(1);
            System.out.println("\n \n-------------------=====0=====-------------------");

        }

        System.out.println(
                "\nWell human, it seems like you've ran out of money to gamble. That'll conclude this session of gambling, thanks for feeding my wallet. \n c:");
    }
}