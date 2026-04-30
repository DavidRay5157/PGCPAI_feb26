package multiThreading.AdderSub;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Sub implements Callable<Void> {

    Value x;
    Lock lock;

    public Sub(Value x, Lock lock){
        this.x = x;
        this.lock = lock;
    }
    private void sub(){
        for(int i=0; i<1000_00; i++){
           // synchronized (x) {
                lock.lock();
                x.setX(x.getX() - 1);
                System.out.println("value added " + x.getX());

                lock.unlock();
                //}
        }
    }
    @Override
    public Void call() throws Exception {
        sub();
        return null;
    }
}
