package lesson34.homework1;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class ReadWriteFile {
    public static void readFile(String path) {
        FileReader reader;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.err.println("File does not exist");
        } catch (IOException e) {
            System.err.println("Reading from file " + path + " failed");
        }

    }


    public static void writeFile(String path, String content) {

        try ( BufferedWriter br = new BufferedWriter(new FileWriter(path,true))){
            br.append("\n");
            br.append(content);
        } catch (IOException e) {
            System.err.println("Can`t write to file");
        }
    }
}
