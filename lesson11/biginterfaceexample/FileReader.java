package lesson11.biginterfaceexample;

public class FileReader implements Readable {

    @Override
    public void readFilesFromStorage(Storage storage) {
        //найти фал максимального размера
        //вывести всю информацию о нем
        print(findMaxSizeFile(storage.getFiles()));
    }

    private File findMaxSizeFile(File[] files) {
        File maxSizaFile = files[0];
        for (File file : files) {
            if (file != null && file.getSize() > maxSizaFile.getSize()) {
                maxSizaFile = file;
            }
        }
        return maxSizaFile;
    }

    private void print(File file) {
        System.out.println("max file will be printed now ....");
        System.out.println(file.getName());
        System.out.println(file.getExtension());
        System.out.println(file.getPath());
        System.out.println(file.getSize());
        System.out.println();

    }
}
