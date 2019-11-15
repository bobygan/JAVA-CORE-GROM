package lesson30.homework2;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeDAO {

    private static TreeSet<Employee> employeeTreeSet = new TreeSet<>();

    public static Employee add(Employee employee) {
        employeeTreeSet.add(employee);
        return employee;
    }

    public static Employee delet(Employee employee) {
        employeeTreeSet.remove(employee);
        return employee;
    }

    public static TreeSet<Employee> getAll() {
        return employeeTreeSet;
    }


}




