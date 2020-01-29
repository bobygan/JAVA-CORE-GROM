/*
Напишите метод transferSentences, который будет переносить все предложения в файле fileFrom.txt,
содержащее входящее слово, в новый файл fileTo.txt.
Предоложением считае текст находящийся между двумя точками (.) длинной больше 10.
Перенесенное предложение при этом должно быть удалено из входящего файла.
Если какого-то из файлов не существует или возникла ошибка работы по стримами,
выбрасывайте соответствующую ошибку, описание которой должно содержать имя (путь) проблемного файла

Решение должно содержаться в классе Solution. Тестирование - в классе Demo

Сигнатура метода:
transferSentences(String fileFromPath, String fileToPath, String word)
 */

package lesson34.homework3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

    public static void transferSentences(String fileFromPath, String fileToPath, String word) {

        try {
            validate(fileFromPath, fileToPath);
            writeToFile(fileToPath, Sentences(readFromFile(fileFromPath), word,true));
            writeToFile(fileFromPath, Sentences(readFromFile(fileFromPath), word,false));

        } catch (Exception e) {
            e.getMessage();
        }


    }

    private static StringBuffer Sentences(StringBuffer content, String word, boolean addOrRemowe) {

        StringBuffer bufferTempAdd = new StringBuffer();
        StringBuffer bufferTempRemowe = new StringBuffer();

        String[] temp = content.toString().split("[.!?]\\s*"); //разбиваем на предложения
        //System.out.println(Arrays.toString(temp));


        for (int i = 0; i < temp.length; i++) {
            temp[i] = temp[i] + "." + " ";
            String[] temp2 = temp[i].split(" ");
            if (temp2.length > 10 - 1 && temp[i].contains(" " + word + " ")) {
                bufferTempAdd.append(temp[i]);
                temp[i] = "";
            }
            bufferTempRemowe.append(temp[i]);
        }

        if (addOrRemowe) {
            return bufferTempAdd;
        }
        return bufferTempRemowe;
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
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, false))) {
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
}

