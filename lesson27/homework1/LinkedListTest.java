package lesson27.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListTest {
    public LinkedListTest() {
    }

    public static void useList() {
        LinkedList<Order> list = new LinkedList<>();
        LinkedList<Order> list1 = new LinkedList<>();
        Order order1 = new Order(1, 12, "Andrii", "Ivan", "tid");
        Order order2 = new Order(2, 12, "Andrii", "Ivan", "tid");
        Order order3 = new Order(3, 12, "Andrii", "Ivan", "tid");
        Order order4 = new Order(3, 12, "Andrii", "Ivan", "tid");


        list.add(order1);//добавить
        System.out.println(list);
        list.add(1, order1); //обавить по индексу
        System.out.println(list);
        list.add(2, order2);
        System.out.println(list);
        list.remove(0); //удалить по индексу
        System.out.println(list);
        list.remove(order2);//удалить при совпадении
        System.out.println(list);
        list.addAll(list);//добавить коллекцию
        System.out.println(list);
        list.add(order3);//добавить
        System.out.println(list);
        System.out.println(list.subList(0, 1));//возвращает выделенную часть массива
        System.out.println(list1);
        list.set(1, order2);//замена элемента
        System.out.println(list);
        //list.contains(order1);//определяет, есть ли элемент в множестве
        System.out.println(list.contains(order1));
        System.out.println(list.contains(order4));
        Object[] objects = list.toArray(new Object[list.size()]);
        System.out.println(Arrays.deepToString(objects));
        list.clear();
        System.out.println(list);
    }


}

