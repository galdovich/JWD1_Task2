package PVP;

import java.util.*;
import java.io.*;

public class Homework_6 {
    public static void main(String[] args) {
        tast2();
    }

    public static void tast1() {
        File notSortedArray = new File("D:\\notSorted.txt");
        File sortedArray = new File("D:\\sortedArray.txt");
        List <Character> list = new ArrayList<>();
        int number;

        try(FileInputStream fis = new FileInputStream(notSortedArray);
            FileOutputStream fos = new FileOutputStream(sortedArray)){

            // reading and creating new array of chars
            while ((number = fis.read()) != -1){
                list.add((char)number);
            }
            System.out.println("Array before sorting: ");
            for (Character character: list){
                System.out.print(character);
            }
            System.out.println();

            // sorting array of char
            Collections.sort(list);
            System.out.println("Array after sorting: ");
            for (Character character: list){
                System.out.print(character);
            }

            // recording new sorted array
            for (Character a: list){
            fos.write(a);}
        }catch (IOException e){e.printStackTrace();}
    }

    public static void tast2() {
        File file = new File("D:\\myfile.txt");

        try(FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr)){

            String [] a;
            String [] word;
            String firstWord;
            String lastWord;

            // creating array of sentences by spliting
            a = br.readLine().split("\\.|\\?");

            // creating array of words and swaping first and last words
            for (int i = 0; i < a.length; i++){
                word = a[i].split(" ");
                firstWord = word[0];
                lastWord = word [word.length - 1];
                for(int j = 0; j < word.length - 1; j++){
                    if (j !=0 & j != (word.length - 1)){
                        System.out.print(word[j] + " ");
                    }
                    else {
                        if (j==0){
                            System.out.print(lastWord + " ");
                        }
                        if (j == (word.length-1)){
                            System.out.print(firstWord + " ");
                        }
                    }
                }
                System.out.println();
            }
        }catch (IOException e) {e.printStackTrace();}
    }

    public static void tast3() {

    }
}
