package lesson36.controller;

import lesson36.model.Hotel;

import java.util.Date;

public class Filter {

    private int numberOfGuests;
    private double price;
    private boolean breakfastIncluded;
    private boolean petsAllowed;
    private Date dateAvailableFrom;
    private String country;
    private String city;

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

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }


    private Filter(Builder builder){
        this.numberOfGuests=builder.numberOfGuests;
        this.price=builder.price;
        this.breakfastIncluded=builder.breakfastIncluded;
        this.petsAllowed=builder.petsAllowed;
        this.dateAvailableFrom=builder.dateAvailableFrom;
        this.country=builder.country;
        this.city=builder.city;
    }


  public   static class Builder{
        private int numberOfGuests;
        private double price;
        private boolean breakfastIncluded;
        private boolean petsAllowed;
        private Date dateAvailableFrom;
        private String country;
        private String city;

        public Builder setNumberOfGuests(int numberOfGuests) {
            this.numberOfGuests = numberOfGuests;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setBreakfastIncluded(boolean breakfastIncluded) {
            this.breakfastIncluded = breakfastIncluded;
            return this;
        }

        public Builder setPetsAllowed(boolean petsAllowed) {
            this.petsAllowed = petsAllowed;
            return this;
        }

        public Builder setDateAvailableFrom(Date dateAvailableFrom) {
            this.dateAvailableFrom = dateAvailableFrom;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }
        public Filter build(){
            return new Filter(this);
        }
    }

    @Override
    public String toString() {
        return "Filter{" +
                "numberOfGuests=" + numberOfGuests +
                ", price=" + price +
                ", breakfastIncluded=" + breakfastIncluded +
                ", petsAllowed=" + petsAllowed +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

