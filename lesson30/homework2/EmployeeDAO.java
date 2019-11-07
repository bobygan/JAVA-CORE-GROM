package lesson30.homework2;


import java.util.HashSet;
import java.util.Set;

public class EmployeeDAO {

    private static Set<Employee> employeeTreeSet = new HashSet<>();

    public static Employee add(Employee employee) {
        employeeTreeSet.add(employee);
        return employee;
    }

    public static Employee delet(Employee employee) {
        employeeTreeSet.remove(employee);
        return employee;
    }

    public static Set<Employee> getAll() {
        return employeeTreeSet;
    }
}




