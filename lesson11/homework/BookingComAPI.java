package lesson11.homework;

import java.util.Arrays;

public class BookingComAPI implements API {

    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {

        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int s = 0;
        Room[] roomtemps = new Room[rooms.length - 1];

        for (int i = 0; i < (rooms.length - 1); i++) {

            if (rooms[i] != null && (rooms[i].getPrice() >= price + 100 || rooms[i].getPrice() <= ((price - 100) < 0 ? 0 : price - 100)) && rooms[i].getPersons() == persons && rooms[i].getCityName() == city && rooms[i].getHotelName() == hotel) {

                //   Room[] roomtemps = new Room[10]
                roomtemps[s] = rooms[i];
                s++;
            }

        }


        Room[] roomRet = new Room[s ];
        s = 0;
        for (Room room : roomRet) {
            room = roomtemps[s];

            s++;
        }

        return roomRet;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
