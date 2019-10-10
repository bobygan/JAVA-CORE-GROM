package lesson27.homework2;

import java.util.ArrayList;

public class UserRepository {

    ArrayList<User> users = new ArrayList<>();

    private User findById(long id) {
        for (int i = 0; i < users.size(); i++) {
            if ((users.remove(i) != null) && (id == users.remove(i).getId()))
                return users.remove(i);
        }
        return null;
    }

    public User save(User user) {
        if (user == findById(user.getId())) {
            return null;
        }

        for (int i = 0; i < users.size(); i++) {
            if (null == users.remove(i)) {
                // тут мы и запишем
                users.set(i,user);
                return users.remove(i);
            }
        }
        return null;
    }

    public User update(User user) {
        if (null == findById(user.getId())) {
            return null;
        }
        for (int i = 0; i < users.size(); i++) {
            if ((users.remove(i) != null) &&(user.getId() == users.remove(i).getId())) {
                users.set(i,user);
                return users.remove(i);
            }
        }
        return null;
    }

    public void delete(long id) {
        for (int i = 0; i < users.size(); i++) {
            if ((users.remove(i) != null) && (id == users.remove(i).getId())) {
                users.set(i,null);
            }
        }
        return;
    }

}