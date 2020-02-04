package lesson36.repository;

import lesson36.model.Hotel;
import lesson36.model.User;
import lesson36.model.UserType;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class HotelRepository {
    String path = "d:/hotel.txt";
    //считывание данных
    //ороботка данных - маппинг данных
    public Hotel addHotel(Hotel hotel) {


        try {
            validate(path);
            System.out.println("hotel dan");
            writeToFile(path, Sentences(hotel));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return hotel;
    }

    public boolean deleteHotel(long hotelId) {

        String path = "d:/hotel.txt";
        try {
            validate(path);
            // System.out.println("hotel delete dan");
            // System.out.println(readFromFile(path));
            // System.out.println(del( readFromFile(path),hotelId,true));
            //  del( readFromFile(path),hotelId,false);
            writeToFile(path, del(readFromFile(path), hotelId, true));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return true;
    }

    public Hotel findHotelByName(String name) {

        try {
            validate(path);
            return ((map(findByName(readFromFile(path), name))));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public Hotel findHotel(long id) {

        try {
            validate(path);

            return ((map(findById(readFromFile(path), id))));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public Hotel findHotelByCity(String city) {
        try {
            validate(path);

            return ((map(findByCity(readFromFile(path), city))));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return null;
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

    private static StringBuffer Sentences(Hotel hotel) {
        Random random = new Random();

        StringBuffer bufferTempAdd = new StringBuffer();

        bufferTempAdd.append((String.valueOf(random.nextInt(101))));
        bufferTempAdd.append(",");
        bufferTempAdd.append(hotel.getName());
        bufferTempAdd.append(",");
        bufferTempAdd.append(hotel.getCountry());
        bufferTempAdd.append(",");
        bufferTempAdd.append(hotel.getCity());
        bufferTempAdd.append(",");
        bufferTempAdd.append(hotel.getStreet());
        bufferTempAdd.append(System.lineSeparator());
        return bufferTempAdd;
    }

    private static StringBuffer readFromFile(String path) {
        StringBuffer res = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                res.append(line);
                res.append("\n");
            }

        } catch (FileNotFoundException e) {
            System.err.printf("File does not exist");
        } catch (IOException e) {
            System.err.println("Reading from file" + path + "failed");

        }
        return res;
    }

    private static StringBuffer del(StringBuffer content, long hotelId, boolean addOrRemowe) {

        StringBuffer bufferTempAdd = new StringBuffer();
        StringBuffer bufferTempRemowe = new StringBuffer();

        String[] temp = content.toString().split("[\n]\\s*"); //разбиваем на строки
        // System.out.println((temp));


        for (int i = 0; i < temp.length; i++) {
            // System.out.println(temp[i]+"---"+i);
            // temp[i] = temp[i] + "." + " ";
            String[] temp2 = temp[i].split("[,]\\s*");
            //  System.out.println(temp2[0]);
            if (Long.parseLong(temp2[0]) != hotelId) {
                //     System.out.println(temp2[0]);
                bufferTempAdd.append(temp[i]);
                bufferTempAdd.append(System.lineSeparator());
                temp[i] = "";
            }
            bufferTempRemowe.append(temp[i]);
            // System.out.println(i);
            bufferTempRemowe.append(System.lineSeparator());
        }

        if (addOrRemowe) {
            return bufferTempAdd;
        }
        return bufferTempRemowe;
    }

    private static StringBuffer findByName(StringBuffer content, String name) {
        StringBuffer bufferTemp = new StringBuffer();
        String[] temp = content.toString().split("[\n]\\s*"); //разбиваем на строки

        for (int i = 0; i < temp.length; i++) {
            String[] temp2 = temp[i].split("[,]\\s*");
            if ((temp2[1]).equals(name)) {
                bufferTemp.append(temp[i]);
                bufferTemp.append(System.lineSeparator());
            }

        }
        return bufferTemp;
    }

    private static StringBuffer findByCity(StringBuffer content, String city) {
        StringBuffer bufferTemp = new StringBuffer();
        String[] temp = content.toString().split("[\n]\\s*"); //разбиваем на строки


        for (int i = 0; i < temp.length; i++) {
            String[] temp2 = temp[i].split("[,]\\s*");
            if (!(temp2[2]).equals(city)) {
                bufferTemp.append(temp[i]);
                bufferTemp.append(System.lineSeparator());
            }
        }
        return bufferTemp;
    }

    private static StringBuffer findById(StringBuffer content, Long Id) {
        StringBuffer bufferTemp = new StringBuffer();
        String[] temp = content.toString().split("[\n]\\s*"); //разбиваем на строки


        for (int i = 0; i < temp.length; i++) {
            String[] temp2 = temp[i].split("[,]\\s*");
            if (!(temp2[0]).equals(Id)) {
                bufferTemp.append(temp[i]);
                bufferTemp.append(System.lineSeparator());
            }
        }
        return bufferTemp;
    }

    private static Hotel map(StringBuffer content) {

      //  StringBuffer bufferTemp = new StringBuffer();
        String[] temp2 = content.toString().split("[/\\r\\n|\\r|\\n/]\\s*"); //разбиваем на строки
        String[] temp = temp2[0].split("[,]\\s*");//split("[,]\\s*"); //разбиваем на элементы

        Hotel Temp = new Hotel(Long.parseLong(temp[0]), temp[1], temp[2], temp[3], temp[4]);

        return Temp;

    }
}