package lesson10.homework;

import java.util.Date;

public class FurnitureOrder extends Order {
   private String furnitureCode;

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }



    public String getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(String furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        if (getCustomerOwned().getName() != "Тест") {
            if (getCustomerOwned().getGender() == "Мужской"
                    || getCustomerOwned().getGender() == "Женский") {
                if (getShipFromCity() == "Киев"
                        || getShipFromCity() == "Львов") {
                       setDateConfirmed(new Date());
                }
            }
        }

    }

    @Override
   public void calculatePrice() {
        if (getBasePrice() < 5000) {
            setTotalPrice(getBasePrice() + (getBasePrice() * 0.05));
        } else {
            setTotalPrice(getBasePrice() + (getBasePrice() * 0.02));
        }
    }
}
