public class Increment extends Thread{
    Count count;

    public Increment(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        count.getI();
    }
}
