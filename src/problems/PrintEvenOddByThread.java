package problems;

import jdk.dynalink.beans.StaticClass;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintEvenOddByThread {

    public static volatile boolean isOddTrue = true;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable printOdd = ()->{
            for(int i=5 ; i<=20 ; i=i+2){
                synchronized (PrintEvenOddByThread.class){
                    while(!isOddTrue){
                        try {
                            PrintEvenOddByThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("ODD Number:"+i+"-"+Thread.currentThread().getName());
                    isOddTrue=false;
                    PrintEvenOddByThread.class.notify();
                }
            }
        };
        Runnable printEven = ()->{
            for(int i=6 ; i<=20 ; i=i+2){
                synchronized (PrintEvenOddByThread.class){
                    while(isOddTrue){
                        try {
                            PrintEvenOddByThread.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Even Number:"+i+"-"+Thread.currentThread().getName());
                    isOddTrue=true;
                    PrintEvenOddByThread.class.notify();
                }
            }
        };

        executor.submit(printOdd);
        executor.submit(printEven);

        executor.shutdown();




    }
}
