package lesson36.service;

import lesson36.exeption.BadRequestException;
import lesson36.model.Hotel;
import lesson36.repository.Repository;

public class HotelService {

    private Repository repository  =new Repository();


    public Hotel addHotel (Hotel hotel){
        try {
            validate(hotel);
            return repository.addHotel(hotel);
        }
        catch (Exception e){
            System.out.println( e.getMessage());
        }
        return hotel;
    }

    public boolean deleteHotel (long hotelId) { return repository.deleteHotel(hotelId);
    }

    public Hotel findHotelByName(String name) {
        return repository.findHotelByName(name);
    }

    public Hotel findHotelByCity(String city)  {
        return repository.findHotelByCity(city);
    }

    private void validate(Hotel hotel) throws Exception{

        if(hotel==null){
            throw new NullPointerException ("User data is wrong");
        }

        if(hotel.getName().equals("")||hotel.getName().equals(null)){
            throw new BadRequestException("User data is wrong");

        }
    }
}
