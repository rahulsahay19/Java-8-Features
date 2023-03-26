package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {
   static Consumer<Student> studentConsumer = (student -> System.out.println(student));
   static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
   static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
   public static void sortByName(List<Student> studentList){
       System.out.println("After sort");
       Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
       studentList.sort(nameComparator);
       studentList.forEach(studentConsumer);
   }
    public static void sortByGpa(List<Student> studentList){
        System.out.println("After sort");
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }
    public static void comparatorChaining(List<Student> studentList){
        System.out.println("After Comparator Chaining");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        //System.out.println(studentList);
        System.out.println("Before Sort!!!");
        studentList.forEach(studentConsumer);
        sortByName(studentList);
        sortByGpa(studentList);
        comparatorChaining(studentList);
    }
}
