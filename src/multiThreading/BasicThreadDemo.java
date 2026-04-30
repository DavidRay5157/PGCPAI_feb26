package multiThreading;

class Basic extends Thread{
    public void run(){
        print();
    }

    public void print(){
        System.out.println("Basic Thread Running");
    }
}
class Complex implements Runnable{
    @Override
    public void run() {
        print();
    }
    public void print(){
        System.out.println("Complex Thread Running");
    }
}



public class BasicThreadDemo {
    public static void main(String[] args) {
        Basic basic = new Basic();
        basic.start();
        basic.run();

        Thread t1 = new Thread(basic);
        //t1.start();
        t1.run();

        Complex complex = new Complex();
        complex.run();
        //complex.start();   (not work)

        Thread t2 = new Thread(new Complex());
        t2.start();
        t2.run();
    }
}
