package lesson36.service;

import lesson36.repository.UserRepository;
import lesson36.model.User;

public class UserService {

private UserRepository userRepositoty=new UserRepository();
    public User registerUser(User user){
           //проверяем бизнес логику
           //если все ок
        try {
            validate(user);
            return userRepositoty.registerUser(user);
        }
        catch (Exception e){
            System.out.println( e.getMessage());

        }
        return user;

    }

   private void validate(User user) throws Exception{

        if(user==null){
            throw new NullPointerException ("User data is wrong");
        }

        if(user.getUserName().equals("")||user.getUserName().equals(null)){
            throw new NullPointerException ("User data is wrong");


        }


   }


}
