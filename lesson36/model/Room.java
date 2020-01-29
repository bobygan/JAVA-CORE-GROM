package lesson36.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Room {
    long id;
    int numberOfGuests;
    double price;
    boolean breakfastIncluded;
    boolean petsAllowed;
    Date dateAvailableFrom;
    Hotel hotel;

    public Room(int numberOfGuests, double price, boolean breakfastIncluded, boolean petsAllowed, Date dateAvailableFrom, Hotel hotel) {
        this.numberOfGuests = numberOfGuests;
        this.price = price;
        this.breakfastIncluded = breakfastIncluded;
        this.petsAllowed = petsAllowed;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotel = hotel;
    }

    public Room(long id, int numberOfGuests, double price, boolean breakfastIncluded, boolean petsAllowed, Date dateAvailableFrom, Hotel hotel) {
        this.id = id;
        this.numberOfGuests = numberOfGuests;
        this.price = price;
        this.breakfastIncluded = breakfastIncluded;
        this.petsAllowed = petsAllowed;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotel = hotel;
    }

    public Room(String id, String numberOfGuests, String price, String breakfastIncluded, String petsAllowed, String dateAvailableFrom, Hotel hotel) throws ParseException {
        this.id = Long.valueOf(id);
        this.numberOfGuests = Integer.valueOf(numberOfGuests);
        this.price = Double.valueOf(price);
        this.breakfastIncluded =Boolean.valueOf(breakfastIncluded);
        this.petsAllowed = Boolean.valueOf(petsAllowed);
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        Date docDate=new Date();
        try {
            docDate= format.parse(dateAvailableFrom);
        }
        catch (Exception e){}
        this.dateAvailableFrom =docDate;
        this.hotel = hotel;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    public boolean isPetsAllowed() {
        return petsAllowed;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public Hotel getHotel() {
        return hotel;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", numberOfGuests=" + numberOfGuests +
                ", price=" + price +
                ", breakfastIncluded=" + breakfastIncluded +
                ", petsAllowed=" + petsAllowed +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", hotel=" + hotel +
                '}';
    }
}
