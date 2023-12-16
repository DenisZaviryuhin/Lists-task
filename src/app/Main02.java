package app;

import java.util.List;
import java.util.ArrayList;

public class Main02 {
    public static void main(String[] args) {
        getOutput(showData(getData()));
        getOutput(showPartData(getData()));

    }

    static List<String> getData() {
        List<String> products = new ArrayList<>();
        products.add("orange");
        products.add("mango");
        products.add("banana");
        products.add("apple");
        products.add("kiwi");
        products.add("cherry");
        return products;
    }

    static String showData(List<String> products) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Initial list: ");
        int count = 0;
        for (String product : products) {
            count++;
            sb.append(count).append(") ").append(product).append("\n");

        }
        return sb.toString();
    }

    static String showPartData(List<String> products) {
        StringBuilder sb = new StringBuilder();
        System.out.println("List part: ");
        int count = 0;
        for (String product : products.subList(1, 3)) {
            count++;
            sb.append(count).append(") ").append(product).append("\n");
        }
        return sb.toString();
    }

    static void getOutput(String output) {
        System.out.println(output);
    }

}
