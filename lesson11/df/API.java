package lesson11.df;

public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}
