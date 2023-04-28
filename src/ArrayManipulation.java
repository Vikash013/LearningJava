import java.util.Arrays;
import java.util.List;

public class ArrayManipulation {

    public static void main(String[] args) {

        /* 1) asList - Turning an array into a list (gives more functionality/flexibility

        String [] arr = {"chicken", "bacon", "avocado"};

        List<String> list = Arrays.asList(arr); //(creating a list variable) = (returns array as a list)

        for (String s : list) {
            System.out.print(s + " ");
        }
         */



        /* 2) fill - Sets all values in our array to the same value - in this case, 100

        int [] arr = new int [5];

        Arrays.fill(arr,100);

        for (Integer i : arr){
            System.out.print(i + " ");
        }
        */



        /* 3) copy - Will copy the contents of one array to another
        int [] arr1 = new int [5];
        int [] arr2 = Arrays.copyOf(arr1, arr1.length);
         */



        /* 4) equals - Will return compare two arrays and return a boolean value
        String [] arr1 = {"bacon", "lettuce", "tomato"};
        String [] arr2 = {"bacon", "lettuce", "tomato"};

        System.out.println(Arrays.equals(arr1,arr2)); //will return true
         */



        /* 5) sort - Will sort the array
        int [] arr1 = {7, 5, 4, 32, 12};

        Arrays.sort(arr1);

        for (int i : arr1) {
            System.out.print(i + " ");
        }
         */



        /* 6) binary search - Will find the position of a value in a SORTED array
        int [] arr1 = {4, 5, 7, 12, 32};

        System.out.println(Arrays.binarySearch(arr1, 12));
        //binary search only works if the array is sorted
        //will return 3 as 12 is at index 3 of the array
        // if not sorted or try to find a value that's not in the array it does not work
        */

    }

}
