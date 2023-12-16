package app;

import java.util.LinkedList;

public class Main03 {
    public static void main(String[] args) {
        getOutput(showData(getData()));
        getOutput(showEditedData(getData()));

    }

    static LinkedList<String> getData() {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("orange");
        fruits.add("grape");
        fruits.add("apple");
        fruits.add("lemon");
        return fruits;
    }

    static String showData(LinkedList<String> fruits) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Initial list: ");
        int count = 0;
        for (String fruit : fruits) {
            count++;
            sb.append(count).append(") ").append(fruit).append("\n");
        }
        return sb.toString();
    }

    static String showEditedData(LinkedList<String> fruits) {
        fruits.addFirst("plum");
        fruits.addLast("mango");
        StringBuilder sb = new StringBuilder();
        System.out.println("Edited list: ");
        int count = 0;
        for (String fruit : fruits) {
            count++;
            sb.append(count).append(") ").append(fruit).append("\n");
        }
        return sb.toString();

    }

    static void getOutput(String output) {
        System.out.println(output);
    }
}
