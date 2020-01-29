package lesson36.service;

import lesson36.controller.Filter;
import lesson36.model.Hotel;
import lesson36.model.Room;
import lesson36.repository.HotelRepository;
import lesson36.repository.RoomRepository;

import java.util.HashSet;

public class RoomService {

    private RoomRepository roomRepository = new RoomRepository();

    public Room addRoom(Room room) {
        //проверяем бизнес логику
        //если все ок
        try {
            validate(room);
            return roomRepository.addRoom(room);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return room;

    }


    public boolean deleteRoom (long RoomId) {
        return roomRepository.deleteRoom(RoomId);
    }
    public HashSet<Room> findRooms(Filter filter) throws Exception {return roomRepository.findRooms(filter);}

    private void validate(Room room) throws Exception {
        if (room == null) {
            throw new NullPointerException("User data is wrong");
        }
    }

}
