import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int userNum = scanner.nextInt();

        if ((userNum % 5 == 0 && userNum % 3 == 0))
            System.out.println("FizzBuzz");
        else if (userNum % 5 == 0)
            System.out.println("Fizz");
        else if (userNum % 3 ==0)
            System.out.println("Buzz");
        else
            System.out.println(userNum);

        //if we put the first if condition output @ line 15/17 the program wouldn't work properly
        //This is because if we used the number 15 as input (expecting "FizzBuzz" as an output)
        //We would only receive "Fizz" as Java evaluates the first if condition and
        //if true then ignores the rest of the selection
    }
}


