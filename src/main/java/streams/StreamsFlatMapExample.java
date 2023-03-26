package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {
    public static List<String> printStudentActivities(){
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream of students
                .map(Student::getActivities) //Stream<List<String>>
                //Flat map used in a scenario where in each and every item in the stream represents an Array or List
                .flatMap(List::stream) //Stream<String>
                .distinct() //prints unique ones
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static long printStudentActivitiesCount(){
        long studentActivitiesCount = StudentDataBase.getAllStudents().stream() //Stream of students
                .map(Student::getActivities) //Stream<List<String>>
                //Flat map used in a scenario where in each and every item in the stream represents an Array or List
                .flatMap(List::stream) //Stream<String>
                .distinct() //prints unique ones
                .count();
        return studentActivitiesCount;
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(printStudentActivitiesCount());
    }
}
