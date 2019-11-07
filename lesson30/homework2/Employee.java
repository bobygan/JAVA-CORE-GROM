package lesson30.homework2;


import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Employee {
  private   String firstName;
   private String lastName;
   private Date dateHired;
   private Position position;// - enam (TEAM_LEAD, DEVELOPER, FINANCE, ANALYST, MANAGER, DESIGNER, LEAD_DESIGNER и тд.)
   private Department department;
   private Set <Project> projectArrayList;


    public Employee(String firstName, String lastName, Date dateHired, Position position, Department department, Set<Project> projectArrayList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateHired = dateHired;
        this.position = position;
        this.department = department;
        this.projectArrayList = projectArrayList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public Position getPosition() {
        return position;
    }

    public Department getDepartment() {
        return department;
    }

    public Set<Project> getProjectArrayList() { return projectArrayList; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        if (dateHired != null ? !dateHired.equals(employee.dateHired) : employee.dateHired != null) return false;
        return position == employee.position;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (dateHired != null ? dateHired.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateHired=" + dateHired +
                ", position=" + position +
                ", department=" + department +
                ", projectArrayList=" + projectArrayList +
                '}';
    }
}
