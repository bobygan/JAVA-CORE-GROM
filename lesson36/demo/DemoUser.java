package lesson36.demo;

import lesson36.controller.UserController;
import lesson36.model.User;
import lesson36.model.UserType;

public class DemoUser {
    public static void main(String[] args) {

        User user=new User("ANDRII","hj","AN",UserType.USER);
        User user1=new User("AND","h","US",UserType.ADMIN);
        UserController userController=new UserController();
        try {
            userController.registerUser(user1);
        }
        catch (Exception e){}


    }
}
