public class ThreadsImp implements Runnable {
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
        ThreadsImp obj = new ThreadsImp();
        obj.run();
        //obj.start();
        for (int i = 0; i <= 10; i++) {
            System.out.println("print main method " + i);
            Thread.sleep(1000);
        }

    }
}