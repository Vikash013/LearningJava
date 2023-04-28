import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 100) + 1;
        int tries = 0;
        boolean win = false;
        System.out.println("Welcome to the number guessing game!");

        while (win == false){
            System.out.println("Guess a number between 1 and 100!");
            int choice = input.nextInt();
            tries ++;

            if (choice == randomNum) {
                win = true;
            }
            else if (choice > randomNum){
                System.out.println("Too high!");
            }
            else {
                System.out.println("Too low!");
            }
        }
        System.out.println("Congratulations, you have won!");
        System.out.println("The number was " + randomNum);
        System.out.println("It took you " + tries + " try/tries");
    }
}
