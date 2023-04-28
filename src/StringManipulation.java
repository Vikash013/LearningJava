import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to be reversed: ");
        String input = scan.next();
        String reversedStr = reverse(input);
        System.out.println(reversedStr);

    }
    public static String reverse (String s){
        char[] letters = new char[s.length()];

        int lettersIndex = 0;
        for (int i = s.length() - 1; i >=0; i--){
            letters [lettersIndex] = s.charAt(i);
            lettersIndex++;
        }
        String reverse = "";
        for (int i = 0; i <s.length(); i++){
            reverse = reverse + letters[i];
        }
        return reverse;
    }
}
