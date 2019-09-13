package lesson15.homework;

import java.util.Arrays;

public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }


    public User save(User user) {

        if (user==findUser(user)) {
            return null;
        }

        for (int i = 0; i < users.length; i++) {
            if (null == users[i]) {
                // тут мы и запишем
                users[i] = user;
                return users[i];
            }
        }
        return null;
    }


    public User update(User user) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (user.getId() == users[i].getId())) {
                users[i] = user;
                return users[i];
            }

        }
        return null;
    }


    public void delete(long id) {

        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                users[i] = null;
            }
        }
    }

    public User findUser(User user) {

        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].equals(user)) {
                return users[i];
            }
        }
        return null;
    }

    public User[] getUsers() {
        return users;
    }


}


