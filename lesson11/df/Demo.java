package lesson11.df;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {

        Date date = new Date();
        Room room1 = new Room(23, 100, 5, date, "er", "Odessa");
        Room room2 = new Room(23, 100, 4, date, "er", "Odessa");
        Room room3 = new Room(23, 100, 3, date, "er", "Odessa");
        Room room4 = new Room(23, 100, 2, date, "er", "Odessa");
        Room room5 = new Room(23, 100, 1, date, "er", "Odessa");
        Room room6;




        Room[] rooms = new Room[]{room1, room2, room3, room4, room5};

        API api1 = new BookingComAPI(rooms);
        API api2 = new TripAdvisorAPI(rooms);
        API api3 = new GoogleAPI(rooms);

        API[] apis = new API[]{api1, api2, api3};

        Controller controller=new Controller(apis);
      //  Sys.out.println(Arrays.toString((controller.requestRooms(234, 3, "Odessa", "er"))));


        BookingComAPI bookingComAPI=new BookingComAPI(rooms);
        TripAdvisorAPI tripAdvisorAPI=new TripAdvisorAPI(rooms);
        GoogleAPI googleAPI= new GoogleAPI(rooms);


       // Print prints=new Print();
      //  prints.printing(( bookingComAPI.findRooms(234, 3, "Odessa", "er")));
      //  prints.printing ((tripAdvisorAPI.findRooms(100, 3, "Odessa", "er")));
        //prints.printing ((googleAPI.findRooms(201, 3, "Odessa", "er")));
       // prints.printing ((controller.requestRooms(234, 3, "a", "a")));
    //    prints.printing((controller.cheapestRoom()));
      //

        //Проверка методов

        //Проверка на null
        Room roomchek1 = new Room(23, 100, 5, date, "er", "Odessa");
        Room roomchek2 = null;


        Room[] check1 = new Room[]{roomchek1, roomchek2,null};

        API apicheck1 = new BookingComAPI(check1);
        API apicheck2 = new TripAdvisorAPI(check1);
        API apicheck3 = new GoogleAPI(check1);

        System.out.println(check1[0].toString());
        apicheck1.getAll();


    }
}


