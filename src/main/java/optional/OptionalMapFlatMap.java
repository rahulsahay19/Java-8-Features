package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMap {
    public static void optionalFilter(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional
                .filter(student -> student.getGpa()>=3.5)
                .ifPresent(student -> System.out.println(student));
    }
    public static void optionalMapFlatMap(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.getOptionalStudent().get());
        Optional<String> name = studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .flatMap(Student::getBike) //In the optional context, it will fetch optional value from another optional object
                .map(Bike::getName);
        System.out.println(name);
        name.ifPresent(student-> System.out.println("name: " +student));
    }
    public static void main(String[] args) {
        optionalFilter();
        optionalMapFlatMap();
    }
}
