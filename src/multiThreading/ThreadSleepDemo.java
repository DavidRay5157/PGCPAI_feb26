package multiThreading;

public class ThreadSleepDemo extends Thread {
    @Override
    public void run() {
        //Daemon thread <= invoked automatically for garbage collection
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon is Running");
        }else{
            System.out.println("User thread is running");
        }
        for(int i=1; i<5; i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
