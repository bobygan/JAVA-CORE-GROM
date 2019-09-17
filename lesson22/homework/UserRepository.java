package lesson22.homework;

import lesson20.task1.exceptions.BadRequestException;
import lesson20.task1.exceptions.InternalServelException;
import lesson20.task1.exceptions.UserNotFoundExeption;

public class UserRepository {
    private static User[] users;


    public static User  findById(long id) throws UserNotFoundExeption {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId()))
                return users[i];
        }
        throw new UserNotFoundExeption("User with ID: " + id + " not found");
    }


    public static User save(User user) throws Exception {
        if (user == null) {
            throw new BadRequestException("Cant save null user");
        }

        try {
            findById(user.getId());
            throw new BadRequestException("User with ID: " + user.getId() + " already exist");
        } catch (UserNotFoundExeption e) {
            System.out.println("User with ID: " + user.getId() + " not found. will be saved");
        }


        for (int i = 0; i < users.length; i++) {
            if (null == users[i]) {
                // тут мы и запишем
                users[i] = user;
                return users[i];
            }
        }
        throw new InternalServelException("Not enough spase with id: " + user.getId());
    }

    public static User update(User user) throws Exception {
        if (null == findById(user.getId())) {
            throw new BadRequestException("Cant save null user");
        }

        findById(user.getId());

        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (user.getId() == users[i].getId())) {
                users[i] = user;
                return users[i];
            }
        }
        throw new InternalServelException("Unexpected error");
    }

    public static void delete(long id) throws Exception{

        findById(id);

        for (int i = 0; i < users.length; i++) {
            if (id == users[i].getId()) {
                users[i] = null;
                break;
            }
        }
    }

}