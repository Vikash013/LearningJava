import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args) {

        String [] friendsArray = new String[4]; //first way to declare an array - note that once the size is chosen it cannot grow/shrink
        String [] friendsArray2 = {"John", "Chris", "Eric", "Luke"}; //second way to declare an array - note that we don't have to declare the size this way

        ArrayList <String> friendsArrayList = new ArrayList<>(); //how to declare an array list - do not have to declare size
        ArrayList <String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke")); //another way to declare an array list

        //big difference is that Array Lists CAN change size but an array cannot

        //arrays can hold primitive data types
        //array lists can only hold objects (but supports wrapper types for primitive data types -
        //so instead of using int we would use <Integer>, <Long>, <Boolean> etc.)

        System.out.println(friendsArray2[1]);
        System.out.println(friendsArrayList2.get(1));
        //difference of how we retrieve data

        System.out.println(friendsArray2.length);
        System.out.println(friendsArrayList2.size());
        //difference of how we get the length

        friendsArrayList2.add("Mitch");
        //we can add items to an array list but not to an array

        friendsArrayList2.remove("Eric");
        friendsArrayList2.remove(2);
        //removing items from an array list, again something you cannot do with an array

        friendsArray2 [0] = "Carl";
        System.out.println(friendsArray2[0]);
        //setting an element - see how John has changed to Carl
        friendsArrayList2.set(0, "Carl");
        System.out.println(friendsArrayList2.get(0));
        //setting an element for array list - see how John has changed to Carl

        System.out.println(friendsArray2);
        //pretty useless - will output the memory locations of the items
        //to output the items of an array we need to use a for loop to loop through the entire array
        System.out.println(friendsArrayList2);
        //will output the items of the array list



    }

}
