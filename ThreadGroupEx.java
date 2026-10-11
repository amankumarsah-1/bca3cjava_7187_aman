public class ThreadGroupEx {
    public static void main(String[] args) {
        ThreadGroup grp = new ThreadGroup("group1");
        
        MyThread m1 = new MyThread(grp ,"thread1");
        MyThread m2 = new MyThread(grp ,"thread2");
        MyThread m3 = new MyThread(grp ,"thread3");

        m1.start();
        m2.start();
        m3.start();
        grp.stop();

    }
}

class MyThread extends Thread{
    public MyThread(ThreadGroup g , String s){
        super(g,s);
    }
    public void run(){
        System.out.println("Thread name , priority , thread group "+ Thread.currentThread());
    }
}
