package lesson34.homework5;

/*
Напишите метод copyFileContent, который будет копиторать все содержимое файла fileFrom.txt
и записывать это в новый файл fileTo.txt. Используйте стандартные методы с JDK класса File.
Во втором методе используйте стандартные методы библиотеки Apache IO

Решение должно содержаться в классе Solution. Тестирование - в классе Demo

Сигнатура методов:
copyFileContent(String fileFromPath, String fileToPath)
copyFileContentApacheIO(String fileFromPath, String fileToPath)

  */

//import java.io.*;

//import org.apache.commons.*;

public class Solution
{}
   // public static void main(String[] args) throws Exception {
        //  copyFileContent(String fileFromPath, String fileToPath)
        //copyFileContentApacheIO(String fileFromPath, String fileToPath)
   // }
//}
/*
    public static void copyFileContent(String fileFromPath, String fileToPath) throws Exception {

        validate(fileFromPath, fileToPath);

        writeToFile(fileToPath, readFromFile(fileFromPath));
    }

    private static StringBuffer readFromFile(String path) {
        StringBuffer res = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                res.append(line);
                res.append("\n");
            }
            res.replace(res.length() - 1, res.length(), "");
        } catch (FileNotFoundException e) {
            System.err.printf("File does not exist");
        } catch (IOException e) {
            System.err.println("Reading from file" + path + "failed");

        }
        return res;
    }

    private static void writeToFile(String path, StringBuffer contentToWrite) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.append(contentToWrite);
        } catch (IOException e) {
            System.err.println();
        }
    }

    private static void validate(String fileFromPath, String fileToPath) throws Exception {
        File fileFrom = new File(fileFromPath);
        File fileTo = new File(fileToPath);

        if (!fileFrom.exists()) {
            throw new FileNotFoundException("File " + fileFrom + " does not exist");
        }
        if (!fileTo.exists()) {
            throw new FileNotFoundException("File " + fileTo + " does not exist");
        }
        if (!fileTo.canRead()) {
            throw new Exception("File " + fileFrom + " does not have permission to be read");
        }
        if (!fileTo.canWrite()) {
            throw new Exception("File " + fileTo + " does not have permission to be written");
        }
    }
    public static void copyFileContentApacheIO(String fileFromPath, String fileToPath)throws Exception {

        validateAP(fileFromPath, fileToPath);

        writeToFile(fileToPath, readFromFileAP(fileFromPath));
    }

    private static StringBuffer readFromFileAP(String path) {
        StringBuffer res = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                res.append(line);
                res.append("\n");
            }
            res.replace(res.length() - 1, res.length(), "");
        } catch (FileNotFoundException e) {
            System.err.printf("File does not exist");
        } catch (IOException e) {
            System.err.println("Reading from file" + path + "failed");

        }
        return res;
    }

    private static void writeToFileAP(String path, StringBuffer contentToWrite) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            bufferedWriter.append(contentToWrite);
        } catch (IOException e) {
            System.err.println();
        }
    }

    private static void validateAP(String fileFromPath, String fileToPath) throws Exception {
        File fileFrom = new File(fileFromPath);

        File fileTo = new File(fileToPath);

        if (!fileFrom.exists()) {
            throw new FileNotFoundException("File " + fileFrom + " does not exist");
        }
        if (!fileTo.exists()) {
            throw new FileNotFoundException("File " + fileTo + " does not exist");
        }
        if (!fileTo.canRead()) {
            throw new Exception("File " + fileFrom + " does not have permission to be read");
        }
        if (!fileTo.canWrite()) {
            throw new Exception("File " + fileTo + " does not have permission to be written");
        }
    }
}
*/
