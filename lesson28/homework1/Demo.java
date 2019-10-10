package lesson28.homework1;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Capability capability1 = new Capability(101, "AS", "AS", true, new Date());
        Capability capability2 = new Capability(106, "AS", "AS", true, new Date());
        Capability capability3 = new Capability(10, "AS", "AS", true, new Date());
        Capability capability4 = new Capability(1000, "AS", "AS", true, new Date());
        Capability capability5 = new Capability(103, "AS", "AS", true, new Date());


        Set<Capability> set = new TreeSet<>();
        set.add(capability1);
        set.add(capability2);
        set.add(capability3);
        set.add(capability4);
        set.add(capability5);
        System.out.println(set);

    }
}
