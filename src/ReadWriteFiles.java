import java.io.*;

public class ReadWriteFiles {
    public static void main(String[] args) {
        //WRITING TO A FILE
        String [] names = {"John", "Carl", "Jerry"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello there!");
            writer.write("\nHere's another line");
            for (String name: names){
                writer.write("\n" + name);
            }
            writer.close(); //need to make sure we close the file after writing/reading to it
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //READING A FILE
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null){ //this will loop through every line until there isn't any left to read
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
