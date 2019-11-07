package PVP.Homework_5.Tasks1_3;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // creating LinkedList
        List<Book> list = createLinkedList(3);
        System.out.println("Количество книг в LinkedList: " + list.size());
        for (Book a : list) {
            System.out.println(a);
        }
        //removing book number 2
        list.remove(1);
        //output
        System.out.println();
        System.out.println("Количество книг в LinkedList после удаления: " + list.size());
        for (Book a : list) {
            System.out.println(a);
        }

        // creating HashSet
        Set<Book> set = createHashSet(25);
        System.out.println();
        System.out.println("Общее количество книг в библиотеки (с учетом повторяющихся книг): " + 25);
        System.out.println("Количество книг в HashSet: " + set.size());
        for (Book book : set) {
            System.out.println(book);
        }

        System.out.println();
        System.out.println("Перечень книг начинающихся на гласную букву: ");

        Character[] vowels = new Character[]{'A', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я'};
        for (Book book : set) {
            char[] array = book.getNameOfBook().toCharArray();
            for (int i = 0; i < vowels.length; i++) {
                if (array[0] == vowels[i]) {
                    System.out.println(book);
                    break;
                }
            }
        }
    }

    public static List createLinkedList(int countOfBooks) {
        List<Book> list = new LinkedList<>();
        list.addAll(library(countOfBooks));
        return list;
    }

    public static Set createHashSet(int countOfBooks) {
        Set<Book> set = new HashSet<>();
        set.addAll(library(countOfBooks));
        return set;
    }

    public static List library(int count) {
        List<Book> list = new ArrayList<>();
        list.add(new Book("Мастер и Маргарита", "Михаил", "Булгаков", 1967));
        list.add(new Book("Три товарища", "Эрих Мария", "Ремарк", 1936));
        list.add(new Book("Голодные игры", "Сьюзен", "Коллинз", 2011));
        list.add(new Book("Убить пересмешника", "Харпер", "Ли", 1960));
        list.add(new Book("Не навреди", "Генри", "Марш", 2014));
        list.add(new Book("Возлюбленная", "Рэй Дуглас", "Брэдбери", 1953));
        list.add(new Book("Вторая мировая война", "Уинстон", "Черчилль", 1956));
        list.add(new Book("Океан под нами", "Серега", "Вакулеле", 1674));
        list.add(new Book("Знаменитые викторианцы", "Виктор", "Цимбаленок", 1752));
        list.add(new Book("Автобиография Малкольма Икс", "Хэльги", "Ивонов", 1934));
        list.add(new Book("Ветер в ивах", "Муха", "Колосовский", 1964));
        list.add(new Book("Общество изобилия", "Роджер", "Гуляй", 1607));
        list.add(new Book("Со всем этим покончено", "Кристофер", "Тяпа", 2000));
        list.add(new Book("Охотник на ведьм", "Колос", "Шаша", 2021));
        list.add(new Book("Общая теория занятости, процента и денег", "Александр", "Коверко", 1935));
        list.add(new Book("Вторая мировая война", "Игорек", "Великий", 1976));
        // cloned
        list.add(new Book("Мастер и Маргарита", "Михаил", "Булгаков", 1967));
        list.add(new Book("Три товарища", "Эрих Мария", "Ремарк", 1936));
        list.add(new Book("Голодные игры", "Сьюзен", "Коллинз", 2011));
        list.add(new Book("Убить пересмешника", "Харпер", "Ли", 1960));
        list.add(new Book("Не навреди", "Генри", "Марш", 2014));
        list.add(new Book("Мастер и Маргарита", "Михаил", "Булгаков", 1967));
        list.add(new Book("Три товарища", "Эрих Мария", "Ремарк", 1936));
        list.add(new Book("Голодные игры", "Сьюзен", "Коллинз", 2011));
        list.add(new Book("Убить пересмешника", "Харпер", "Ли", 1960));
        list.add(new Book("Не навреди", "Генри", "Марш", 2014));

        List<Book> list1 = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            list1.add(list.get(i));
        }

        return list1;
    }
}
