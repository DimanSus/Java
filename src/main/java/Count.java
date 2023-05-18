public class Count {
    private int i = 0;

    public synchronized void setI() {
        this.i = i;
        while (i<=9){
            try {
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        for (int j = 0; j < 5; j++) {
            i--;
            System.out.println("Enter " + i + " flow №1");
        }
    }

    public synchronized int getI() {
        while (i<10){
            i++;
            System.out.println("Enter "+i+ " flow №2");
        }
        notify();
        return i;
    }
}
