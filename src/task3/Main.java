package task3;

import java.util.LinkedHashMap;

public class Main {
    static LinkedHashMap<String, String> contactsMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        getData(contactsMap);
        getInfo(contactsMap);
        System.out.println("*****************************************************");
        changeEmail(contactsMap);
        getInfo(contactsMap);
    }
    private static void getData(LinkedHashMap<String, String> maps) {
        maps.put("Nicolas Cage", "Nicolas.Cage@gmail.com");
        maps.put("Elijah Jordan Wood", "Elijah.Jordan.Wood@gmail.com");
        maps.put("Edward Thomas Hardy", "Edward.Thomas.Hardy@gmail.com");
    }
    private static void getInfo(LinkedHashMap<String, String> maps) {
        maps.forEach((key, value) -> System.out.println(key + " : " + value));
    }
    private static void changeEmail(LinkedHashMap<String, String> maps){
        maps.replace("Edward Thomas Hardy", "Edward.Thom.Hardy@gmail.com");
    }
}
