package lesson30.homework3;



import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Firm {
    private Date dateFounded;
    private Set<Department> departments = new TreeSet<>();
    private Set<Customer> customers = new TreeSet<>();
}
