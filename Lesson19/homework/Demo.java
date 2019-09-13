package Lesson19.homework;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        try {
            File file0 = new File(0, "AA", "EXE", 2);
            File file1 = new File(6, "AA", "EXE", 2);
            File file2 = new File(2, "AAjjjjjjjA", "COM", 2);
            File file3 = new File(3, "AAjhjhA", "EXE", 2);
            File file4 = new File(4, "B", "EXE", 2);
            File file5 = new File(2, "rrrnjjjj", "EXE", 2);

            File file8 = new File(8, "aA9AA", "EXE", 2);
            File file9 = new File(1, "aA9AA", "EXE", 0);
            File file10 = new File(11, "kjkj", "EXE", 3);
            File files[] = {file0, file1,null, file2};
            File files1[] = {file1, file2, file4, file9};
            File files2[] = {file0, null, file4, file9, file1, null};


            Storage storage0 = new Storage(22, files1, new String[]{"EXE", "COM"}, "UA", 255);
            Storage storage1 = new Storage(23, files1, new String[]{"EXE", "COM"}, "UA", 255);
            Storage storage2 = new Storage(24, files2, new String[]{"EXE", "COM"}, "UA", 255);
           // Storage storage2 =null;


                    Controller controller = new Controller();

            System.out.println("проверка метода delete");

            try {
                controller.delete(storage2, file1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                controller.delete(storage1, file10);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            try {
                controller.delete(storage1, file2);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


            System.out.println("проверка метода put");
            System.out.println(storage0);
            try {
                System.out.println(controller.put(storage1, file0));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(storage0);

            System.out.println("проверка метода трансфер file");
            System.out.println(storage0);
            System.out.println(storage1);
            try {
                controller.transferFile(storage0, storage1, 1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(storage0);
            System.out.println(storage1);

            System.out.println("проверка метода трансфер all");
            System.out.println(storage0);
            System.out.println(storage1);
            try {
                controller.transferAll(storage0, storage1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(storage0);
            System.out.println(storage1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        }
    }
