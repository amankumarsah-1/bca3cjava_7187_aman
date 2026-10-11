// MultiThreading program
/*
MIN_PRIORITY = 1
NORM_PRIORITY = 5
MAX_PRIORITY  = 10
*/
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is Running With name: "+Thread.currentThread().getName());
        System.out.println("Thread Priority : "+Thread.currentThread().getPriority());
    }
}

public class SetGetThread{
    public static void main(String[] args) {
        Thread MyThread = new Thread(new MyThread());

        MyThread.setName("MyThreadNm");
        MyThread.setPriority(Thread.NORM_PRIORITY);

        MyThread.start();

        System.out.println("Main Thread name: "+Thread.currentThread().getName());
        System.out.println("Mian Thread Priority : "+Thread.currentThread().getPriority());
    }
}