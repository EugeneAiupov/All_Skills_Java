package SynhronizableThread;

import java.util.*;

//Синхронизация потоков проблема в том что потоки обращаются к своему ядру и переменная running закешируется и может на всегда остаться true
//для того чтоб это не произошло так как потоки не всегда когерентны, используется ключевое слово volatile переменная всегда будет хранится в основной памяти компьютера
public class SynroThread {
    public static void main(String[] args) {

        MyThread trd = new MyThread();
        trd.start();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        trd.shutDown();


    }
}

class MyThread extends Thread{

    private volatile boolean running=true;
    @Override
    public void run() {
        while (running){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutDown(){
        this.running = false;
    }
}
