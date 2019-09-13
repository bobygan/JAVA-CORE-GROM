package lesson11.homework;

import java.util.Arrays;

public class TripAdvisorAPI implements API  {
    private Room[]rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        Room[] roomtemp = new Room[0];
        int s = 0;
        for (int i = 0; i < (rooms.length - 1); i++) {
            if (rooms[i] != null && rooms[i].getPrice() == price && (rooms[i].getPersons()==persons+1||(rooms[i].getPersons()==((persons-1)<1?1:(persons-1))) && rooms[i].getCityName()==city && rooms[i].getHotelName()==hotel))
                s++;
            roomtemp  = Arrays.copyOf(roomtemp, roomtemp.length + 1);
            roomtemp[roomtemp.length - 1] = rooms[i];

        }

        return roomtemp;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
