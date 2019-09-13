package lesson9.User;

public class UserRepository {
    private User[] users;


    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        String[] names = new String[users.length];
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                names[j] = users[i].getName();
                j++;
            }
        }
        return names;
    }

    public long[] getUserIds() {
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {

                j++;
            }
        }

        long[] id = new long[j];
        int f = 0;
        for (int i = 0; i < j; i++) {
            if (users[i] != null) {
                id[f] = users[i].getId();
                f++;
            }
        }
        return id;
    }

    public String getUserNameById(long id) {

        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                return users[i].getName();
            }
        }
        return null;
    }

    public User getUserByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (name != null && (users[i] != null) && (name == users[i].getName()))
                return users[i];
        }
        return null;
    }

    public User getUserById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId()))
                return users[i];
        }
        return null;
    }

    public User getUserBySessionId(String sessionId) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (sessionId == users[i].getSessionId()))
                return users[i];
        }
        return null;
    }

    private User findById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId()))
                return users[i];
        }
        return null;
    }

    public User save(User user) {
        if (user == findById(user.getId())) {
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
        if (null == findById(user.getId())) {
            return null;
        }
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) &&(user.getId() == users[i].getId())) {
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
        return;
    }

}