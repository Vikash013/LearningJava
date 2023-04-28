import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        int atmnumber = 12345;
        int atmpin = 123;

        verifyLogin (atmnumber, atmpin);

        }
    public static void verifyLogin (int atmnumber, int atmpin){
        Scanner scanner = new Scanner (System.in);
        double currentBalance = 0;
        System.out.println("Welcome to the Java ATM. Please enter your username and pin.");

        System.out.println("Enter you ATM number: ");
        int atmNumber = scanner.nextInt();
        System.out.println("Enter your ATM pin");
        int atmPin = scanner.nextInt();

        if ((atmNumber == atmnumber) && (atmPin == atmpin)){

            while (true){
                System.out.println("1. View Available Balance \n2. Withdraw Amount \n3. Deposit Amount \n4. Exit");
                System.out.println("Enter choice: ");
                int choice = scanner.nextInt();
                if (choice == 1){
                    System.out.println("Available Balance is: £" + currentBalance);
                }
                else if (choice == 2){
                    System.out.println("Enter how much you would like to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > currentBalance){
                        System.out.println("You cannot withdraw more money than you have available.");
                    }
                    else {
                        System.out.println("Your have successfully withdrawn £" + withdrawAmount);
                        currentBalance = currentBalance - withdrawAmount;
                        System.out.println("Your current balance is now £" + currentBalance);
                    }
                }
                else if (choice == 3){
                    System.out.println("Enter how much you would like to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    System.out.println("£" + depositAmount + " has been successfully deposited into your account");
                    currentBalance = currentBalance + depositAmount;
                }
                else if (choice == 4){
                    System.out.println("Please collect your ATM card, thank you for using the Java ATM.");
                    System.exit(0);
                }
                else {
                    System.out.println("Please enter a correct choice.");
                }
            }
        }
        else {
            System.out.println("ATM number and or pin number incorrect.");
            System.exit(0);
        }
    }
    
}
