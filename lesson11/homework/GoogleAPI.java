package lesson11.homework;

import java.util.Arrays;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room[] roomtemps = new Room[0];
        for (int i = 0; i < (rooms.length - 1); i++) {

            if ((rooms[i] != null) && (rooms[i].getPrice() == price) &&
                    (rooms[i].getPersons() == persons) && (rooms[i].getCityName() == city) &&
                    (rooms[i].getHotelName() == hotel)) {

                roomtemps = Arrays.copyOf(roomtemps, roomtemps.length + 1);

                roomtemps[roomtemps.length-1] = rooms[i];
            }

        }
        return roomtemps;
    }
        @Override
        public Room[] getAll () {
            return new Room[0];
        }
    }
