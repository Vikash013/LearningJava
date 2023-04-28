import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to this Calculator! Pick one of the following options (1-4): ");
        System.out.println("1. for Addition");
        System.out.println("2. for Subtraction");
        System.out.println("3. for Multiplication");
        System.out.println("4. for Division");

        int choice = input.nextInt();

        System.out.println("Enter your first number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter your second number: ");
        int secondNum = input.nextInt();

        if (choice == 1){
            System.out.println("The answer is " + add(firstNum,secondNum));
        }
        else if(choice ==2){
            System.out.println("The answer is " + subtract(firstNum,secondNum));
        }
        else if(choice ==3){
            System.out.println("The answer is " + multiply(firstNum,secondNum));
        }
        else if (choice ==4){
            System.out.println("The answer is " + divide (firstNum,secondNum));
        }
        else {
            System.out.println("You have picked an incorrect operator");
        }

    }
    public static int add(int x, int y){
        int ans = x + y;
        return ans;
    }
    public static int subtract(int x, int y){
        int ans = x - y;
        return ans;
    }
    public static int multiply(int x, int y){
        int ans = x * y;
        return ans;
    }
    public static int divide(int x, int y){
        int ans = x / y;
        return ans;
    }

}
