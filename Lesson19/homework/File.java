package Lesson19.homework;

public class File {
    private long id;
    private String name;
    private String format;
    private long size;


    public File(long id, String name, String format, long size) throws Exception{
        this.id = id;
        this.name = name;
        this.format = format;
        this.size = size;

        if (name.length() > 10) {
            throw new Exception("file id=" + id + " have too long name");
        }
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", format='" + format + '\'' +
                ", size=" + size +
                '}';
    }
}
