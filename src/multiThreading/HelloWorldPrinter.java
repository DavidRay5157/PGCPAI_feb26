package multiThreading;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        print();
    }
    public void print(){
        System.out.println("Hello world");
        System.out.println("The thread name is " + Thread.currentThread().getName());
    }
}
