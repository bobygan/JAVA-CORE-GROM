package lesson30.homework3;

import java.util.Set;

public class Department {
   private DepartmentType type;
   private Set<Employee> employees;//=new TreeSet<>();

    public Department(DepartmentType type, Set<Employee> employees) {
        this.type = type;
        this.employees = employees;
    }

    public DepartmentType getType() {
        return type;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "type=" + type +
              //  ", employees=" + employees +
                '}';
    }
}
