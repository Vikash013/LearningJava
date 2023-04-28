import java.util.Scanner;

public class BudgetApp {

    static Scanner input = new Scanner(System.in);
    static double totalBudget, expenses, enteredExpense;
    static int monthChoice;
    static int userChoice;
    static String January, February, March, April, May, June, July, August, September, October, November, December;
    static double janBudget, febBudget, marBudget, aprBudget, mayBudget, junBudget, julBudget, augBudget, sepBudget, octBudget, novBudget, decBudget;


    public static void main(String[] args) {

        System.out.println("Welcome to the Java Budget Application!");
        System.out.println("To begin with, enter the budget you would be using per month. £: ");
        totalBudget = input.nextDouble();
        selectMonth();

    }
        public static void selectMonth(){
            System.out.println("1. January, 2. February, 3. March");
            System.out.println("4. April, 5. May, 6  June");
            System.out.println("7. July, 8. August, 9. September");
            System.out.println("10. October, 11. November, 12. December");
            System.out.println("Select a month from 1-12 (or 0 to terminate): ");
            monthChoice = input.nextInt();

            if (monthChoice == 1) {
                monthMenu(January, janBudget);
            }
            else if (monthChoice == 2){
                monthMenu(February, febBudget);
            }
            else if (monthChoice == 3){
                monthMenu(March, marBudget);
            }
            else if (monthChoice == 4){
                monthMenu(April, aprBudget);
            }
            else if (monthChoice == 5){
                monthMenu(May, mayBudget);
            }
            else if (monthChoice == 6){
                monthMenu(June, junBudget);
            }
            else if (monthChoice == 7){
                monthMenu(July, julBudget);
            }
            else if (monthChoice == 8){
                monthMenu(August, augBudget);
            }
            else if (monthChoice == 9){
                monthMenu(September, sepBudget);
            }
            else if (monthChoice == 10){
                monthMenu(October, octBudget);
            }
            else if (monthChoice == 11){
                monthMenu(November, novBudget);
            }
            else if (monthChoice == 12){
                monthMenu(December, decBudget);
            }
            else if (monthChoice == 0){
                System.out.println("Thank you for using the Java Budget Application.");
                System.exit(0);
            }
            else {
                System.out.println("Incorrect option.");
                selectMonth();
            }

        }

        public static void monthMenu(String month, double monthBudget){
            totalBudget = monthBudget;
            System.out.println("Month: " + month);
            System.out.println("Total Budget: " + monthBudget);
            System.out.println("Remaining Budget: " + (monthBudget - expenses));
            System.out.println("--------------------");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Go back to month selector");
            userChoice = input.nextInt();
            if (userChoice == 1){
                System.out.println("Enter an expense: £");
                enteredExpense = input.nextDouble();
                expenses = expenses + enteredExpense;
                monthMenu(month, monthBudget);
            }
            else if (userChoice == 2){
                System.out.println("Enter an expense to remove: £");
                enteredExpense = input.nextDouble();
                expenses = expenses - enteredExpense;
                monthMenu(month, monthBudget);
            }
            else if (userChoice == 3){
                selectMonth();
            }
            else {
                System.out.println("Incorrect option.");
                System.exit(0);
            }

        }

}