package lesson11.df;

import java.util.Arrays;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int s = 0;
        Room[] roomtemps = new Room[rooms.length+1];

        for (int i = 0; i < (rooms.length - 1); i++) {

            if ((rooms[i] != null) && (rooms[i].getPrice() == price) &&
                    (rooms[i].getPersons() == persons) && (rooms[i].getCityName() == city) &&
                    (rooms[i].getHotelName() == hotel)) {
                roomtemps[s] = rooms[i];
                s++;
            }

        }

        if (s!=0) {
            Room[] roomRet = new Room[s];
            s = 0;
            for (Room room : roomRet) {
                roomRet[s]  = roomtemps[s];
                s++;
            }
            return roomRet;
        }
        else {return roomtemps=new Room[0];}
    }
        @Override
        public Room[] getAll () {
            return  rooms;
        }
    }
