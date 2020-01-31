package lesson36.demo;

import lesson36.controller.HotelController;
import lesson36.controller.UserController;
import lesson36.model.Hotel;
import lesson36.model.User;
import lesson36.model.UserType;

public class DemoHotel {
    public static void main(String[] args) {


        Hotel hotel = new Hotel("Igor", "hj", "AN", "UA");
        Hotel hotel2 = new Hotel("I", "hj", "AN", "UA");
        Hotel hotel3 = new Hotel("S", "hj", "AN", "UA");
        HotelController hotelController = new HotelController();
        hotelController.addHotel(hotel);
        //hotelController.addHotel(hotel2);
      //  hotelController.addHotel(hotel3);
       // hotelController.deleteHotel(73);
        System.out.println( hotelController.findHotelByName("S"));
        System.out.println( hotelController.findHotelByCity("Igor"));
    }
}
