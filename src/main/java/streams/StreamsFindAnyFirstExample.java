package streams;

import data.Student;
import data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class StreamsFindAnyFirstExample {
    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public static void main(String[] args) {
        Optional<Student> anyStudent = findAnyStudent();
        if(anyStudent.isPresent()){
            System.out.println(anyStudent.get());
        }else{
            System.out.println("Not Present");
        }
    }
}
