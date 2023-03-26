package streams;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduceExample {
    private static int noOfNoteBooks(){
        Integer noOfNoteBooks = StudentDataBase.getAllStudents()
                .stream()//Stream<Student>
                .map(Student::getNoteBooks)//Stream<Integer>
                .reduce(0, (a, b) -> a + b);
        return noOfNoteBooks;
    }
    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }
}
