package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
    public static List<Student> sortStudentsByName(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentsByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }
    public static List<Student> sortStudentsByGpaDesc(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(sortStudentsByName());
        System.out.println("Sorting By Name");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Sorting By GPA");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("Sorting By GPA Desc");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }
}
