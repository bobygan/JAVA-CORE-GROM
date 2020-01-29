package lesson30.homework3;


import java.util.Iterator;
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
        TreeSet<Project> Temp = new TreeSet<>();
        for (Employee temp:employeeTreeSet){
            if (temp.equals(employee)) {
                Temp.addAll(temp.getProjectSet());
            }
        }
        return Temp;

    }

    public static TreeSet<Employee> employeesByDepartmentWithoutProject(DepartmentType departmentType) {
        TreeSet<Employee> Temp = new TreeSet<>();
        for (Employee temp:employeeTreeSet) {
            if (temp.getDepartment().getType().equals(departmentType)) {
                if (temp.getProjectSet().isEmpty()) {
                    Temp.add(temp);
                }
            }
        }
        return Temp;
    }

    public static TreeSet<Employee> employeesWithoutProject() {
        TreeSet<Employee> Temp = new TreeSet<>();
        for (Employee temp:employeeTreeSet) {
            if (temp.getProjectSet().isEmpty()) {
                Temp.add(temp);
            }
        }
        return Temp;
    }

    public static TreeSet<Employee> employeesByTeamLead(Employee lead) {
        if (lead.getPosition() != Position.TEAM_LEAD) {
            return null;
        }
        TreeSet<Employee> Temp = new TreeSet<>();
        for (Employee temp:employeeTreeSet) {
            Temp.add(temp);
        }
        return Temp;
    }


    public static TreeSet<Employee> teamLeadsByEmployee(Employee employee) {


       // &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        if (employee.getPosition() == Position.TEAM_LEAD) {
            return null;
        }
        TreeSet<Employee> Temp = new TreeSet<>();

        for (Employee tempEmployee:employeeTreeSet) {

            for (Project tempProject:tempEmployee.getProjectSet()) {
                if (tempEmployee.getPosition() == Position.TEAM_LEAD) {

                    for (Project tempProjectN:tempEmployee.getProjectSet()) {
                        if (tempProjectN == tempProject) {
                            Temp.add(tempEmployee);
                        }
                    }
                }
            }


        }
        return Temp;
    }





    public static TreeSet<Employee> employeesByProjectEmployee(Employee employe) {
        TreeSet<Employee> Temp = new TreeSet<>();
        for (Employee tempEmployee:employeeTreeSet) {

            for (Project tempProject:tempEmployee.getProjectSet()) {

                for (Project tempProjectN:tempEmployee.getProjectSet()) {
                    if (tempProject.equals(tempProjectN)) {
                        Temp.add(tempEmployee);
                    }
                }
            }
        }
        return Temp;
    }


    public static TreeSet<Project> projectsByCustomer (Customer customer){
        TreeSet<Project> Temp = new TreeSet<>();
        for (Employee tempEmployee:employeeTreeSet) {
            for (Project projectTemp:tempEmployee.getProjectSet()) {
                if (projectTemp.getCustomer().equals(customer)) {
                    Temp.add(projectTemp);
                }
            }
        }
        return Temp;
    }



    public static TreeSet<Employee> employeesByCustomerProjects (Customer customer){
        TreeSet<Employee> Temp = new TreeSet<>();
        for (Employee tempEmployee:employeeTreeSet) {
            for (Project projectTemp:tempEmployee.getProjectSet()) {
                if (projectTemp.getCustomer().equals(customer)) {
                    Temp.add(tempEmployee);
                }
            }
        }
        return Temp;
    }
}




