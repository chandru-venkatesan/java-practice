package multithreading_filehandling;

import java.io.*;
import java.util.ArrayList;

public class UserProfileSystem {

    public static void main(String[] args) {

        String fileName = "profile.txt";

        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("Name: John Doe\n");
            fw.write("Age: 22\n");
            fw.write("City: New York\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("Error writing profile");
        }


        System.out.println("Initial Profile:");
        readProfile(fileName);


        updateAge(fileName, 23);


        System.out.println("\nUpdated Profile:");
        readProfile(fileName);
    }


    static void readProfile(String fileName) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error reading profile");
        }
    }


    static void updateAge(String fileName, int newAge) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            ArrayList<String> lines = new ArrayList<>();
            String line;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Age:")) {
                    lines.add("Age: " + newAge);
                } else {
                    lines.add(line);
                }
            }
            br.close();

            FileWriter fw = new FileWriter(fileName);
            for (String l : lines) {
                fw.write(l + "\n");
            }
            fw.close();

        } catch (Exception e) {
            System.out.println("Error updating age");
        }
    }
}
