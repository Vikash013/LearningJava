
public class ReadersAndWriters {

    public static void main(String[] args) {

        try {
            int myInt = Integer.parseInt("hello");
        }
        catch (Exception e){
            System.out.println("You cannot make a word into a number!");
            //if the try statement worked e.g. myInt = 1; then the catch statement would not be executed
        }
        finally {
            System.out.println("This is a statement that will always execute whether there is an exception or not");
            //finally is not used often, in most cases all that's needed is a try and catch
        }


    }

}

/*

FileReader - Convenience class for reading character files, can only read one char at a time not lines

FileWriter - Convenience class for writing character files

BufferedReader - Can read files as well as be used to read data from any char stream
Can read chars + lines, is more efficient and faster than FileReader

BufferedWriter - Can write to files and is more efficient

Exception - An unwanted event that interrupts the flow of a program

 */