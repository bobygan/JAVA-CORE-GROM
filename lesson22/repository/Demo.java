package lesson22.repository;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        User user1 = new User(1001, "Daniil", "9u9u9unhniuhun");
        User user2= new User(1002, "Andrey", "iuhun");

        UserRepository.save(user1);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));
        UserRepository.save(user2);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));
        User user3 = new User(1001, "Test", "9u9u9unhniuhun");
        UserRepository.update(user3);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));

    }
}
