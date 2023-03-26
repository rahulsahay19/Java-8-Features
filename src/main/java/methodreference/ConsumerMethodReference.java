package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {
    static Consumer<Student> c1 = p-> System.out.println(p);
    static Consumer<Student> c2 = System.out::println;
    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        StudentDataBase.getAllStudents().forEach(c2);
    }
}
