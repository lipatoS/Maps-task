package task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        getMap(map);
        getInfo(map);
        System.out.println("\n************\n");
        valueReplacement(map);
        addNewProduct(map);
        getInfo(map);

    }

    private static void getMap(Map<String, Integer> maps) {
        maps.put("orange", 10);
        maps.put("plum", 20);
        maps.put("grape", 30);
        maps.put("apple", 40);
        maps.put("lemon", 50);
    }

    private static void valueReplacement(Map<String, Integer> maps) {
        maps.replace("orange", 100);
    }

    // не знаю почему он добавляет новый обьект в середину словаря
    private static void addNewProduct(Map<String, Integer> maps) {
        maps.putIfAbsent("banana", 3);
    }

    private static void getInfo(Map<String, Integer> maps) {
        maps.forEach((key, value) -> System.out.println(key + " " + value));
    }
}