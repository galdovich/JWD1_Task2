package pvp.Semaphore;


import CallCenter.Name;
import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main{
    public static void main(String[] args) throws InterruptedException{

        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < 10; i++){
        new Client(semaphore, i, getRandomName().toString()).start();
        Thread.sleep(1000);
        }

    }

    public static Names getRandomName() {
        Random random = new Random();
        return Names.values()[random.nextInt(Name.values().length)];
    }
}


class Client extends Thread {
    Semaphore semaphore;
    int id;

    Client (Semaphore semaphore, int id, String name){
        super (name);
        this.semaphore = semaphore;
        this.id = id;
    }


    public void run (){
        try {
            System.out.println(Thread.currentThread().getName() + " звонит в колл-центр....");
            if (id == 9){
                System.out.println("-------------------");
            }
            join(10000);
        }catch (InterruptedException e){e.printStackTrace();}



        try{
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " начал разговор");
            System.out.println("Свободных операторов: " + semaphore.availablePermits());
            sleep(5000);

            System.out.println(Thread.currentThread().getName() + " закончил разговор!");
            semaphore.release();



        }catch (InterruptedException e){e.printStackTrace();}
    }
}
