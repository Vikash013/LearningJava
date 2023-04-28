import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will check if your string is a palindrome");
        System.out.println("Enter a string: ");

        String userStr = input.next();
        userStr = userStr.replace("",""); //gets rid of spaces
        String reverse = "";

        for (int i = userStr.length() - 1; i >= 0 ; i--){
            reverse += userStr.charAt(i);
            System.out.println(reverse);
        }

        boolean palindrome = true;
        for (int i =0; i < userStr.length(); i++){
            if (userStr.charAt(i) != reverse.charAt(i)){
                palindrome = false;
            }
        }

        if (palindrome)
            System.out.println(userStr + " is a palindrome");
        else
            System.out.println(userStr + " is not a palindrome");
    }
}
