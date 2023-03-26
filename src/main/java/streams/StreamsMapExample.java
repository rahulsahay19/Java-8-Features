package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
    public static List<String> nameslist(){
       List<String> studentList =  StudentDataBase.getAllStudents()
                .stream()
                //Input as Student
                //Output as Student name
               //map is used to convert from one type to another
                .map(Student::getName)
               .map(String::toUpperCase)
                .collect(Collectors.toList());
       return studentList;
    }

    public static Set<String> namesSet(){
        Set<String> studentSet =  StudentDataBase.getAllStudents()
                .stream()
                //Input as Student
                //Output as Student name
                //map is used to convert from one type to another
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        return studentSet;
    }
    public static void main(String[] args) {
        System.out.println(nameslist());
        System.out.println(namesSet());
    }
}
