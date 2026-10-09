package set_map_queue_priorityqueue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class StudentMarksSystem {
    static void main(String[] args) {
        HashMap<String,Integer> marksSystem = new HashMap<>();
        marksSystem.put("Daenerys",100);
        marksSystem.put("Arya",97);
        marksSystem.put("Cersi",80);
        marksSystem.put("Jon",95);
        marksSystem.put("Tyrion",90);
        System.out.println(marksSystem);

        LinkedHashMap<String,Integer> marksSystem1 = new LinkedHashMap<>();
        marksSystem1.put("Daenerys",100);
        marksSystem1.put("Arya",97);
        marksSystem1.put("Jon",95);
        marksSystem1.put("Tyrion",90);
        marksSystem1.put("Cersi",80);
        System.out.println(marksSystem1);

       TreeMap<String,Integer> marksSystem2 = new TreeMap<>();
        marksSystem2.put("Daenerys",100);
        marksSystem2.put("Arya",97);
        marksSystem2.put("Jon",95);
        marksSystem2.put("Tyrion",90);
        marksSystem2.put("Cersi",80);
        System.out.println(marksSystem2);
    }
}
