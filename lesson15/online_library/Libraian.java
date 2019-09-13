package lesson15.online_library;

public class Libraian {

    private long id;
    private String name;
    private String password;
    private String Em;
    private String address;
    private String city;
    private  long contactNo;

    private  Book[]books;

    public Libraian(long id, String name, String password, String em, String address, String city, long contactNo, Book[] books) {
        this.id = id;
        this.name = name;
        this.password = password;
        Em = em;
        this.address = address;
        this.city = city;
        this.contactNo = contactNo;
        this.books = books;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEm() {
        return Em;
    }

    public void setEm(String em) {
        Em = em;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public Libraian add_books(String callNo,String Name,String Aurhor,String Publisher,long quantity){
        return null;
    }

    public Book[] view_books(){
        return books;
    }
    public Libraian issue_books(){
        return null;
    }

    public Libraian view_issued_books(){
        return null;
    }

    public Libraian return_books(){
        return null;
    }



}
