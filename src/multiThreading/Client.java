package multiThreading;

import multiThreading.AdderSub.Adder;
import multiThreading.AdderSub.Sub;
import multiThreading.AdderSub.Value;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1. hello world printer program
//        Thread t1 = new Thread(new HelloWorldPrinter());
//        t1.start();
//        Thread t2 = new Thread(new HelloWorldPrinter());
//        t2.start();


        // 2. NumberPrinter
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        for(int i=1; i<=1000_000; i++){
//            executorService.execute(new NumberPrinter(i));
//        }

        // 3. Fibonacci Number
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        Future<Integer> ansFuture =  executorService.submit(new Fibonacci(55));
//        System.out.println("the number is " + ansFuture.get());
//        executorService.shutdown();

        // 4. Thread sleep
//        ThreadSleepDemo t1 = new ThreadSleepDemo();
//        ThreadSleepDemo t2 = new ThreadSleepDemo();
//        t1.setDaemon(true); // lowest Priority
//        t1.start();
//        t2.start();
//
//        // setting priority
//        t1.setPriority(10);
//        t2.setPriority(1);
//
//        t1.setName("Mihir");
//        t2.setName("Manu");
//
//        System.out.println(t1.getName());


        // 5. Locking mechanism
        Value x = new Value(0);
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(x, lock);
        Sub sub = new Sub(x, lock);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Void> addFuture = executor.submit(adder);
        Future<Void> subFuture = executor.submit(sub);

        addFuture.get();
        subFuture.get();

        executor.shutdown();
        System.out.println(x.getX());

    }
}
