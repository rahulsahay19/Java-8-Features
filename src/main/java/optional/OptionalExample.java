package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {
    public static String getStudentName(){
        Student student = StudentDataBase.studentSupplier.get();
        if(student!=null){
            return student.getName();
        }
        return null;
    }

    public static Optional<String> getStudentNameOptional(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);
        }
        //Otherwise returns optional with no value
        return Optional.empty();
    }

    public static void main(String[] args) {
        String name = getStudentName();
        System.out.println("Length of the student name: " + name.length());
        Optional<String> stringOptional = getStudentNameOptional();
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }
    }
}
