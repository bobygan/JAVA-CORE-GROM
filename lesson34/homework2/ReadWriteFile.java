package lesson34.homework2;

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
        FileWriter writer = null;
        BufferedWriter br = null;
        try {
            writer = new FileWriter(path, true);
            // File file=new File("path");
            //writer = new FileWriter(new File("path"),true);
            br = new BufferedWriter(writer);
            br.append("\n");
            br.append(content);
        } catch (IOException e) {
            System.err.println("Can`t write to file");
        } finally {
            IOUtils.closeQuietly(br);
            IOUtils.closeQuietly(writer);
        }
    }

}
