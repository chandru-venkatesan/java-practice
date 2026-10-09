package set_map_queue_priorityqueue;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LoginSystem {
    static void main(String[] args) {
        HashSet<String> userNames = new HashSet<>();
        userNames.add("Joe");
        userNames.add("Meredith");
        userNames.add("Callie");
        userNames.add("Baily");
        userNames.add("Joe");
        System.out.println(userNames);

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Joe");
        names.add("Meredith");
        names.add("Callie");
        names.add("Baily");
        names.add("Joe");
        System.out.println(names);


        TreeSet<String> n = new TreeSet<>();
        n.add("Joe");
        n.add("Meredith");
        n.add("Callie");
        n.add("Baily");
        n.add("Joe");
        System.out.println(n);
    }
}
