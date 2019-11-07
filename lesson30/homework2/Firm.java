package lesson30.homework2;

import lesson30.homework1.Transaction;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Firm {
    private Date dateFounded;
    private Set<Department> departments = new TreeSet<>();
    private Set<Customer> customers = new TreeSet<>();
}
