import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] compArray = {"r", "p", "s"};

        while (true) {

            System.out.println("Enter your move (r, p or s)");
            String playerMove = scanner.next();
            String compMove = compArray[new Random().nextInt(compArray.length)];

            while (true) {
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid option, enter from r, p or s");
                playerMove = scanner.next();
            }

            System.out.println("Computer played: " + compMove);

            if (playerMove.equals(compMove)) {
                System.out.println("Tie!");
            } else if (playerMove.equals("r")) {
                if (compMove.equals("s")) {
                    System.out.println("You win!");
                } else if (compMove.equals("p")) {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equals("p")) {
                if (compMove.equals("r")) {
                    System.out.println("You win!");
                } else if (compMove.equals("s")) {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equals("s")) {
                if (compMove.equals("p")) {
                    System.out.println("You win!");
                } else if (compMove.equals("r")) {
                    System.out.println("You lose!");
                }
            }

            System.out.println("Play again? (y/n) ");
            String playAgain = scanner.next();

            if (playAgain.equals("n")){
                break;
            }

        }

        scanner.close();

    }

}
