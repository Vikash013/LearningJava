import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to this prime number checker.");
        System.out.println("Enter a number: ");
        int userNum = input.nextInt();
        int count = 0;

        if (userNum > 1) {
            for (int i = 1; i <= userNum; i++) {
                if (userNum % i == 0)
                    count++;
            }

            if (count == 2)
                System.out.println(userNum + " is a prime number");
            else
                System.out.println(userNum + " is not a prime number");
        } else {
            System.out.println("Not a valid number");
        }
    }
}