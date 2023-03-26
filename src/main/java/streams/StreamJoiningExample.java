package streams;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamJoiningExample {

    public static String JoiningExample(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    public static void main(String[] args) {
        System.out.println("Joining Example: " + JoiningExample());
    }
}
