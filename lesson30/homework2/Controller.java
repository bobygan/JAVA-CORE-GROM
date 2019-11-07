package lesson30.homework2;

import lesson29.homework.Order;

import java.util.*;

public class Controller {

    private static TreeSet<Employee> employeeTreeSet = new TreeSet<>();


    public static TreeSet<Employee> employeesByProject(String projectName) {
        System.out.println("jfnjhd");
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
            System.out.println("while");
            Iterator<Project>projectIterator=employeeIterator.next().getProjectArrayList().iterator();

            while (projectIterator.hasNext()) {
                System.out.println("итератор");
                if (projectIterator.next().getName().equals(projectName)) {
                    Temp.add(employeeIterator.next());
                    System.out.println("выбор");
                }
            }
        }
        return Temp;
    }


    public static ArrayList<Project> projectsByEmployee(Employee employee) {
        Iterator<Employee> employeeIterator = employeeTreeSet.iterator();
        ArrayList<Project> Temp = new ArrayList<>();
        while (employeeIterator.hasNext()) {
            if (employeeIterator.next().equals(employee)) {
                Temp.addAll(employeeIterator.next().getProjectArrayList());
            }
        }
        return Temp;

    }

    public TreeSet<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) {

        return null;
    }

    public TreeSet<Employee> employeesWithoutProject() {
        Iterator<Employee> employeeIterator = employeeTreeSet.iterator();
        TreeSet<Employee> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
            for (int i = 0; i > employeeIterator.next().getProjectArrayList().size(); i++) {
                if (employeeIterator.next().getProjectArrayList() != null) {
                    Temp.add(employeeIterator.next());
                }
            }
        }
        return Temp;
    }


    public Employee employeesByTeamLead(Employee lead) {
        return null;
    }

    public Employee teamLeadsByEmployee(Employee employee) {
        return null;
    }

    public Employee employeesByProjectEmployee(Employee employee) {
        return null;
    }

    public Project projectsByCustomer(Customer customer) {
        return null;
    }

    public Employee employeesByCustomerProjects(Customer customer) {
        return null;
    }


}

