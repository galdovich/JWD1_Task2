package PVP.Homework_5.task4;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        Set<Student> set = new TreeSet<>();

        //adding 6 different student objects
        set.add(new Student("Андрей", "Голуб"));
        set.add(new Student("Максим", "Метелица"));
        set.add(new Student("Карина", "Королько"));
        set.add(new Student("Анжела", "Максимчук"));
        set.add(new Student("Андрей", "Алексеев"));
        set.add(new Student("Сергей", "Дмитриев"));

        System.out.println("--------- Список студентов ----------");
        for (Student student : set) {
            System.out.println(student);
        }

        //removing of even elements
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            count++;
            if (count % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println();
        System.out.println("--------- Список студентов после первого курса ----------");
        for (Student student : set) {
            System.out.println(student);
        }
    }
}
