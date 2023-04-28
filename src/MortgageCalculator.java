import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        int principleLoan;
        double monthlyInterest = 0;
        int numberOfPayments = 0;
        int period;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter principle/amount of loan you want ($1K - $1M): ");
            principleLoan = scanner.nextInt();
            if (principleLoan >= 1000 && principleLoan <= 1_000_000)
                break;
            System.out.println("Enter a value between $1K - $1M");
        }

        double annualInterest;
        while (true) {
            System.out.print("Enter annual interest rate: ");
            annualInterest = scanner.nextDouble();
            if (annualInterest > 0 && annualInterest <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        System.out.print("Enter period/years: ");
        while (true) {
            period = scanner.nextInt();
            if (period >= 1 && period <= 30)
                break;
            System.out.println("Enter a value between 1 and 30");
        }

        numberOfPayments = period * MONTHS_IN_YEAR;
        monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principleLoan
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Your monthly mortgage is: " + mortgageFormatted);


        /* this is the same program as above but WITHOUT data validation
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;
        Scanner scanner = new Scanner (System.in);

        System.out.print("Enter principle/amount of loan you want: ");
        int principleLoan = scanner.nextInt();

        System.out.print("Enter annual interest rate: ");
        double annualInterest = scanner.nextDouble();
        double monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Enter period/years: ");
        int period = scanner.nextInt();
        int numberOfPayments = period*MONTHS_IN_YEAR;

        double mortgage = principleLoan
                    * (monthlyInterest * Math.pow(1+monthlyInterest,numberOfPayments))
                    / (Math.pow(1+monthlyInterest, numberOfPayments));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Your monthly mortgage is: " + mortgageFormatted);

         */

    }
}
