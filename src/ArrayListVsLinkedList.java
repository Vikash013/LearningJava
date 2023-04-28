import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {

        LinkedList <String> namesLinkedList = new LinkedList<>();
        ArrayList <String> namesArrayList = new ArrayList<>();
        //declaration between Linked Lists= and Array List

        //Array List are better when:
        //you need to get a item at a certain index (especially the bigger the list is)
        //if we need to get the 150th item, an array list can just retrieve it
        //however, linked list need to start at its first node and keep going until it reaches the 150th item

        //Linked List is better when:
        //you are adding or removing items at certain positions
        //Linked Lists can just insert/remove and shift everything accordingly
        //however, Array Lists need to create a whole new Array List just to do this which takes time

    }

}
