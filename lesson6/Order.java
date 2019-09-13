package lesson6;


import java.util.Date;

public class Order {
    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {
    }

    void confirmOrder() {
        //должен проставлять ордер в статус confirmed = true и дату конфирма ставить в текущую
        if (isConfirmed)
        { return;}
        isConfirmed = true;
        dateConfirmed = new Date();
    }

    public boolean checkPrice() {
//должен возвращать true если цена сделки больше 1000 и false в другом случае
        return price > 1000 ? true : false;

    }

    public boolean isValidType() {
        return (type == "Buy" ^ type == "Sale") ? true : false;
        //type поле может принимать только два значения - Buy, Sale - метод возвращает true если это требование выполняется и false если нет
    }

}