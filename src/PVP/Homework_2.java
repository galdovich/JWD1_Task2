package PVP;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_2 {
    public static void main(String[] args) {
        task2();
    }

    public static void task1_1() {
        int count;
        int[] array = {4, 25, 16, 3, 5, 2, 5, 43, 2, 64, 32};
        System.out.print("Массив перед сортировкой: ");
        for (int beforeSort : array) {
            System.out.print(beforeSort + " ");
        }
        int i;
        do {
            count = 0;
            for (i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        }
        while (count > 0);

        System.out.println();
        System.out.print("Массив после сортировки: ");
        for (int afterSort : array) {
            System.out.print(afterSort + " ");
        }
    }

    public static void task1_2() {
        String[] array = {"Amsterdam ", "Mosсow ", "Minsk ", "Paris ", "New York ", "Barcelona ", "Kiev "};
        System.out.print("Массив перед сортировкой: ");

        for (String beforeSort : array) {
            System.out.print(beforeSort + " ");
        }
        Arrays.sort(array);
        System.out.println("");
        System.out.print("Массив после сортировки: ");


        for (String afterSort : array) {
            System.out.print(afterSort + " ");
        }
    }

    public static void task2() {
        int number = 0;
        int total = 0;
        int[] array = {4, 5, 6, 3, 5, 3, 5, 6, 3, 4, 5, 6};
        System.out.print("Массив: ");
        for (number = 0; number < array.length; number++) {
            total += array[number];
            System.out.print(array[number] + " ");
        }
        System.out.println();
        System.out.println("Сумма массива: " + total);
    }

    public static void task4() {
        int number = 0;
        double total = 0;
        int[] array = {5, 5, 35, 4, 53, 2, 17, 8, 26, 4, 23};

        System.out.print("Массив чисел: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        for (number = 0; number < array.length; number++) {
            total += array[number];
        }
        System.out.println();
        double average = total / array.length;
        System.out.println("Среднее значение массива: " + average);
    }

    public static void task5() {
        int[] array = {5, 5, 35, 4, 53, 2, 17, 8, 26, 4, 23};

        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int number = 0; number < array.length; number++) {
            if (array[number] == 2) {
                System.out.println("Найденое число: " + array[number]);
                System.out.println("Индекс найденного числа: " + number);
            }
        }
    }

    public static void task6() {
        int number;
        int[] array = {5, 5, 35, 4, 53, 2, 17, 8, 26, 4, 23};
        System.out.print("Наш массив состоит из чисел: ");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (number = 0; number < array.length; number++) {
            if (array[number] == 8) {
                System.out.println("Индекс числа " + array[number] + " равен: " + number);
            }
        }
    }

    public static void task7() {
        //Решил использовать ArrayList
        ArrayList<String> Array = new ArrayList<>();

        // Заполняем массив
        Array.add("Samsung");
        Array.add("Apple");
        Array.add("Sony");
        Array.add("Huawei");

        System.out.print("Массив: ");
        for (String mob : Array) {
            System.out.print(mob + " ");
        }
        // Удаляем элемент из массива
        Array.remove(2);

        System.out.println("");
        System.out.print("Массив: ");
        for (String mob : Array)
            System.out.print(mob + " ");

    }

    public static void task8() {
        // first array
        int[] array = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        System.out.print("Массив 1: ");
        for (int num1 : array) {
            System.out.print(num1 + " ");
        }
        // copy of first array
        System.out.println("");
        System.out.print("Массив 2: ");
        int[] arrayCopy = new int[10];
        for (int num2 : arrayCopy) {
            System.out.print(num2 + " ");
        }
        // copy 1 array in 2 array
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
        }
        System.out.println("");
        System.out.print("Массив 2 после копирования: ");
        for (int num3 : arrayCopy) {
            System.out.print(num3 + " ");
        }

    }

    public static void task9() {
        ArrayList<String> vipList = new ArrayList<>();
        vipList.add("Igor");
        vipList.add("Victor");
        vipList.add("Sasha");
        vipList.add("Michael");

        System.out.print("Список 1: ");
        for (String names : vipList) {
            System.out.print(names + " ");
        }

        vipList.add(2, "Lena");

        System.out.println("");
        System.out.print("Список 2: ");

        for (String names : vipList) {
            System.out.print(names + " ");
        }
    }

    public static void task10() {
        int[] array = {4, 6, 17, 4, 15, 6, 9, 34, 12, 54, 87, 32};

        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        int maxnumber = 0;
        int minnumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxnumber) {
                maxnumber = array[i];
            }
            if (array[i] < minnumber) {
                minnumber = array[i];
            }
        }
        System.out.println(" ");
        System.out.print("Максимальное значение: " + maxnumber + " | " + "Минимальное значение: " + minnumber);
    }

    public static void task11() {
        int[] array = {34, 45, 3, 24, 67, 23, 7, 3, 45};
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Повторяющееся число - " + array[i]);
                }
            }
        }
    }

    public static void task12() {
        // Search by Arrays.sort
        int[] array = {6, 4, 14, 2, 17, 6, 13, 64, 7};
        System.out.print("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                System.out.println("Есть совпадение: " + array[i]);
            }
        }
    }

    public static void task13() {
        // Search by double cycle
        String[] array = {"Huawei", "Sony", "Apple", "Nokia", "Samsung", "Meizu", "Apple"};
        System.out.print("Массив: ");
        for (String num : array) {
            System.out.print(num + " ");
        }
        System.out.println("");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Есть совпадение: " + array[i]);
                }
            }
        }

    }

    public static void task14() {
        int count = 0;
        String[] list1 = {"Apple", "Motorola", "Samsung", "HTC"};
        String[] list2 = {"Lenovo", "Sony", "Nokia", "Huawei"};

        System.out.print("Массив 1: ");
        for (String num : list1) {
            System.out.print(num + " ");
        }
        System.out.println("");
        System.out.print("Массив 2: ");
        for (String num : list2) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i] == list2[j]) {
                    System.out.print(list1[i] + " ");
                    count++;
                }
            }
        }
        System.out.println("");
        if (count == 0) {
            System.out.println("Совпадений нет");
        }

    }

    public static void task15() {
        int count = 0;
        int[] arrayFirst = {26, 43, 45, 37, 28, 19, 3, 12, 54};
        int[] arraySecond = {0, 1, 2, 64, 4, 69, 3, 52, 44};

        System.out.print("Массив 1: ");
        for (int numF : arrayFirst) {
            System.out.print(numF + " ");
        }
        System.out.println("");
        System.out.print("Массив 2: ");
        for (int numS : arraySecond) {
            System.out.print(numS + " ");
        }
        System.out.println("");
        System.out.print("Повторяющиеся числа: ");

        for (int i = 0; i < arrayFirst.length; i++) {
            for (int j = 0; j < arraySecond.length; j++) {
                if (arrayFirst[i] == arraySecond[j]) {
                    System.out.print(arrayFirst[i] + " ");
                    count++;
                }
            }
        }
        System.out.println("");
        if (count == 0) {
            System.out.println("Нет Совпадений");
        }
    }

    public static void task16() {

        // Вышло немного сложно, но со своей задачей код справился
        int count = 0;
        int[] array = {5, 34, 25, 16, 34, 27, 8, 19, 20, 14};
        System.out.print("Массив до удаления: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Находим одинаковое значение и перезаписываем массив
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++)
                if (array[i] == array[j]) {
                    count++;
                    for (int a = j; a < array.length - 1; a++) {
                        array[a] = array[a + 1];
                    }
                }
        }

        // Копируем массив "array" в новый массив "arrayCopy" размер которого меньше на (count -1)
        int[] arrayCopy = Arrays.copyOf(array, array.length - (count - 1));
        System.out.println("");
        System.out.print("Массив после удаления: ");
        for (int num : arrayCopy) {
            System.out.print(num + " ");
        }
    }

    public static void task17() {

        int[] array = {26, 43, 45, 37, 28, 19, 3, 12, 54};

        System.out.print("Массив 1: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        Arrays.sort(array);

        System.out.println("");
        System.out.print("Массив 1: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        for (int i = 1; i < array.length; i++) {
            if (array[array.length - i] != array[array.length - (i + 1)]) {
                System.out.println("");
                System.out.print("Второе максимальное число: ");
                System.out.print(array[array.length - (i + 1)]);
                break;
            }
        }

    }

    public static void task18() {
        int[] array = {26, 43, 45, 37, 28, 19, 3, 12, 54};

        System.out.print("Массив 1: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        Arrays.sort(array);

        System.out.println("");
        System.out.print("Массив 1: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[i + 1]) {
                System.out.println("");
                System.out.print("Второе минимальное число: ");
                System.out.print(array[i + 1]);
                break;
            }
        }
    }

    public static void task19() {
        int matrixA[][] = {{5, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int matrixB[][] = {{7, 3, 4}, {2, 5, 3}, {3, 2, 4}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixB[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void task20() {
        int[] array = {26, 43, 45, 37, 28, 19, 3, 12, 54};
        ArrayList<Integer> arrayCopy = new ArrayList<>();
        // Input "array"
        System.out.print("Массив 1: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Coping "array" to "arrayCopy"
        for (int i = 0; i < array.length; i++) {
            int a = array[i];
            arrayCopy.add(a);
        }
        // Input "arrayCopy"
        System.out.println("");
        System.out.print("Массив типа ArrayList: ");
        for (int a : arrayCopy) {
            System.out.print(a + " ");
        }

    }

}