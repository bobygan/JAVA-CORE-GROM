package lesson15.online_library;

import java.util.Date;
import java.util.Random;
public class Book {


    private long id;
    private String callNo;
    private String Name;
    private String Aurhor;
    private String Publisher;
    private  long quantity;
    private Date addetDat;


    public Book(long id, String callNo, String name, String aurhor, String publisher, long quantity, Date addetDate) {
        this.id = id;
        this.callNo = callNo;
        Name = name;
        Aurhor = aurhor;
        Publisher = publisher;
        this.quantity = quantity;
        //this.addetDate = addetDate;
    }
}
