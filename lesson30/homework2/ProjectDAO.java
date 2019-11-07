package lesson30.homework2;


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class ProjectDAO {


    Customer customerIvan = new Customer("Ivan", "UA", 120);


    private static Set<Project> projectSet = new TreeSet<>();

    //  Project projectFirst = new Project("FIRST", customerIvan);
    //Project projectSecond = new Project("SECOND", CustomerDAO.customerJon);

    //  projectArrayList.add(projectFirst);
    // projectArrayList.add(projectSecond);

    public static Project add(Project p) {
        projectSet.add(p);
        return p;
    }

    public static Set<Project> getAll() {
        return projectSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectDAO)) return false;

        ProjectDAO that = (ProjectDAO) o;

        return customerIvan != null ? customerIvan.equals(that.customerIvan) : that.customerIvan == null;

    }

    @Override
    public int hashCode() {
        return customerIvan != null ? customerIvan.hashCode() : 0;
    }
}
