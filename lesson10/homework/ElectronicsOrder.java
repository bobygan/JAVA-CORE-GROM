package lesson10.homework;

import java.util.Date;

public class ElectronicsOrder extends Order {

    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }



    public int getGuaranteeMonths() {
        return guaranteeMonths;
    }

    public void setGuaranteeMonths(int guaranteeMonths) {
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {
        if (getShipFromCity() == "Киев" ||
                getShipFromCity() == "Одесса" ||
                getShipFromCity() == "Днепр" ||
                getShipFromCity() == "Харьков") {

            if (getShipToCity() == "Киев" ||
                    getShipToCity() == "Одесса" ||
                    getShipToCity() == "Днепр" ||
                    getShipToCity() == "Харьков") {
                if (getBasePrice() >= 100) {
                    if (getCustomerOwned().getGender() == "Женский" && getCustomerOwned().getName()!=null) {
                        setDateConfirmed(new Date());
                    }

                }
            }
        } else return;
    }


    @Override
   public void calculatePrice() {
        if (getShipToCity() != "Киев" &&
                getShipToCity() != "Одесса") {
            setTotalPrice(getBasePrice() + getBasePrice() * 0.15 + (getBasePrice() > 1000 ? (getBasePrice()+ getBasePrice() * 0.15  )* -0.05 : 0));

        } else {
            setTotalPrice(getBasePrice() + getBasePrice() * 0.10 + (getBasePrice() > 1000 ? (getBasePrice()+ getBasePrice() *0.15  )* -0.05 : 0));
        }

    }
}
