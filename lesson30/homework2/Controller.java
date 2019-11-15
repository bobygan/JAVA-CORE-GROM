package lesson30.homework2;


import java.util.*;

public class Controller {


    public static TreeSet<Employee> employeesByProject(String projectName) {
        System.out.println( EmployeeDAO.getAll());
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();

        while (employeeIterator.hasNext()) {
            System.out.println(employeeIterator.next().getFirstName());
            System.out.println("dane");
            Iterator<Project> projectIterator = employeeIterator.next().getProjectSet().iterator();
            while (projectIterator.hasNext()) {

                if (projectIterator.next().getName()==(projectName)) {
                    Temp.add(employeeIterator.next());
                }
            }
        }
        return Temp;
    }


    public static TreeSet<Project> projectsByEmployee(Employee employee) {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Project> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {

            if (employeeIterator.next().equals(employee)) {
                if(employeeIterator.next().getProjectSet().isEmpty())
                {return null;}
                Temp.addAll(employeeIterator.next().getProjectSet());
            }
        }
        return Temp;

    }

    public static TreeSet<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
           if (employeeIterator.next().getDepartment().getType().equals(departmentType) ){
               System.out.println("dane");
               if(employeeIterator.next().getProjectSet().isEmpty()){
                   Temp.add(employeeIterator.next());
               }
            }
        }
        return Temp;
    }


    public static TreeSet<Employee> employeesWithoutProject() {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
                if ( employeeIterator.next().getProjectSet().isEmpty()) {
                    Temp.add(employeeIterator.next());
                }
            }
        return Temp;
    }

    public static TreeSet<Employee> employeesByTeamLead(Employee lead) {
        if (lead.getPosition() != Position.TEAM_LEAD) {
            return null;
        }
        Iterator<Employee> employeeIterator = lead.getDepartment().getEmployees().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
            Temp.add(employeeIterator.next());
        }
        return Temp;
    }


    public static TreeSet<Employee> teamLeadsByEmployee(Employee employee) {
        if (employee.getPosition() == Position.TEAM_LEAD) {
            return null;
        }
        TreeSet<Employee> Temp = new TreeSet<>();
        Iterator<Project> projectIterator = employee.getProjectSet().iterator();
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        while (projectIterator.hasNext()) {

            while (employeeIterator.hasNext()) {
                if (employeeIterator.next().getPosition() == Position.TEAM_LEAD) {
                    Iterator<Project> projectIterator1 = employee.getProjectSet().iterator();
                    while (projectIterator1.hasNext()) {
                        if(projectIterator1.next()==projectIterator.next()){
                            Temp.add(employeeIterator.next());
                            System.out.println("выбор");
                        }
                    }
                }
            }


        }
        return Temp;
    }


    public static TreeSet<Employee> employeesByProjectEmployee(Employee employee) {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
            Iterator<Project> projectIterator = employeeIterator.next().getProjectSet().iterator();
            Iterator<Project> projectIterator1 = employee.getProjectSet().iterator();
            while (projectIterator.hasNext()) {
                System.out.println("итератор");
                while (projectIterator1.hasNext()) {
                    if (projectIterator.next().getName().equals(projectIterator1.next().getName())) {
                        Temp.add(employeeIterator.next());
                        System.out.println("выбор");
                    }
                }
            }
        }
        return Temp;
    }


    public static TreeSet<Project> projectsByCustomer(Customer customer) {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Project> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
            Iterator<Project> projectIterator = employeeIterator.next().getProjectSet().iterator();

            while (projectIterator.hasNext()) {
                System.out.println("итератор");
                if (projectIterator.next().getCustomer().equals(customer)) {
                    Temp.add(projectIterator.next());
                    System.out.println("выбор");
                }
            }
        }
        return Temp;
    }

    public static TreeSet<Employee> employeesByCustomerProjects(Customer customer) {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
            Iterator<Project> projectIterator = employeeIterator.next().getProjectSet().iterator();

            while (projectIterator.hasNext()) {
                System.out.println("итератор");
                if (projectIterator.next().getCustomer().equals(customer)) {
                    Temp.add(employeeIterator.next());
                    System.out.println("выбор");
                }
            }
        }
        return Temp;
    }


}

