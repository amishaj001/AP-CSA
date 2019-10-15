/*

Amisha Jain
AP CSA P2
10-8-19

Write a program that takes user input describing a playing card in the following
shorthand notation:
A       Ace
2..10   Card Values
J       Jack
Q       Queen
K       King
D       Diamonds
H       Hearts
S       Spades
C       Clubs

Your program should print the full description of the card. For example,
  Enter the card notation: QS
  Queen of Spades

Implement a class Card whose constructor takes the card notation string and
whose getDescription method returns a description of the card. If the notation
string is not in the correct format, the getDescription method should return the
string "Unknown."

*/
import java.util.Scanner;

public class CardShorthand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the card notation: " );
        String card = input.nextLine();
        input.close();

        char rank = card.charAt(0);
        char suit = card.charAt(1);

        String cardName = "";

        if (rank == 'A') {
            cardName += "Ace";
        }
        else if (rank == 'J') {
            cardName += "Jack";
        }
        else if (rank == 'Q') {
            cardName += "Queen";
        }
        else if (rank == 'K') {
            cardName += "King";
        }
        else {
            cardName += rank;
        }

        cardName += " of ";

        if (suit == 'S') {
            cardName += "Spades";
        }
        else if (suit == 'D') {
            cardName += "Diamonds";
        }
        else if (suit == 'H') {
            cardName += "Hearts";
        }
        else if (suit == 'C') {
            cardName += "Clubs";
        }

        System.out.println(cardName);
    }
}
