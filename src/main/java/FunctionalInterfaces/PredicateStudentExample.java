package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (student -> student.getGradeLevel()>=3);
    static Predicate<Student> p2 = (student -> student.getGpa()>=3.9);
    public static void filterStudentsByGrade(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            //Lambda body
            if(p1.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudentsByGpa(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            //Lambda body
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudents(){
        System.out.println("Filtering Students with predicate chaining....");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            //Lambda body
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        });
    }
    public static void main(String[] args) {
        filterStudents();
        //filterStudentsByGrade();
        //System.out.println("GPA Level");
        //filterStudentsByGpa();
    }
}
