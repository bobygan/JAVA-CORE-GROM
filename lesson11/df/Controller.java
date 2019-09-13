package lesson11.df;

import java.util.ArrayList;
import java.util.Date;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }


    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        int s = 0;
        Room[] roomtemps = new Room[40];
        for (API api : apis) {

                for (Room room : api.getAll()) {

                    if (room.getPrice()==price
                            && room.getPersons()==persons
                            && room.getCityName()==city
                            && room.getHotelName()==hotel
                    ){
                    roomtemps[s] = room;
                    s++;}

                }
            }


        if (s != 0) {
            Room[] roomRet = new Room[s];
            s = 0;
            for (Room room : roomRet) {
                roomRet[s] = roomtemps[s];
                s++;

            }
            return roomRet;
        } else {
            return roomtemps=new Room[0];
        }
    }

    public Room[] check(API api1, API api2) {
        int s = 0;
        Room[] roomtemps = new Room[40];

        for (Room room01 : api1.getAll()) {
            for (Room room02 : api2.getAll()) {
                if ((room02.getHotelName() == room01.getHotelName()) &&
                        (room02.getPrice() == room01.getPrice()) &&
                        (room02.getPersons() == room01.getPersons()) &&
                        (room02.getCityName() == room01.getCityName())) {

                    roomtemps[s] = room01;
                    s++;
                }
            }

        }
        if (s != 0) {
            Room[] roomRet = new Room[s];
            s = 0;
            for (Room room : roomRet) {
                roomRet[s] = roomtemps[s];
                s++;

            }
            return roomRet;
        } else {
            return roomtemps=new Room[0];
        }

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
