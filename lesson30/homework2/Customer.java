package lesson30.homework2;

public class Customer {
    private String name;
    private String country;
    private int monthlyPay;

    public Customer(String name, String country, int monthlyPay) {
        this.name = name;
        this.country = country;
        this.monthlyPay = monthlyPay;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getMonthlyPay() {
        return monthlyPay;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", monthlyPay=" + monthlyPay +
                '}';
    }
}
