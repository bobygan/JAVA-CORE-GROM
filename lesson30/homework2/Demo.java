package lesson30.homework2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class Demo {
    public static void main(String[] args) {
        Set<Employee>employees1=new HashSet<>();

        Customer customer1=new Customer("AS","UA",123);
        Customer customer2=new Customer("AS","UA",123);


        Project project1=new Project("HM",customer1);
        Project project2=new Project("DG",customer2);
        Project project3=new Project("SF",customer1);
        ProjectDAO.add( project1);
        ProjectDAO.add( project2);
        ProjectDAO.add( project3);
        System.out.println(ProjectDAO.getAll());

        Department department = new Department(DepartmentType.DESIGNER,employees1 );


        Employee employee_1 = new Employee("Andrii","A",new Date(),Position.DESIGNER,department,ProjectDAO.getAll());
        Employee employee_2 = new Employee("Ivan","B",new Date(),Position.ANALYST,department,ProjectDAO.getAll());
        Employee employee_3 = new Employee("Masha","C",new Date(),Position.ANALYST,department,ProjectDAO.getAll());

        EmployeeDAO.add(employee_1);
        EmployeeDAO.add(employee_2);
        EmployeeDAO.add(employee_3);

        Department department1 = new Department(DepartmentType.FINANCE,EmployeeDAO.getAll());
        Employee employee0 = new Employee("Sergio","A",new Date(),Position.DESIGNER,department1,ProjectDAO.getAll());
        EmployeeDAO.add(employee0);

        //System.out.println(Controller.employeesByProject("HM"));
      //  Controller.employeesByProject("SD");

    }
}
