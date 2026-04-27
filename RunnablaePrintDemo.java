class MyRunnable implements Runnable {
    public void run() {
        for(int i=1; i<=100; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class RunnablePrintDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        Thread t3 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
        t3.start();
    }
}
