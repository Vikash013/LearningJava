import java.io.*;
import java.util.*;

public class LoginForm {
    // Map to store registered users
    private static Map<String, String> users = new HashMap<>();

    public static void main(String[] args) {
        // Load the registered users from the file
        loadUsers();

        // Ask the user if they want to register or login
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to register or login?");
        String response = input.nextLine();

        if (response.equalsIgnoreCase("register")) {
            // Ask the user for their username and password
            System.out.println("Enter your desired username:");
            String username = input.nextLine();
            System.out.println("Enter your desired password:");
            String password = input.nextLine();

            // Check if the username is already taken
            if (users.containsKey(username)) {
                System.out.println("Username is already taken.");
            } else {
                // Register the user
                users.put(username, password);
                saveUsers();
                System.out.println("User registered successfully.");
            }
        } else if (response.equalsIgnoreCase("login")) {
            // Ask the user for their username and password
            System.out.println("Enter your username:");
            String username = input.nextLine();
            System.out.println("Enter your password:");
            String password = input.nextLine();

            // Check if the username and password are correct
            if (users.containsKey(username) && users.get(username).equals(password)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Invalid username or password.");
            }
        } else {
            System.out.println("Invalid response.");
        }
    }

    // Method to load registered users from the file
    private static void loadUsers() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                users.put(parts[0], parts[1]);
            }
            reader.close();
        } catch (IOException e) {
            // File doesn't exist, so just continue
        }
    }

    // Method to save registered users to the file
    private static void saveUsers() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt"));
            for (Map.Entry<String, String> entry : users.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred while saving the users.");
        }
    }
}