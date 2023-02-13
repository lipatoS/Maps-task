package task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Integer> map = new HashMap<>();;

    public static void main(String[] args) {
        getMap(map);
        enterData(map, scannerData());

    }

    private static void getMap(Map<String, Integer> maps) {
        maps.put("orange", 10);
        maps.put("plum", 20);
        maps.put("grape", 30);
        maps.put("apple", 40);
        maps.put("lemon", 50);
    }

    private static String scannerData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product: ");
        return scanner.nextLine();
    }

    private static void enterData(Map<String, Integer> maps, String product) {
        boolean hasContain = maps.containsKey(product);
        if (hasContain) {
            String key = String.valueOf(maps.get(product));
            System.out.println(product + " - " + key);
        } else
            System.out.println(product + " - missing from the list");
    }
}