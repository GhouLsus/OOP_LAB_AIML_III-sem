public class Qextra {
    private int count;
    
    public void Counter() {
        count = 0;
    }
    
    public synchronized void increment() {
        while (count == 3) {
            System.out.println("Waiting to increment");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        count++;
        System.out.println("Incremented count: " + count);
        notifyAll();
    }
    
    public synchronized void decrement() {
        while (count == 0) {
            System.out.println("Waiting to decrement");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        count--;
        System.out.println("Decremented count: " + count);
        notifyAll();
    }
}

class Qex{
    public static void main(String[] args) {
        Qextra c = new Qextra();
        c.increment();
        c.decrement();
    }
}