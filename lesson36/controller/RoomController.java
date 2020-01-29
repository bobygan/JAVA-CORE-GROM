package lesson36.controller;


import lesson36.model.Room;
import lesson36.service.RoomService;

import java.util.HashSet;

public class RoomController {
    private RoomService roomService = new RoomService();

    public Room addRoom (Room room) {
        return roomService.addRoom(room);
    }

    public boolean deleteRoom (long roomId) {
        return roomService.deleteRoom(roomId);
    }

    public HashSet<Room> findRooms(Filter filter) throws Exception {return roomService.findRooms(filter);}


}
