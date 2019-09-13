package lesson10.polyexample;

public class Demo {
    public static void main(String[] args) {
        Human human=new Human("Test");

          run(human);
        System.out.println();

          User user= new User("Jack");
          run(user);


          //проверка методов
        System.out.println();
        System.out.println("проверка методов");
        Child child=new Child("beby");
        Child child1=new Child(null);

        System.out.println();
        System.out.println("проверка child");
        child1.run();
        run(child);


    }
    private static void run (Human human){
        human.run();
    }
}
