package lesson36.service;

import lesson36.model.Hotel;
import lesson36.repository.HotelRepository;

public class HotelService {

    private HotelRepository hotelRepository=new HotelRepository();

    public Hotel addHotel (Hotel hotel){
        //проверяем бизнес логику
        //если все ок
        try {
            validate(hotel);
            return hotelRepository.addHotel(hotel);
        }
        catch (Exception e){
            System.out.println( e.getMessage());

        }
        return hotel;

    }

    public boolean deleteHotel (long hotelId) {

        return hotelRepository.deleteHotel(hotelId);
    }


    public Hotel findHotelByName(String name) {
        return hotelRepository.findHotelByName(name);
    }


    public Hotel findHotelByCity(String city)  {
        return hotelRepository.findHotelByCity(city);
    }



    private void validate(Hotel hotel) throws Exception{

        if(hotel==null){
            throw new NullPointerException ("User data is wrong");
        }

        if(hotel.getName().equals("")||hotel.getName().equals(null)){
            throw new NullPointerException ("User data is wrong");


        }





    }


}
