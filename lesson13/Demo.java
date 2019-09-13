package lesson13;



import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        User user = new User(23, "DF", "DF");
        // user=null;
        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        int n = 15;
        while (n > 0) {
            User user1 = new User(n, "DF", "DF");
          //  userRepository.save(user1);
            System.out.println( userRepository.save(user1));
            n--;
        }
//ekhnglijnr

        System.out.println(Arrays.deepToString(userRepository.getUsers()));
      //  userRepository.save(null);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        //Сохронение юзера
        //Сохранение тогоже юзера
        //Нет места в массиве
        //Когда Null
      //  System.out.println(user.toString());


    }
}