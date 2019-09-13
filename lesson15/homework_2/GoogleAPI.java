package lesson15.homework_2;

import java.util.Date;

public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int s = 0;

        for (Room room :rooms) {
            if (room.equals(new Room( price, persons, hotel, city))) {
                s++;
            }
        }
            Room[] roomRet = new Room[s];
            int index = 0;
            for (Room room : rooms) {
                if (room.equals(new Room( price, persons, hotel, city))) {
                    roomRet[index]=room;
                    index++;
                }
            }
            return roomRet;
        }


    @Override
    public Room[] getAll() {
        return rooms;
    }
}
