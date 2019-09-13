package Lesson19.homework;

public class Controller {

    public File put(Storage storage, File file) throws Exception {//- добавляет файл в хранилище. гарантируется что файл уже есть в условной БД
        validate(storage, file);
        int count = 0;
        for (File element : storage.getFiles()) {
            if (element == null) {
                storage.getFiles()[count] = file;
                break;
            }
            count++;
        }
        return storage.getFiles()[count];
    }


    public void delete(Storage storage, File file) throws Exception {
        for (int i = 0; i < storage.getFiles().length; i++) {
            if (storage.getFiles(i).getId() == file.getId()) {
                storage.getFiles()[i] = null;
                break;
            }
        }
        return;
    }


    public void transferAll(Storage storageFrom, Storage storageTo) throws Exception {//- трансфер всех файлов из одного хранилища в другое

        checkForFreePlace(storageTo, storageFrom.getFiles().length);  //проверка достаточно ли пустых ячеек
        checSize(storageTo, storageFrom);                             //проверка достаточно ли памяти
        for (int i = 0; i < storageFrom.getFiles().length; i++) {
            checkFormat(storageTo, storageFrom.getFiles()[i]);
            findById(storageTo, storageFrom.getFiles()[i].getId());
        }
        //а теперь можно и трансвер запустить
        for (int i = 0; i < storageFrom.getFiles().length; i++) {
            if(storageFrom.getFiles()[i]!=null) {
                for (int j = 0; j < storageTo.getFiles().length; j++) {
                    if (storageTo.getFiles()[j] == null) {
                        storageTo.getFiles()[j] = storageFrom.getFiles()[i];
                        storageFrom.getFiles()[i] = null;
                        break;
                    }
                }
            }
        }
        return;
    }


    public void transferFile(Storage storageFrom, Storage storageTo, long id) throws Exception {//- трансфер файла с хранилища одного хранилища в другое по его айди. гарантируется что файл с таким id точно есть в хранилище storageFrom
        for (File element : storageFrom.getFiles()) {
            if (element.getId() == id) {
                put(storageTo, element);
                return;
            }
        }
        throw new Exception("file id=" + id + "transfer is not posible ");
    }

    private static void validate(Storage storage, File file) throws Exception {
        checkFormat(storage, file);
        checSize(storage, file);
        checkForFreePlace(storage);
        findById(storage, file.getId());
    }


    private static void checkFormat(Storage storage, File file) throws Exception {
        for (String element : storage.getFormatsSupported()) {
            if (element.equals(file.getFormat())) {
                return;
            }
        }
        throw new Exception("format of file id=" + file.getId() + " not supported by storage id=" + storage.getId());
    }


    private static void checkForFreePlace(Storage storage) throws Exception {
        for (int i = 0; i < storage.getFiles().length; i++) {
            if (storage.getFiles()[i] == null) {
                return;
            }
        }
        throw new Exception("do not have free place in storage id= " + storage.getId());
    }

    private static void checkForFreePlace(Storage storage, int placesNeeded) throws Exception {
        int count = 0;
        for (int i = 0; i < storage.getFiles().length; i++) {
            if (storage.getFiles()[i] == null) {
                count++;
            }
        }
        if (count < placesNeeded)
            throw new Exception(" do not have free place in storage id= " + storage.getId());
    }

    private static void findById(Storage storage, long id) throws Exception {
        for (File file : storage.getFiles()) {

            if (file != null && file.getId() == id) {
                throw new Exception("file id=" + id + " already exist in storage id=" + storage.getId());
            }
        }
        return;
    }

    private static void checSize(Storage storage, File file) throws Exception {
        long SUM = 0;
        for (int i = 0; i < storage.getFiles().length; i++) {
            if (storage.getFiles()[i] != null) {
                SUM += storage.getFiles()[i].getSize();
            }
        }
        if (SUM + file.getSize() > storage.getStorageSize()) {
            throw new Exception("file id=" + file.getId() + " too big size fore storage id=" + storage.getId());
        }
        return;
    }

    private static void checSize(Storage storageTo, Storage storageFrom) throws Exception {
        if (sum(storageTo) + sum(storageFrom) > storageTo.getStorageSize()) {
            throw new Exception("storageFrom id=" + storageFrom.getId() + " too big size fore storageTo id=" + storageTo.getId());
        }
        return;
    }

    private static long sum(Storage storage) {
        long SUM = 0;
        for (int i = 0; i < storage.getFiles().length; i++) {
            if (storage.getFiles()[i] != null) {
                SUM += storage.getFiles()[i].getSize();
            }
        }
        return SUM;
    }
}