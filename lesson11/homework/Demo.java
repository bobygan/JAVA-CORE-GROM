package lesson11.homework;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        Date date = new Date();
        Room room1 = new Room(23, 234, 3, date, "Hilton", "Odessa");
        Room room2 = new Room(23, 201, 3, date, "er", "Odessa");
        Room room3 = new Room(23, 400, 3, date, "er", "Odessa");
        Room room4 = new Room(23, 340, 3, date, "er", "Odessa");
        Room room5 = new Room(23, 340, 3, date, "er", "Odessa");
        Room room6;




        Room[] rooms = new Room[]{room1, room2, room3, room4, room5};

        API api1 = new BookingComAPI(rooms);
        API api2 = new TripAdvisorAPI(rooms);
        API api3 = new GoogleAPI(rooms);

        API[] apis = new API[]{api1, api2, api3};

        Controller controller=new Controller(apis);
        System.out.println(Arrays.toString((controller.requestRooms(234, 3, "Odessa", "er"))));


        BookingComAPI bookingComAPI=new BookingComAPI(rooms);
        TripAdvisorAPI tripAdvisorAPI=new TripAdvisorAPI(rooms);
        GoogleAPI googleAPI= new GoogleAPI(rooms);



    }
}


