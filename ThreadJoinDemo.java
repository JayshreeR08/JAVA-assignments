class MyThreadJoin extends Thread {
    public void run() {
        for(int i=1; i<=5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) throws Exception {
        MyThreadJoin t1 = new MyThreadJoin();
        MyThreadJoin t2 = new MyThreadJoin();
        MyThreadJoin t3 = new MyThreadJoin();

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
}
