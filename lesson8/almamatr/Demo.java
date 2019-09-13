package lesson8.almamatr;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {

    }
        Course[] coursesArrey = new Course[10];
        Student[] studentsArrey = new Student[10];
        Date date = new Date();


        Student  createHighestParent() {
            Student student = new Student("A", "B", 12,coursesArrey);
            return student;
         }


         SpecialStudent createLowestChild() {
                SpecialStudent specialStudent = new SpecialStudent("A", "P", 23, coursesArrey, 23, "wer");
           return specialStudent;
            }
    }




