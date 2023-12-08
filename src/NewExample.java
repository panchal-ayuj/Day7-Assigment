import java.util.LinkedList;

public class NewExample {
    static int obj =0;

    public static void main(String[] args) throws InterruptedException {
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.a();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.s();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final: " + obj);
    }

    public static class PC {

        public void a() throws InterruptedException {
//            T obj = (T) new Object();
            for(int i = 0; i<100; i++) { // Because we need to produce till the time the code is running
//                synchronized (this) {
                    System.out.println("Produced: " + obj++);
//                }
            }
        }

        public void s() throws InterruptedException {
            for(int i=0; i<100; i++) {
//                synchronized (this) {
                    System.out.println("Consumed: " + obj--);
//                }
            }
        }
    }
}
