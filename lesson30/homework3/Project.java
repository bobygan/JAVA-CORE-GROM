package lesson30.homework3;

public class Project  implements Comparable<Project>{
    private String name;
    private Customer customer;



    public Project(String name, Customer customer) {
        this.name = name;
        this.customer = customer;
    }
    public String getName() {
        return name;
    }

    public Customer getCustomer() {
        return customer;
    }


    @Override
    public int compareTo(Project o) {
        return 1;
    }



    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project)) return false;

        Project project = (Project) o;

        if (!name.equals(project.name)) return false;
        return customer.equals(project.customer);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + customer.hashCode();
        return result;
    }
}
