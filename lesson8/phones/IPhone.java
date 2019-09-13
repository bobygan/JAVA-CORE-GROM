package lesson8.phones;

public class IPhone extends Phone{
    int price;
    double wight;
    String countryProduced;
    boolean fingerPrint;

    public IPhone(int price, double wight, String countryProduced, boolean fingerPrint) {
        super(price,wight,countryProduced);
        System.out.println("IPhone constructor was invoked...");
        this.fingerPrint = fingerPrint;
    }



    void  deleteIPhoneFromDb(){
        System.out.println("dslete IPhoneFromDB invoked...");
    }
}
