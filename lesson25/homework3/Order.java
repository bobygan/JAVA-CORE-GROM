package lesson25.homework3;

public  class  Order {
    private long id;

    public Order(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                '}';
    }
}
