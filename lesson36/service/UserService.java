package lesson36.service;

import lesson36.repository.Repository;
import lesson36.model.User;

import java.io.IOException;
import java.rmi.NotBoundException;

public class UserService {

private  Repository  repositoty=new Repository();
    public User registerUser(User user)throws Exception{
            validate(user);
            return repositoty.registerUser(user);
    }

   private void validate(User user) throws IOException{
            if(user.getUserName().equals("")||user.getUserName().equals(null)){
            throw new IOException( "User data is wrong");
        }
   }
}
