package lesson15.homework_2;


import java.util.Date;

public class TripAdvisorAPI implements API {

    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        int s = 0;
        Room[] roomtemps = new Room[rooms.length];

        for (int i = 0; i < (rooms.length); i++) {
            if (rooms[i] != null
                    && rooms[i].getPrice() == price
                    && ((rooms[i].getPersons() <= persons + 1) && (rooms[i].getPersons() >= ((persons - 1) < 1 ? 1 : (persons - 1))))
                    && rooms[i].getCityName() == city
                    && rooms[i].getHotelName() == hotel) {
                roomtemps[s] = rooms[i];
                s++;
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

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
