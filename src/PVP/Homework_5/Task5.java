package PVP.Homework_5;

import java.util.HashMap;
import java.util.Map;


public class Task5 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Мобильные телефоны", 7298);
        map.put("Умные часы и браслеты", 1760);
        map.put("Чехлы для телефонов", 1882);
        map.put("Аккумуляторы", 2186);
        map.put("Bluetooth-гарнитуры", 363);
        map.put("Портативные зарядные устройства", 2077);
        map.put("Палки для селфи", 306);
        map.put("Самозаряжающиеся телефоны", 0);
        map.put("Наушники и гарнитуры", 7172);

        map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}

