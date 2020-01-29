package lesson36.controller;

import lesson36.service.UserService;
import lesson36.model.User;

public class UserController {
    // findHoteByName(String name)
    // findHotelByCity(String city)
    // Collection findRooms(Filter filter)
    // void bookRoom(long roomId, long userId, long hotelId)
    //  void cancelReservation(long roomId, long userId)
    private UserService userService = new UserService();

    public User registerUser(User user) {
        return userService.registerUser(user);
    }

  //  public
    // void login(String userName, String password)
    //  void logout()
}
