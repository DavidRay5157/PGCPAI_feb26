package multiThreading.AdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {

    Value x;
    Lock lock;

    public Adder(Value x, Lock lock){
        this.x = x;
        this.lock = lock;
    }
    private void add(){
        for(int i=0; i<1000_00; i++){
            //synchronized (x) {
            lock.lock();
                x.setX(x.getX() + 1);
                System.out.println("value added " + x.getX());
            lock.unlock();
            //}
        }
    }
    @Override
    public Void call() throws Exception {
        add();
        return null;
    }
}
