package jdk8.streams;

import static java.util.stream.Collectors.toList;

import java.util.Comparator;
import java.util.List;

import jdk8.streams.example.data.Student;
import jdk8.streams.example.data.StudentDataBase;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName(){

       return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpa(){

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpaReversed(){

        return  StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by NAME");
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by GPA");
         sortStudentsByGpa().forEach(System.out::println);

        System.out.println("Students sorted by GPA Higher to Lower");
        sortStudentsByGpaReversed().forEach(System.out::println);

    }
}
