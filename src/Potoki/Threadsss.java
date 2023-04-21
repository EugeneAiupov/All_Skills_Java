package Potoki;

import java.util.Timer;

//потоки в java основная цель реализация функционала
public class Threadsss {
    public static void main(String[] args) throws InterruptedException {
        Mythread mtrd = new Mythread();
        mtrd.start();//необходимо вызывать метод старт
        Mythread mtrd2 = new Mythread();
        Thread.sleep(3000);
        mtrd2.start();
    }
}
class Mythread2 implements Runnable{
//с реализацией интерфейса runnable
    @Override
    public void run() {

    }
}
class Mythread extends Thread{
//необходимо переопределить метод run
    @Override
    public void run() {
        for (int i = 0; i<=10000;i++){
            System.out.println("Hello from my thread : "+i);
            try {
                Thread.sleep(1000);//заставляет поток лечьспать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


