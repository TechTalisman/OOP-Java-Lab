class SharedResource {
    synchronized void printWords(String threadName) {
        String[] words = {"I", "Love", "Java", "Very", "Much"};
        for (String word : words) {
            System.out.println(threadName + ": " + word);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted!");
                Thread.currentThread().interrupt();
            }
        }
    }
}
 
class MyThread extends Thread {
    private final SharedResource resource;
    private final String threadName;

    MyThread(SharedResource resource, String threadName) {
        this.resource = resource;
        this.threadName = threadName;
    }

    public void run() {
        resource.printWords(threadName);
    }
}

public class prog2  {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        MyThread t1 = new MyThread(resource, "Thread 1");
        MyThread t2 = new MyThread(resource, "Thread 2");

        t1.start();
        t2.start();
    }
}
