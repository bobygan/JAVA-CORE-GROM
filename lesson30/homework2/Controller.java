package lesson30.homework2;


import java.util.*;

public class Controller {


    public static TreeSet<Employee> employeesByProject(String projectName) {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();

        while (employeeIterator.hasNext()) {
            Employee employeeTemp = employeeIterator.next();
            Iterator<Project> projectIterator = employeeTemp.getProjectSet().iterator();
            while (projectIterator.hasNext()) {
                Project projectTemp = projectIterator.next();
                if (projectTemp.getName() == (projectName)) {
                    Temp.add(employeeTemp);
                }
            }
        }
        return Temp;
    }


    public static TreeSet<Project> projectsByEmployee(Employee employee) {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Project> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
            Employee employeeTemp = employeeIterator.next();
            if (employeeTemp.equals(employee)) {
                Temp.addAll(employeeTemp.getProjectSet());
            }
        }
        return Temp;

    }

    public static TreeSet<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
            Employee employeeTemp = employeeIterator.next();
            if (employeeTemp.getDepartment().getType().equals(departmentType)) {
                if (employeeTemp.getProjectSet().isEmpty()) {
                    Temp.add(employeeTemp);
                }
            }
        }
        return Temp;
    }


    public static TreeSet<Employee> employeesWithoutProject() {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();

        while (employeeIterator.hasNext()) {
            Employee employeeTemp = employeeIterator.next();
            if (employeeTemp.getProjectSet().isEmpty()) {
                Temp.add(employeeTemp);
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
                Employee employeeTemp = employeeIterator.next();
                if (employeeTemp.getPosition() == Position.TEAM_LEAD) {
                    Iterator<Project> projectIterator1 = employee.getProjectSet().iterator();
                    while (projectIterator1.hasNext()) {
                        if (projectIterator1.next() == projectIterator.next()) {
                            Temp.add(employeeTemp);
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
            Employee employeeTemp = employeeIterator.next();
            Iterator<Project> projectIterator = employeeTemp.getProjectSet().iterator();
            Iterator<Project> projectIterator1 = employee.getProjectSet().iterator();
            while (projectIterator.hasNext()) {
                System.out.println("итератор");
                while (projectIterator1.hasNext()) {
                    if (projectIterator.next().getName().equals(projectIterator1.next().getName())) {
                        Temp.add(employeeTemp);
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
            Employee employeeTemp = employeeIterator.next();
            Iterator<Project> projectIterator = employeeTemp.getProjectSet().iterator();

            while (projectIterator.hasNext()) ;
            Project projectTemp=projectIterator.next();
                if (projectTemp.getCustomer().equals(customer)) {
                    Temp.add(projectTemp);
                }
            }
        return Temp;
    }

    public static TreeSet<Employee> employeesByCustomerProjects(Customer customer) {
        Iterator<Employee> employeeIterator = EmployeeDAO.getAll().iterator();
        TreeSet<Employee> Temp = new TreeSet<>();
        while (employeeIterator.hasNext()) {
            Employee employeeTemp = employeeIterator.next();
            Iterator<Project> projectIterator = employeeTemp.getProjectSet().iterator();

            while (projectIterator.hasNext()) {

                if (projectIterator.next().getCustomer().equals(customer)) {
                    Temp.add(employeeTemp);
                }
            }
        }
        return Temp;
    }


}

