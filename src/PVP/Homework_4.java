package PVP;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework_4 {
    public static void main(String[] args) {
        task8();
    }

    public static void task1() {
        String ourWords = "during the ceremony, also recalled the words that the beloved journalist said";
        String output = "";
        String[] array = ourWords.split(" ");
        for (String word : array) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1);
            output += " " + first + all;
        }
        System.out.println(output);
    }

    public static void task2() {
        char[] c = {'.', ',', '-', ':', ';', '?', '!'};
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    public static void task3() {
        System.out.print("Введите строку: ");
        String a = new Scanner(System.in).nextLine();
        char[] chars = a.toCharArray();
        char[] lol = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < 10; j++) {
                if (lol[j] == chars[i]) {
                    sum += Character.getNumericValue(lol[j]);
                }
            }
        }
        System.out.println("Сумма всех целых чисел в строке равна " + sum);
    }

    public static void task4() {
        String[] text = new String[5];
        System.out.println("Введите 5 строк: ");
        for (int i = 0; i < 5; i++) {
            text[i] = new Scanner(System.in).nextLine();
        }

        int symbol = 3;
        char newChar = 'a';
        char[] word;
        for (int i = 0; i < text.length; i++) {
            if (text[i].length() >= symbol) {
                word = text[i].toCharArray();
                word[symbol - 1] = newChar;
                text[i] = String.copyValueOf(word);
            }
        }
        System.out.println();

        for (String s : text) {
            System.out.println(s);
        }
    }

    public static void task5() {

        String ourwords = "Тут я немного перестарался (психанул) и создал коллекцию";
        String[] array = ourwords.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("(")) {
                array[i] = null;
                continue;
            } else {
                list.add(array[i]);
            }
        }
        for (String finalWords : list) {
            System.out.print(finalWords + " ");
        }
    }

    public static void task6() {
        String text = ("Ах как хочется жить просто жить хорошо");
        String[] words = text.split(" ");
        int count1 = 0;
        int count2 = 0;
        for (String a : words) {
            count1++;
        }
        for (int i = 0; i < count1; i++) {
            for (int j = 0; j < count1; j++)
                if (words[i].equals(words[j])) {
                    count2++;
                }
            System.out.println("Слово " + words[i] + " встречается " + count2 + " раз(а)");
            count2 = 0;
        }
    }

    public static void task7() {
        int count = 0;
        Character[] vowels = new Character[]{'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        Character[] consonants = new Character[]{'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
        String s = new Scanner(System.in).nextLine();
        String[] words = s.split(" ,.");
        for (int i = 0; i < words.length; i++) {
            if (vowels.equals(words[i])) {
                count++;
            }
            for (Character character : s.toCharArray()) {
                for (Character pub : vowels) {
                    if (character.equals(pub)) {
                        count++;
                    }
                }
            }
            System.out.println("Гласные:" + count);
            count = 0;

            for (Character character : s.toCharArray()) {
                for (Character lol : consonants) {
                    if (character.equals(lol)) {
                        count++;
                    }
                }
            }
            System.out.println("Cогласные: " + count);
        }
    }

    public static void task8() {

        int count = 0;
        int length = 0;

        String text = "Жил-был на свете дурак.\n" +
                "Долгое время он жил припеваючи; но понемногу стали доходить до него слухи, что он всюду слывет за безмозглого пошлеца.\n" +
                "Смутился дурак и начал печалиться о том, как бы прекратить те неприятные слухи?\n" +
                "Внезапная мысль озарила наконец его темный умишко... И он, нимало не медля, привел ее в исполнение";

        // input length
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину слов, которые необходимо найти в вопросительном предложении: ");
        boolean flag = true;
        while (flag) {
            System.out.println("Введите число: ");
            if (scanner.hasNextInt()) {
                length = scanner.nextInt();
                flag = false;
            } else {
                System.out.println("Ошибка: введено число отличное от целочисленного значение!");
                scanner.next();
            }
        }

        // my line counter
        String[] newArray = text.split("\n");
        for (String bb : newArray) {
            count++;
        }

        // create array of words and search for a word by comparing with the required length
        for (int i = 0; i < count; i++) {
            if (newArray[i].contains("?")) {
                String[] arrayWhitQuestion = newArray[i].split("\\?| |,");
                for (int j = 0; j < arrayWhitQuestion.length; j++) {
                    if (arrayWhitQuestion[j].length() == length) {
                        System.out.println(arrayWhitQuestion[j]);
                    }
                }
            }
        }
    }
}



