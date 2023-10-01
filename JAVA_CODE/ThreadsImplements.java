public class ThreadsImplements extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("print run method " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadsImplements obj = new ThreadsImplements();
        // obj.run();
        obj.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("print main method " + i);
            Thread.sleep(1000);
        }

    }
}