package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;

public class StreamsPartitioningByExample {
    public static void partitionByExample(){
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;

        Map<Boolean, List<Student>> listMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println(listMap);
    }

    public static void main(String[] args) {
        partitionByExample();
    }
}
