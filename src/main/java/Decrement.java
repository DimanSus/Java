public class Decrement extends Thread{
    Count count;

    public Decrement(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        count.setI();
    }
}
