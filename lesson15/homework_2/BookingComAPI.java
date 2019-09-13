package lesson15.homework_2;

import java.util.Arrays;
import java.util.Date;

public class BookingComAPI implements API{

    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {

        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int s = 0;
        Room[] roomtemps = new Room[rooms.length];

        for (Room roomfor :rooms) {
            if (    (roomfor != null)
                    &&(( roomfor.getPrice() <= (price + 100)) && (roomfor.getPrice() >= ((price - 100) < 0 ? 0 : (price - 100))))
                    && (roomfor.getPersons() == persons)
                    && (roomfor.getCityName() == city) && (roomfor.getHotelName() == hotel)) {
                roomtemps[s] = roomfor;
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
        else {return  roomtemps=new Room[0];}
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

    @Override
    public String toString() {
        return "BookingComAPI{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }



}
