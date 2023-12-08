public class MyThread implements Runnable {
    int val;

    public MyThread(int val) {
        this.val = val;
    }
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+ " " +val++);
        }
    }
}
