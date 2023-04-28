import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        HashMap <String, Integer> employeeIDs = new HashMap<>();
        //links keys to values - <keys, values>

        employeeIDs.put("John", 12345);
        employeeIDs.put("Carl", 54321);
        employeeIDs.put("Jerry", 8679309);

        System.out.println(employeeIDs); //note - does not output in order

        System.out.println(employeeIDs.get("Carl")); //outputs Carl's ID number

        System.out.println(employeeIDs.containsKey("Jerry")); //checks if Jerry is in the hashmap - true
        System.out.println(employeeIDs.containsKey("George")); //checks if George is in the hashmap - false
        System.out.println(employeeIDs.containsValue(6)); //checks if 6 is in the hashmap - false
        System.out.println(employeeIDs.containsValue(8679309)); //checks if 8679309 is in the hashmap - true

        employeeIDs.put("John", 98765);
        System.out.println(employeeIDs); //notice how John's ID number is updated as he already existed
        //i.e put will add if it doesn't exist already or updates if does already exist

        employeeIDs.remove("Jerry");
        System.out.println(employeeIDs);
    }

}
