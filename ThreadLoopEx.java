class LoopThread extends  Thread {
    private int iteration;

    public LoopThread(int interation){
        this.iteration = interation;
    }

    public void run(){
        for(int i = 0; i < iteration; i++){
            try{
                Thread.sleep(500);
                System.out.println("Currunt Thread :"+Thread.currentThread().getName());
            }catch(InterruptedException ex){
                System.out.println("Exception has been caught"+ex);
            }
            System.out.println(i);
        }
    }
}

public class ThreadLoopEx{
    public static void main(String[] args) {
        LoopThread t1 = new LoopThread(5);
        LoopThread t2 = new LoopThread(5);

        t1.start();

        try {
            System.out.println("currunt Thread : "+Thread.currentThread().getName());
            t1.join();
        } catch (InterruptedException ex) {
            System.out.println("Exception has been caught"+ex);
        }
        t2.start();
        try {
            System.out.println("currunt Thread : "+Thread.currentThread().getName());
            t2.join();
        } catch (InterruptedException ex) {
            System.out.println("Exception has been caught"+ex);
        }
    }
}
