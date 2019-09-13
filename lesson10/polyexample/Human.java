package lesson10.polyexample;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    void run(){
        System.out.println("Human class  is called ...");
        if (name!=null){
        System.out.println(name+"is runing");}
        else {
            System.out.println("name не инициализировался !!!!!!!!!!");
        }
    }
}
