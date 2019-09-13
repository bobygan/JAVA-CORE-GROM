package lesson11.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }


    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        ArrayList<Room> roomtemps = new ArrayList<>();
        for (API api : apis) {

            if (api != null) {

                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    roomtemps.add(room);
                }
            }

        }
        return roomtemps.toArray(Room[]::new);
    }

    public Room[] check(API api1, API api2) {
        ArrayList<Room> roomtemps = new ArrayList<>();
        for (Room room01 : api1.getAll()) {
            for (Room room02 : api2.getAll()) {
                if ((room02.getHotelName() == room01.getHotelName()) &&
                        (room02.getPrice() == room01.getPrice()) &&
                        (room02.getPersons() == room01.getPersons()) &&
                        (room02.getCityName() == room01.getCityName())) {
                    roomtemps.add(room01);
                }
            }

        }return roomtemps.toArray(Room[]::new);
    }
    public Room cheapestRoom() {

        Room cheapRoom = new Room(0, 250, 2, new Date(), "F", "D");
        for (API api : apis) {
            for (Room room : api.getAll())
                if (cheapRoom.getPrice() > room.getPrice()) {
                    cheapRoom = room;
                }
        }
        return cheapRoom;
    }

}
