package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class StreamsGroupByExample {

    public static void groupStudentsByGender(){
        Map<String, List<Student>> listOfStudents = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println(listOfStudents);
    }
    public static void customizedGrouping(){
        Map<String, List<Student>> listOfStudents = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa()>=3.8?"Outstanding":"Average"));

        System.out.println(listOfStudents);
    }
    public static void twoLevelGrouping(){
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        groupingBy(student -> student.getGpa() >= 3.8 ? "Outstanding" : "Average")));
        System.out.println(studentMap);
    }
    public static void main(String[] args) {
        groupStudentsByGender();
        customizedGrouping();
        twoLevelGrouping();
    }
}
