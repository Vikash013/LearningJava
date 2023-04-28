import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetAndHashSet {

    public static void main(String[] args) {

        //Sets do not contain duplicates and do not have a particular order

        Set<String> names = new HashSet<>();

        Set<String> names2 = new TreeSet<>(); //orders items however slower
        Set<String> names3 = new LinkedHashSet<>(); //maintains insertion order of items, faster tham treeset but slower than hashset

        names.add("Walter");
        names.add("Jesse");
        names.add("Skyler");
        names.add("Mike");
        names.add("Saul");

        names.remove("Walter");

        names.remove(1);
        //note how there is no error but this will not remove any items

        System.out.println(names);
        //note how printing the set does not show in order, unlike lists

        System.out.println(names.size());

        System.out.println(names.contains("Saul"));
        System.out.println(names.contains("Gus"));

        for (String name: names){
            System.out.println(name);
        }

        names.forEach(System.out::println);

        names.clear();
        System.out.println(names);

    }
}
