package lesson30.homework2;

import java.util.Set;
import java.util.TreeSet;

public class Department {
   private DepartmentType type;
   private Set<Employee> employees;//=new TreeSet<>();

    public Department(DepartmentType type, Set<Employee> employees) {
        this.type = type;
        this.employees = employees;
    }


}
