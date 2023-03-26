package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {
    public static int performMult(List<Integer> integerList){
        return integerList.stream()
                //Values will be passed in this stream
                //1
                //3
                //5
                //7
                //a=1, b=1, result = 1
                //a=1, b=3, result = 3 ...
                .reduce(1, (a,b)->a*b);
    }
    public static Optional<Integer> performMultWithoutIdentity(List<Integer> integerList){
        return integerList.stream()
                //Values will be passed in this stream
                //1
                //3
                //5
                //7
                //a=1, b=1, result = 1
                //a=1, b=3, result = 3 ...
                .reduce((a,b)->a*b);
    }
    public static Optional<Student> getHighestGpaStudent(){
       return StudentDataBase.getAllStudents()
                .stream()
                .reduce((s1, s2) ->{
                    if(s1.getGpa()>s2.getGpa()){
                        return s1;
                    }else{
                        return s2;
                    }
                });
    }
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        System.out.println(performMult(integers));
        Optional<Integer> result = performMultWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());
        Optional<Student> studentOptional = getHighestGpaStudent();
        if(getHighestGpaStudent().isPresent()){
            System.out.println(studentOptional.get());
        }
    }
}
