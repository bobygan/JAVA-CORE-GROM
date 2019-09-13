package lesson15.homework_2;

import java.util.Arrays;
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

                if (room.equals(new Room(22,price,persons,new Date(),hotel,city))){
                    roomtemps[s] = room;
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
            return roomtemps = new Room[0];
        }
    }

    public Room[] check(API api1, API api2) {
        int s = 0;
        Room[] roomtemps = new Room[40];

        for (Room room01 : api1.getAll()) {
            for (Room room02 : api2.getAll()) {
                if (room02.equals(room01) && room02.hashCode() == room01.hashCode()) {
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
            return roomtemps = new Room[0];
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Controller that = (Controller) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(apis, that.apis);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(apis);
    }
}
