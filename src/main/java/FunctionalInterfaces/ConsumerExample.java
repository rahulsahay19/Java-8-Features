package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

   static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student)-> System.out.println(student.getName());
    static Consumer<Student> c4 = (student)-> System.out.println(student.getActivities());
    public static void printName(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }
    public static void printNameAndActivities(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        //consumer chaining
        studentList.forEach(c3.andThen(c4));
    }
    public static void printNameAndActivitiesUsingCondition(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        //consumer chaining
        studentList.forEach((student)->{
            if(student.getGradeLevel()>=3){
                c3.andThen(c4).accept(student);
            }
        });
    }
    public static void main(String[] args) {
        Consumer<String> c1 = (s)->{
            System.out.println(s.toUpperCase());
        };
        c1.accept("rahul");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
