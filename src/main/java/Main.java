public class Main {
    public static void main(String[] args) {
        Count count =  new Count();
        Increment increment = new Increment(count);
        Decrement decrement = new Decrement(count);
        new Thread(decrement).start();
        new Thread(increment).start();
    }
}
