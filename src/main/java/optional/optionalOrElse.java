package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class optionalOrElse {
    public static String optionalOrElse(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptionalNull = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }
    public static void main(String[] args) {
        System.out.println(optionalOrElse());

    }
}
