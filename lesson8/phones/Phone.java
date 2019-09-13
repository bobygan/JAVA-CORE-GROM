package lesson8.phones;

public class Phone {
    int price;
    double wight;
    String countryProduced;

    public Phone(int price, double wight, String countryProduced) {
        System.out.println("Phone constructor was invked...");
        this.price = price;
        this.wight = wight;
        this.countryProduced = countryProduced;
    }
    void  orderPhone(){
        System.out.println("order Phone invoked...");
    }
}
