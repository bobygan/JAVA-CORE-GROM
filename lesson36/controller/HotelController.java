package lesson36.controller;

import lesson36.model.Hotel;
import lesson36.model.User;
import lesson36.service.HotelService;
import lesson36.service.UserService;

public class HotelController {

    private HotelService hotelService = new HotelService();

    public Hotel addHotel (Hotel hotel) {
       // System.out.printf("hotel controller dane");
        return hotelService.addHotel(hotel);
    }

    public boolean deleteHotel (long hotelId) {

        return hotelService.deleteHotel(hotelId);
    }

    public Hotel findHotelByName(String name) {

        return hotelService.findHotelByName(name);
    }


    public Hotel findHotelByCity(String city)  {

        return hotelService.findHotelByCity(city);
    }

    // void login(String userName, String password)
    //  void logout()

}
