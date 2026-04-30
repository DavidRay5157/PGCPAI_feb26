package multiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Fibonacci implements Callable<Integer> {
    int n;
    Fibonacci(int n) {
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        if(n<=1) return 1;
        System.out.println("Thread is excuting in " + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Integer> firstFuture = executorService.submit(new Fibonacci(n-1));
        Future<Integer> secondFuture = executorService.submit(new Fibonacci(n-2));

        int x = firstFuture.get();
        int y = secondFuture.get();
        return x + y;
    }
}
