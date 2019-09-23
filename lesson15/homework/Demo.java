package lesson15.homework;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        User user1 = new User(1, "DF", "DF");
        User user2 = new User(2, "DF", "DF");
        User user3 = new User(3, "DF", "DF");
        User user4=null;

        User user6 = new User(5, "Ft", "FF");

        User[]users=new User[]{user1,user2,user3,user4};

        UserRepository userRepositories=new UserRepository(users);

       // UserRepository[] userRepository = new UserRepository[]{user1,user2};
    //    Sys.out.println(Arrays.deepToString(userRepository.getUsers()));

   //     User user=null;
      //  userRepository.save(user);
      //  Sys.out.println(Arrays.deepToString(userRepositories.getUsers()));

        userRepositories.delete(1);
        System.out.println(Arrays.deepToString(userRepositories.getUsers()));


        userRepositories.save(user1);
        System.out.println(Arrays.deepToString(userRepositories.getUsers()));
        userRepositories.update(user6);
        System.out.println(Arrays.deepToString(userRepositories.getUsers()));

     //   userRepository.save(user);
      //  Sys.out.println(Arrays.deepToString(userRepository.getUsers()));
       // int n = 15;
       // while (n > 0) {
        //    User user1 = new User(n, "DF", "DF");
            //  userRepository.save(user1);
          //  Sys.out.println( userRepository.save(user1));
         //   n--;
        //}
//ekhnglijnr

      //  Sys.out.println(Arrays.deepToString(userRepository.getUsers()));
        //  userRepository.save(null);
      //  Sys.out.println(Arrays.deepToString(userRepository.getUsers()));
        //Сохронение юзера
        //Сохранение тогоже юзера
        //Нет места в массиве
        //Когда Null
        //  Sys.out.println(user.toString());


    }
}
