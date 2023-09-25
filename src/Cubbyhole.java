public class Cubbyhole {
    private int contents;
    private boolean available = false;

    public synchronized int get() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                // Handle the exception, perhaps logging it.
            }
        }
        available = false;
        notifyAll();
        return contents;
    }

    public synchronized void put(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                // Handle the exception, perhaps logging it.
            }
        }
        contents = value;
        available = true;
        notifyAll();
    }
}
