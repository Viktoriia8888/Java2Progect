package codingExercise2;

import java.util.ArrayList;
import java.util.List;

public class T7 {
    /*You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"*/


    public static void main(String[] args) {
        ArrayList<String> Strings = new ArrayList<>();

        Strings.add("Viktoriia");
        Strings.add("Petro");
        Strings.add("Ali");
        Strings.add("Ahmed");
        for (int i = 0; i < Strings.size(); i++) {
            if (!Strings.get(i).startsWith("A")) {
                Strings.remove(i).toLowerCase();
                i--;
            } else {
                System.out.println(Strings.get(i));
            }
        }
    }
}

