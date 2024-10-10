package Animals.controler;

public class Counter implements AutoCloseable {

    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void add() {
        count++;
    }

    @Override
    public void close() {

        System.out.println("Счетчик закрыт");
    }

}

