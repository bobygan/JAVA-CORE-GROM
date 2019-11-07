package lesson29.homework;

import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        useHashSet();

    }

    public static void useHashSet() {
        Order order1 = new Order(23, 23, "euro", "as", "pl");
        Order order2 = new Order(24, 23, "euro", "as", "pl");
        Order order3 = new Order(21, 23, "euro", "as", "pl");
        Order order4 = new Order(23, 23, "euro", "as", "pl");
        Order order5 = new Order(88, 23, "euro", "as", "pl");

        Set<Order> set = new HashSet<>();
        System.out.println(set);
        set.add(order1);
        set.add(order1);
        System.out.println(set);
        set.add(order2);
        System.out.println(set);
        set.add(order3);
        set.add(order4);
        Set<Order> setForRetail = new HashSet<>();
        setForRetail.add(order1);
        setForRetail.add(order5);

        System.out.println(set);
        set.remove(order2);
        System.out.println(set);
        System.out.println(set.size());
        set.retainAll(setForRetail);
        System.out.println(set);

        Order[] Array = set.toArray(new Order[set.size()]);
        System.out.println(Arrays.deepToString(Array));
        set.add(order1);
        set.add(order1);
        set.add(order2);
        set.add(order3);
        set.add(order4);
        set.add(order5);

        Iterator<Order> orderIterator = set.iterator();
        while (orderIterator.hasNext()) {
            System.out.println(orderIterator.next().getId());
        }
        System.out.println(set);

    }


}
