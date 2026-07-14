package Day_15_Class_Task;

public class Multthreading2 {

    public static void main(String[] args) {

        Chef c1 = new Chef();
        c1.start();

        System.out.println(c1.getState());
    }

    static class Chef extends Thread {

        public void run() {

            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getState());
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

            System.out.println("This is the new Thread method");
        }
    }
}