package lesson22.repository;

public class UserRepository {
    private static User[] users=new User[10];


 //   public UserRepository(User[] users) {
   //     this.users = users;
    //}

    public static User[] getUsers() {
        return users;
    }

    public static String[] getUserNames() {
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

    public static long[] getUserIds() {
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

    public static String getUserNameById(long id) {

        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                return users[i].getName();
            }
        }
        return null;
    }

    public static User getUserByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if (name != null && (users[i] != null) && (name == users[i].getName()))
                return users[i];
        }
        return null;
    }

    public static User getUserById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId()))
                return users[i];
        }
        return null;
    }

    public static User getUserBySessionId(String sessionId) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (sessionId == users[i].getSessionId()))
                return users[i];
        }
        return null;
    }

    private static User findById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId()))
                return users[i];
        }
        return null;
    }

    public static User save(User user) {
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

    public static User update(User user) {
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

    public static void delete(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                users[i] = null;
            }
        }
        return;
    }

}