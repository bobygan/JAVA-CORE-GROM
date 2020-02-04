package lesson36.repository;


import lesson36.controller.Filter;
import lesson36.model.Hotel;
import lesson36.model.Room;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RoomRepository {

    //считывание данных
    //ороботка данных - маппинг данных
    String path = "d:/room.txt";

    public Room addRoom(Room room) {
        try {
            validate(path);
            writeToFile(path, Sentences(room));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return room;
    }

    public boolean deleteRoom(long RoomId) {
        try {
            validate(path);
            writeToFile(path, del(readFromFile(path), RoomId, true));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return true;
    }

    public HashSet<Room> findRooms(Filter filter) throws Exception {

        HashSet<Room> tempfilter = new HashSet<>();
        HashSet<Room> temp = map(readFromFile(path));

         temp.stream()

                .filter(p -> p.getPrice()  == (filter.getPrice()==0 ? p.getPrice():filter.getPrice() ))
                .filter(p -> p.getNumberOfGuests() == (filter.getNumberOfGuests()==0 ? p.getNumberOfGuests():filter.getNumberOfGuests()))
                .filter(p->p.isPetsAllowed()==(!filter.isPetsAllowed() ? p.isPetsAllowed():filter.isPetsAllowed()))
                .filter(p->p.isBreakfastIncluded()== (!filter.isBreakfastIncluded() ? p.isBreakfastIncluded() : filter.isBreakfastIncluded()))
                //не получается в этом месте использовать иквелс ??????????
               // .filter(p->p.getHotel().getCountry()==((filter.getCountry()==null ? p.getHotel().getCountry():filter.getCountry())))
               // .filter(p->p.getHotel().getCity().equals((filter.getCity().equals("") ? p.getHotel().getCity() :filter.getCity())))

                .collect(Collectors.toSet())
               .forEach(System.out::println);
         //не нашел как перекинуть отфильтрованное значение в переменную
        System.out.println(temp);
        return temp;

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

    private static StringBuffer Sentences(Room room) {
        Random random = new Random();

        StringBuffer bufferTempAdd = new StringBuffer();

        bufferTempAdd.append((String.valueOf(random.nextInt(101))));
        bufferTempAdd.append(",");
        bufferTempAdd.append(room.getNumberOfGuests());
        bufferTempAdd.append(",");
        bufferTempAdd.append(room.getPrice());
        bufferTempAdd.append(",");
        bufferTempAdd.append(room.isBreakfastIncluded());
        bufferTempAdd.append(",");
        bufferTempAdd.append(room.isPetsAllowed());
        bufferTempAdd.append(",");
        bufferTempAdd.append(room.getDateAvailableFrom());
        bufferTempAdd.append(",");
        bufferTempAdd.append(room.getHotel().getId());
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

    private static StringBuffer del(StringBuffer content, long roomId, boolean addOrRemowe) {

        StringBuffer bufferTempAdd = new StringBuffer();
        StringBuffer bufferTempRemowe = new StringBuffer();

        String[] temp = content.toString().split("[\n]\\s*"); //разбиваем на строки
        //  System.out.println(Arrays.deepToString(temp));
        for (int i = 0; i < temp.length; i++) {

            String[] temp2 = temp[i].split("[,]\\s*");
            // System.out.println(Arrays.deepToString(temp2));
            if (Long.parseLong(temp2[0]) != roomId) {
                System.out.println(temp2[0]);
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

    private static HashSet<Room> map(StringBuffer content) throws Exception {

        StringBuffer bufferTemp = new StringBuffer();
        String[] temp2 = content.toString().split("[/\\r\\n|\\r|\\n/]\\s*"); //разбиваем на строки


        HashSet<Room> TempSet = new HashSet<>();
        HotelRepository hotelRepository = new HotelRepository();

        for (int i = 0; i < temp2.length; i++) {
            String[] temp = temp2[i].split("[,]\\s*");//split("[,]\\s*"); //разбиваем на элементы
            Room room;
            room = new Room(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], hotelRepository.findHotel(Long.valueOf(temp[6])));
            TempSet.add(room);

        }
        return TempSet;
    }


}
