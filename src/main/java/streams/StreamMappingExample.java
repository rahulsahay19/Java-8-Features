package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamMappingExample {
    public static void main(String[] args) {
        List<String> namesList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toList()));
        System.out.println("NamesList: "+ namesList);

    }
}
