package PVP.Homework_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Ships[] arrayOfShips = new Ships[7];
        arrayOfShips[0] = new Ships("Military", "Helena", 231, 1900, 550);
        arrayOfShips[1] = new Ships("Military", "Chester", 245, 900, 300);
        arrayOfShips[2] = new Ships("Military", "Phoenix", 231, 800, 600);
        arrayOfShips[3] = new Ships("Civil", "Dallas", 31, 1900, 300);
        arrayOfShips[4] = new Ships("Military", "St.Louis", 231, 1900, 300);
        arrayOfShips[5] = new Ships();
        arrayOfShips[6] = new Ships();

        System.out.println("------------------------- Массив объектов -------------------------");
        for (int i = 0; i<arrayOfShips.length; i++){
            System.out.println(arrayOfShips[i]);
            System.out.println("-------------------------");
        }

        System.out.println("------------------------- Сортировка массива объектов по maxSpeed -------------------------");
        for (int i = 0; i < arrayOfShips.length; i++) {
            if (arrayOfShips[i].getMaxSpeed() > 400) {
                System.out.println(arrayOfShips[i]);
                System.out.println("-------------------------");
            }
        }
            System.out.println("");
            System.out.println("------------------------- Сравнение объектов по hashcode -------------------------");
            System.out.println("Объекты с одинаковыми параметрами: ");
            System.out.println("Ship \"noname 6\" : " + arrayOfShips[5].hashCode());
            System.out.println("Ship \"noname 7\" : " + arrayOfShips[6].hashCode());

            System.out.println();
            System.out.println("Объекты с разными параметрами: ");
            System.out.println("Ship \"Phoenix\" : " + arrayOfShips[0].hashCode());
            System.out.println("Ship \"Dallas\"  : " + arrayOfShips[1].hashCode());


            System.out.println();
            System.out.println("------------------------- Сравнение объектов по equals -------------------------");
            System.out.println("Сравнение \"Chester\" и \"St.Louis\" :  " + arrayOfShips[0].equals(arrayOfShips[1]));
    }
}


