package app;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;


public class Main01 {
    public static void main(String[] args) {
        getOutput(showData(getData()));
        getOutput(sortData(getData()));

    }

    static List<String> getData() {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Robert");
        names.add("Lisa");
        names.add("David");
        names.add("Amanda");
        return names;
    }

    static String showData(List<String> names) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Initial list: ");
        int count = 0;
        for (String element : names) {
            count++;
            stringBuilder.append(count).append(") ").append(element).append("\n");

        }
        return stringBuilder.toString();

    }

    static String sortData(List<String> names) {
        names.sort(Comparator.naturalOrder());
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("Sorted list: ");
        int count = 0;
        for (String element : names) {
            count++;
            stringBuilder.append(count).append(") ").append(element).append("\n");
        }
        return stringBuilder.toString();


    }
    static void getOutput(String output) {
        System.out.println(output);
    }
}
