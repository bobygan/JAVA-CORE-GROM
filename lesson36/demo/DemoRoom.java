package lesson36.demo;

import lesson36.controller.Filter;
import lesson36.controller.HotelController;
import lesson36.controller.RoomController;
import lesson36.model.Hotel;
import lesson36.model.Room;

import java.util.Arrays;
import java.util.Date;

public class DemoRoom {
    public static void main(String[] args) throws Exception {

        Date date=new Date();
        HotelController hotelController = new HotelController();
        Hotel tempo = hotelController.findHotelByName("S");
      //  System.out.println(tempo);

        Room room=new Room(3,300,true,true,date,tempo );
        RoomController roomController=new RoomController();

      //  roomController.addRoom(room);
        //roomController.deleteRoom(16);

        Filter filter= new Filter.Builder().setPrice(100).setCountry("hj").build();

        System.out.println( roomController.findRooms(filter));

    }
}
