package streams;

import data.StudentDataBase;

public class StreamMatchExample {
    public static boolean allMatch(){
        return StudentDataBase.getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa()>=3.5);
    }

    public static void main(String[] args) {
        System.out.println("Result of all Match:" +allMatch());
    }
}
