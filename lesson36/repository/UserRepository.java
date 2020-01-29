package lesson36.repository;

import lesson36.model.User;

import java.io.*;
import java.util.Random;

public class UserRepository {

    //считывание данных
    //ороботка данных - маппинг данных
     public User registerUser(User user) {

         String path="d:/user.txt";
         try {
             validate(path);
             writeToFile(path, Sentences(user));

         } catch (Exception e) {
             System.out.println(e.getMessage());
         }

         return user;
    }

    private static void validate(String fileToPath) throws Exception {

        File fileTo = new File(fileToPath);

        if (!fileTo.exists()) {
            throw new FileNotFoundException("File " + fileTo + " does not exist");
        }

        if (!fileTo.canWrite()) {
            throw new Exception("File " + fileTo + " does not have permission to be written");
        }
    }

    private static void writeToFile(String path, StringBuffer contentToWrite) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.append(contentToWrite);
        } catch (IOException e) {
            System.err.println();
        }
    }

    private static StringBuffer Sentences( User user) {
        Random random = new Random();

        StringBuffer bufferTempAdd = new StringBuffer();

        bufferTempAdd.append((String.valueOf(random.nextInt(101))));
        bufferTempAdd.append(",");
        bufferTempAdd.append(user.getUserName());
        bufferTempAdd.append(",");
        bufferTempAdd.append(user.getPassword());
        bufferTempAdd.append(",");
        bufferTempAdd.append(user.getCountry());
        bufferTempAdd.append(",");
        bufferTempAdd.append(user.getUserType());
        bufferTempAdd.append(System.lineSeparator());
        return bufferTempAdd;
    }

}
