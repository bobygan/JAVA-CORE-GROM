package lesson25.homework3;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {


        GeneralDAO<Order> OrderDAO = new GeneralDAO<>();
       // GeneralDAO<String> StrimgDAO = new GeneralDAO<>();
     //   GeneralDAO<Tool> ToolDAO = new GeneralDAO<>();
    //    GeneralDAO<TestClass> TestDAO = new GeneralDAO<>();


        OrderDAO.save(new Order(34));
        System.out.println(Arrays.deepToString(OrderDAO.getAll()));


    }

    public static class Order {
        private long id;

        public Order(long id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "id=" + id +
                    '}';
        }
    }


    public static class Tool {
        private String name;
        private String description;

        public Tool(String name, String description) {
            this.name = name;
            this.description = description;
        }

        @Override
        public String toString() {
            return "Tool{" +
                    "name='" + name + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    public static class TestClass<T, K, V> {

        T doSomething1(T t) {
            System.out.println("1");
            return t;
        }

        K doSomething2(K k) {
            System.out.println("2");
            return k;
        }

        V doSomething3(V v) {
            System.out.println("3");
            return v;
        }


    }
}


