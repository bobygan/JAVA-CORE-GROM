package lesson30.homework2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProjectDAO {


    private static TreeSet<Project> projectSet = new TreeSet<>();


    public static Project add(Project p) {
        projectSet.add(p);
        return p;
    }

    public static TreeSet<Project> getAll() {
        return projectSet;
    }

    public static void print() {
        Iterator<Project> iterator = projectSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }
}
