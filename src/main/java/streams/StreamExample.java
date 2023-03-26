package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //List student and their activities in a map
        Predicate<Student> getStudentPredicate = (student) -> student.getGradeLevel() >= 3;
        Predicate<Student> getStudentGpaPredicate = (student) -> student.getGpa() >= 3.9;
        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(getStudentPredicate)
                .filter(getStudentGpaPredicate)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }


}
